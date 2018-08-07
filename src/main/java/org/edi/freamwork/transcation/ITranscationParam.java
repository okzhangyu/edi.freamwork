package org.edi.freamwork.transcation;

public interface ITranscationParam {

    public String getObjectType();
    public void setObjectType(String objectType);

    public String getTranscationType();
    public void setTranscationType(String transcationType);

    public Integer getNumberOfKey();
    public void setNumberOfKey(Integer numberOfKey);

    public String getNameOfKey();
    public void setNameOfKey(String nameOfKey);

    public String getValueOfKey();
    public void setValueOfKey(String valueOfKey);
}
