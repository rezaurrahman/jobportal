package info.diit.controller;


import info.diit.dao.SeekerRegDao;
import info.diit.entity.Jobseekerreg;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class SeekerRegMB {
    Jobseekerreg jr=new Jobseekerreg();
    SeekerRegDao sd=new SeekerRegDao();

    public Jobseekerreg getJr() {
        return jr;
    }

    public void setJr(Jobseekerreg jr) {
        this.jr = jr;
    }

    public SeekerRegDao getSd() {
        return sd;
    }

    public void setSd(SeekerRegDao sd) {
        this.sd = sd;
    }
      public String save(){
        try {
            boolean status=sd.create(jr);
            if(status){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Registration Successful!",""));
            }else{
                 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Registration fail",""));
            }
            return null;
        } catch (Exception e) {
            Logger.getLogger(SeekerRegMB.class.getName()).log(Level.SEVERE, null, e);
          
             return null;
        }
        
    }
      
      
      
}
