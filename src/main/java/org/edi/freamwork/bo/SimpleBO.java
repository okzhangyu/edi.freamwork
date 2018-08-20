package org.edi.freamwork.bo;

/**
 * @author Fancy
 * @date 2018/8/2
 */
public class SimpleBO implements ISimpleBO {

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
