package org.edi.freamwork.operation;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import org.edi.freamwork.bo.IBusinessObject;

import java.util.List;

/**
 * 操作结果类
 * @param <T>
 */
public class OpResult<T extends IBusinessObject> implements IOpResult<T>{

    private Integer code;
    /**
     * 获取结果编码
     * @return
     */
    public Integer getCode(){
        return code;
    }


    /**
     * 设置结果编码值
     * @param value
     */
    @Override
    public void setCode(Integer value){
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
    public void setThirdId(String value){
        this.thirdId = value;
    }

    private String message;
    /**
     * 获取结果消息
     * @return
     */
    public String getMessage(){
        return message;
    }

    /**
     * 设置结果消息值
     * @param value
     */
    public void setMessage(String value){
        this.message = value;
    }

    private List<T> resultObject;
    /**
     * 获取结果对象集合
     * @return
     */
    public List<T> getResultObject(){
        return this.resultObject;
    }

    /**
     * 设置结果对象集合
     * @param value
     */
    public void setResultObject(List<T> value){
        this.resultObject = value;
    }
}
