package org.edi.freamwork.bo;

import java.util.List;

/**
 * @author Fancy
 * @date 2018/6/21
 */
public interface IDocumentBO<T extends IDocumentBOLine> extends IBusinessObject{

    String getCompanyName();

    void setCompanyName(String value);

    void initBO();
}
