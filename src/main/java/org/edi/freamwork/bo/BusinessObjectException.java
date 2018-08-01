package org.edi.freamwork.bo;

/**
 * @author Fancy
 * @date 2018/7/31
 */
public class BusinessObjectException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String code = "";

    public String getCode(){
        return code;
    }

    public BusinessObjectException() {
    }

    public BusinessObjectException(String message) {
        super(message);
    }

    public BusinessObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessObjectException(Throwable cause) {
        super(cause);
    }

    public BusinessObjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BusinessObjectException(String code,String message){
        super(message);
        this.code = code;
    }

}
