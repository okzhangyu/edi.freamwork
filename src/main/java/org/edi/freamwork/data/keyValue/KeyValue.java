package org.edi.freamwork.data.keyValue;

/**
 * @author Fancy
 * @date 2018/7/19
 */
public class KeyValue implements IKeyValue{

    private String key;
    private Object value;
    public KeyValue(String key,Object value){
        this.key = key;
        this.value = value;
    }

    @Override
    public final String getKey() {
        return this.key;
    }

    @Override
    public final void setKey(String value) {
        this.key = value;
    }

    @Override
    public final Object getValue() {
        return this.value;
    }

    @Override
    public final void setValue(Object value) {
        this.value = value;
    }
}
