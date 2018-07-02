package org.edi.freamwork.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Fancy
 * @date 2018/6/2
 */
public class LoggerUtils {
    public static <T> Logger Logger(Class<T> clazz) {
        return LoggerFactory.getLogger(clazz);
    }

    /**
     * 打印到指定的文件下
     *
     * @param desc 日志文件名称
     * @return
     */
    public static Logger Logger(LogFileName desc) {
        return LoggerFactory.getLogger(desc.getLogFileName());
    }

    public static Logger Logger(String strPath){
        return  LoggerFactory.getLogger(strPath);
    }
}
