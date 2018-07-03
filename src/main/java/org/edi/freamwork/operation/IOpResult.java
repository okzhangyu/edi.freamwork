package org.edi.freamwork.operation;

import org.edi.freamwork.bo.IBusinessObject;

import java.util.List;

public interface IOpResult<T extends IBusinessObject> {

    /**
     * 获取结果编码
     * @return
     */
    Integer getCode();

    /**
     * 设置结果编码值
     * @param value
     */
    void setCode(Integer value);

    /**
     * 获取第三方id值
     * @return
     */
    String getThirdId();

    /**
     * 设置第三方Id值
     */
    void setThirdId(String value);

    /**
     * 获取结果消息
     * @return
     */
    String getMessage();

    /**
     * 设置结果消息值
     * @param value
     */
    void setMessage(String value);

    /**
     * 获取结果对象集合
     * @return
     */
    List<T> getResultObject();

    /**
     * 设置结果对象集合
     * @param value
     */
    void setResultObject(List<T> value);
}
