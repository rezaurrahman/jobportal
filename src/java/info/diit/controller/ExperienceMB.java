package info.diit.controller;



import info.diit.dao.ExperienceDao;
import info.diit.entity.Experience;
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

public class ExperienceMB {
    Experience exp=new Experience();
    ExperienceDao ed=new ExperienceDao();

    public Experience getExp() {
        return exp;
    }

    public void setExp(Experience exp) {
        this.exp = exp;
    }

    public ExperienceDao getEd() {
        return ed;
    }

    public void setEd(ExperienceDao ed) {
        this.ed = ed;
    }
    
     public String save(){
        try {
            
            boolean status =ed.create(exp);
            
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
            
        } catch (Exception ex) {
            Logger.getLogger(ExperienceMB.class.getName()).log(Level.SEVERE, null, ex);
          
             return null;
        }
}
}
