package org.edi.freamwork.log;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Fancy
 * @date 2018/6/2
 */
public enum LogFileName {
    YSYJ("ysyj"),
    AVA("ava");

    private String logFileName;

    LogFileName(String fileName) {
        this.logFileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public static LogFileName getAwardTypeEnum(String value) {
        LogFileName[] arr = LogFileName.values();
        for (LogFileName item : arr) {
            if (null != item && StringUtils.isNotBlank(item.logFileName)) {
                return item;
            }
        }
        return null;
    }
}
