package org.edi.freamwork.data;

/**
 * @author Fancy
 * @date 2018/7/19
 */
public class DataConvertException extends RuntimeException{
    public DataConvertException() {
    }

    public DataConvertException(String message) {
        super(message);
    }

    public DataConvertException(Throwable cause) {
        super(cause);
    }

    public DataConvertException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataConvertException(String message, Throwable cause, boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
