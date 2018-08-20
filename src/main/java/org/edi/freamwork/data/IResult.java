package org.edi.freamwork.data;

import java.util.List;

/**
 * @author Fancy
 * @date 2018/8/20
 */
public interface IResult<T> {
    public String getCode();
    public void setCode(String value);

    public String getMessage();
    public void setMessage(String value);

    public List<T> getData();
    public void setData(List<T> value);
}
