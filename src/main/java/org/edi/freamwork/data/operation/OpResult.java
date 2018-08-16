package org.edi.freamwork.data.operation;

import org.edi.freamwork.bo.IBusinessObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 操作结果类
 * @param <T>
 */
public class OpResult<T extends Object> implements IOpResult<T>{


    public OpResult(){
        this.resultObject = new ArrayList<T>();
    }

    public OpResult(String code, String message){
        this.code = code;
        this.message = message;
    }
    public OpResult(String code, String message,String thirdId){
        this.code = code;
        this.message = message;
        this.thirdId = thirdId;
    }

    public OpResult(String code, String message,String thirdId, List<T> data) {
        this.code = code;
        this.message = message;
        this.thirdId = thirdId;
        this.resultObject = data;
    }
    private String code;
    /**
     * 获取结果编码
     * @return
     */
    @Override
    public String getCode(){
        return code;
    }


    /**
     * 设置结果编码值
     * @param value
     */
    @Override
    public void setCode(String value){
        this.code = value;
    }

    private String thirdId;
    /**
     * 获取第三方id值
     * @return
     */
    @Override
    public String getThirdId(){
        return thirdId;
    }

    /**
     * 设置第三方Id值
     */
    @Override
    public void setThirdId(String value){
        this.thirdId = value;
    }

    private String message;
    /**
     * 获取结果消息
     * @return
     */
    @Override
    public String getMessage(){
        return message;
    }

    /**
     * 设置结果消息值
     * @param value
     */
    @Override
    public void setMessage(String value){
        this.message = value;
    }

    private List<T> resultObject;
    /**
     * 获取结果对象集合
     * @return
     */
    @Override
    public List<T> getResultObject(){
        return this.resultObject;
    }

    /**
     * 设置结果对象集合
     * @param value
     */
    @Override
    public void setResultObject(List<T> value){
        this.resultObject = value;
    }
}
