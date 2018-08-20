package org.edi.freamwork.bo;

/**
 * @author Fancy
 * @date 2018/6/21
 */
public interface IBusinessObject extends IBOLogic,IBORules{
    /**
     * it's deleted
     * @return
     */
    String  getIsDeleted();

    void setIsDeleted(String value);
}
