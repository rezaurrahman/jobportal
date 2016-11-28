package info.diit.controller;

import info.diit.dao.EducationDao;
import info.diit.entity.Education;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class EducationMB{

    Education eduInfo=new Education();
    EducationDao ad=new EducationDao();

    public EducationMB() {
    }

    public Education getEduInfo() {
        return eduInfo;
    }

    public void setEduInfo(Education eduInfo) {
        this.eduInfo = eduInfo;
    }

    

    public EducationDao getAd() {
        return ad;
    }

    public void setAd(EducationDao ad) {
        this.ad = ad;
    }

     public String save(){
        try {
            
            boolean status =ad.create(eduInfo);
            
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Successfully updated", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
            
        } catch (Exception ex) {
            Logger.getLogger(EducationMB.class.getName()).log(Level.SEVERE, null, ex);
          
             return null;
        }
}
}
