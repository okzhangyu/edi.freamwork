package org.edi.freamwork.transcation;

public interface ITranscationResult {

    public String getErrorCode();
    public void setErrorCode(String errorCode);

    public String getMessage();
    public void setMessage(String message);

}
