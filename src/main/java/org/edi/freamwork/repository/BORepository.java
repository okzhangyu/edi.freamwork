package org.edi.freamwork.repository;

import org.edi.freamwork.bo.BusinessObject;

/**
 * @author Fancy
 * @date 2018/8/3
 */
public abstract class BORepository<T extends BusinessObject> {

    private void openSession(){

    }

    protected abstract void save(T bo) ;

    protected abstract void update(T bo) ;

    protected abstract void delete(T bo) ;

    protected abstract void callTranscation(T bo,String transType);

    private void commitSession(){

    }

    public final void saveBO(T bo) {
        bo.checkBO();
        this.save(bo);
        this.callTranscation(bo,"A");
}

    public final void updateBO(T bo){
        bo.checkBO();
        this.update(bo);
        this.callTranscation(bo,"U");
    }

    public final void deleteBO(T bo){
        this.callTranscation(bo,"D");
        this.delete(bo);
    }

}
