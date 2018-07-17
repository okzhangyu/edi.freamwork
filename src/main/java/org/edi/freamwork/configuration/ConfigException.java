package org.edi.freamwork.configuration;

/**
 * @author Fancy
 * @date 2018/7/17
 */
public class ConfigException extends Exception {
    public ConfigException() {
        super();
    }

    public ConfigException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public ConfigException(String arg0) {
        super(arg0);
    }

    public ConfigException(Throwable arg0) {
        super(arg0);
    }
}
