package org.edi.freamwork.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Fancy
 * @date 218/6/2
 */
public class APPLogger {

    private final static Logger logger = LoggerFactory.getLogger(APPLogger.class);

    public void ELogger(String infomation){
        logger.info(infomation);
        logger.error(infomation);
        logger.warn(infomation);
    }
}
