package org.edi.freamwork.bo;

import org.edi.freamwork.data.operation.OpResultCode;
import org.edi.freamwork.data.operation.OpResultDescription;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fancy
 * @date 2018/8/2
 */
public class DocumentBO extends BusinessObject implements IDocumentBO {


    public DocumentBO(){
        initBO();
    }

    private String companyName;
    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void initBO() {
    }


    @Override
    public void checkBO() {
        super.checkBO();
        if(this.getCompanyName() == null || this.getCompanyName().isEmpty()){
            throw new BusinessObjectException(OpResultCode.OBJECT_COMPANY_IS_NULL,
                    OpResultDescription.OBJECT_COMPANY_IS_NULL);
        }
    }


}
