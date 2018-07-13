package org.edi.freamwork.exception;

/**
 * Created by asus on 2018/7/9.
 */
public class CustomizeException extends Exception{
    public CustomizeException() {
    }

    public CustomizeException(String message) {
        super(message);
    }

    public CustomizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomizeException(Throwable cause) {
        super(cause);
    }

    public CustomizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
