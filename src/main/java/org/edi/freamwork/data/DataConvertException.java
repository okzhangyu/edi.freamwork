package org.edi.freamwork.data;

/**
 * @author Fancy
 * @date 2018/7/19
 */
public class DataConvertException extends RuntimeException{

    private String code;
    private String message;
    public DataConvertException() {
    }

    public DataConvertException(String message) {
        super(message);
        this.message = message;
    }
    public DataConvertException(String code,String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public DataConvertException(Throwable cause) {
        super(cause);
    }

    public DataConvertException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public DataConvertException(String message, Throwable cause, boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message;
    }

    public String getCode(){
        return code;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
