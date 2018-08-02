package org.edi.freamwork.bo;

/**
 * @author Fancy
 * @date 2018/8/2
 */
public class BusinessObject implements IBusinessObject{

    private Boolean isDeleted;
    @Override
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @Override
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public void checkBO() {

    }
}
