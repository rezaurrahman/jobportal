package info.diit.controller;



import info.diit.dao.ReferenceDao;
import info.diit.entity.Reference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author SHOHAG
 */
@ManagedBean
@RequestScoped
public class ReferenceMB {
    Reference ref=new Reference();
    ReferenceDao rd=new ReferenceDao();

    public Reference getRef() {
        return ref;
    }

    public void setRef(Reference ref) {
        this.ref = ref;
    }

    public ReferenceDao getRd() {
        return rd;
    }

    public void setRd(ReferenceDao rd) {
        this.rd = rd;
    }
    public String save(){
        try {
            boolean status=rd.create(ref);
            if(status){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Data Save",""));
            }else{
                 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Data not Save",""));
            }
            return null;
        } catch (Exception e) {
            Logger.getLogger(TrainingMB.class.getName()).log(Level.SEVERE, null, e);
          
             return null;
        }
        
    }
}
