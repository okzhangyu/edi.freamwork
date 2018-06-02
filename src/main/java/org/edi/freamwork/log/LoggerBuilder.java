package org.edi.freamwork.log;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.OptionHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fancy
 * @date 2018/6/2
 */
public class LoggerBuilder {
    private static final Map<String,Logger> container = new HashMap<>();

    public static Logger getLogger(String name) {
        Logger logger = container.get(name);
        if(logger != null) {
            return logger;
        }
        synchronized (LoggerBuilder.class) {
            logger = container.get(name);
            if(logger != null) {
                return logger;
            }
            logger = build(name);
            container.put(name,logger);
        }
        return logger;
    }

    private static Logger build(String name) {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        Logger logger = context.getLogger("FILE-" + name);
        //logger.setAdditive(false);
        RollingFileAppender appender = new RollingFileAppender();
        appender.setContext(context);
        appender.setName("FILE-" + name);
        appender.setFile(OptionHelper.substVars("${LOG_HOME}/web-log-" + name + ".log",context));
        appender.setAppend(true);
        appender.setPrudent(false);
        SizeAndTimeBasedRollingPolicy policy = new SizeAndTimeBasedRollingPolicy();
        String fp = OptionHelper.substVars("${LOG_HOME}/web-log-" + name + ".log.%d{yyyy-MM-dd}.%i",context);

        //policy.setMaxFileSize(FileSize.valueOf("128MB"));
        policy.setFileNamePattern(fp);
        policy.setMaxHistory(15);
        policy.setTotalSizeCap(FileSize.valueOf("32GB"));
        policy.setParent(appender);
        policy.setContext(context);
        policy.start();

        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(context);
        encoder.setPattern("%d{yyyy-MM-dd/HH:mm:ss.SSS}|%X{localIp}|[%t] %-5level %logger{50} %line - %m%n");
        encoder.start();

        appender.setRollingPolicy(policy);
        appender.setEncoder(encoder);
        appender.start();

        //logger.addAppender(appender);
        return logger;
    }
}
