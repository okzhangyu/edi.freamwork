package org.edi.freamwork.transcation;

public class TranscationParam implements ITranscationParam{

    private String objectType;

    @Override
    public String getObjectType() {
        return objectType;
    }

    @Override
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    private String transcationType;
    @Override
    public String getTranscationType() {
        return transcationType;
    }

    @Override
    public void setTranscationType(String transcationType) {
        this.transcationType = transcationType;
    }

    private Integer numberOfKey;
    @Override
    public Integer getNumberOfKey() {
        return numberOfKey;
    }

    @Override
    public void setNumberOfKey(Integer numberOfKey) {
        this.numberOfKey = numberOfKey;
    }

    private String nameOfKey;
    @Override
    public String getNameOfKey() {
        return nameOfKey;
    }

    @Override
    public void setNameOfKey(String nameOfKey) {
        this.nameOfKey = nameOfKey;
    }

    public String valueOfKey;
    @Override
    public String getValueOfKey() {
        return valueOfKey;
    }

    @Override
    public void setValueOfKey(String valueOfKey) {
        this.valueOfKey = valueOfKey;
    }
}
