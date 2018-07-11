package org.edi.freamwork.jersey;

/**
 * @author Fancy
 * @date 2018/7/11
 */
public class RequestException extends Exception{
    public RequestException() {
        super();
    }

    public RequestException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public RequestException(String arg0) {
        super(arg0);
    }

    public RequestException(Throwable arg0) {
        super(arg0);
    }
}
