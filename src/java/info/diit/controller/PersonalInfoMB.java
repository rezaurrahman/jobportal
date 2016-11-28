package info.diit.controller;

import info.diit.dao.PersonalDao;
import info.diit.entity.Personalinfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class PersonalInfoMB {

    Personalinfo pi=new Personalinfo();
    PersonalDao pd=new PersonalDao();
    
    public PersonalInfoMB() {
    }

    public Personalinfo getPi() {
        return pi;
    }

    public void setPi(Personalinfo pi) {
        this.pi = pi;
    }

    public PersonalDao getPd() {
        return pd;
    }

    public void setPd(PersonalDao pd) {
        this.pd = pd;
    }
    public String save(){
        try {
            
            boolean status =pd.create(pi);
            
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Successfully updated", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
            
        } catch (Exception ex) {
            Logger.getLogger(Personalinfo.class.getName()).log(Level.SEVERE, null, ex);
          
             return null;
        }
}
}
