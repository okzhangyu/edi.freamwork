package org.edi.freamwork.data;

import org.edi.freamwork.bo.BusinessObjectException;
import org.edi.freamwork.data.operation.OpResultCode;
import org.edi.freamwork.exception.AuthrizationException;
import org.edi.freamwork.exception.BusinessException;
import org.edi.freamwork.exception.DBException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fancy
 * @date 2018/8/20
 */
public class Result<T> implements IResult<T> {
    private String code;
    private String message;
    private List<T> data;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public void setCode(String value) {
        this.code = value;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(String value) {
        this.message = value;
    }

    @Override
    public List<T> getData() {
        return this.data;
    }

    @Override
    public void setData(List<T> value) {
        this.data = value;
    }

    public Result() {
        this.data = new ArrayList<>();
    }

    public Result(String code, String message, List<T> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(String code,String message){
        this.code = code;
        this.message = message;
    }

    public Result(String code,Exception e){
        this.code = code;
        this.message = (e.getCause()==null?e.getMessage():e.getCause().toString());
    }

    public Result(BusinessObjectException e){
        this.code = e.getCode();
        this.message =e.getMessage();
    }

    public Result(AuthrizationException e){
        this.code = e.getCode();
        this.message =e.getMessage();
    }

    public Result(DBException e){
        this.code = e.getCode();
        this.message = e.getMessage();
    }

    public Result(Exception e){
        this.code = OpResultCode.FAIL;
        this.message = e.getMessage();
    }


    public Result(BusinessException e){
        this.code = e.getCode();
        this.message = e.getMessage();
    }
}
