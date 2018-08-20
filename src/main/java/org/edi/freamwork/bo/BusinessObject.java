package org.edi.freamwork.bo;

/**
 * @author Fancy
 * @date 2018/8/2
 */
public class BusinessObject<T extends BusinessObject> implements IBusinessObject{

    private String isDeleted;
    @Override
    public String getIsDeleted() {
        return isDeleted;
    }

    @Override
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }


    @Override
    public void checkBO() {

    }
}
