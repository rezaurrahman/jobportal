/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;


import info.diit.dao.SeekerRegiDao;
import info.diit.entity.Jobseekerreg;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Kamrul
 */

@ManagedBean
@RequestScoped
public class SeekerRegiCtrl {
    
    Jobseekerreg jobseekerreg=new Jobseekerreg();
    
    SeekerRegiDao srd=new SeekerRegiDao();
    
    Jobseekerreg selectedSeekers;

    public Jobseekerreg getSelectedSeekers() {
        return selectedSeekers;
    }

    public void setSelectedSeekers(Jobseekerreg selectedSeekers) {
        this.selectedSeekers = selectedSeekers;
    }
    
    
    

    public SeekerRegiCtrl() {
    }

    public Jobseekerreg getJobseekerreg() {
        return jobseekerreg;
    }

    public void setJobseekerreg(Jobseekerreg jobseekerreg) {
        this.jobseekerreg = jobseekerreg;
    }

    @Override
    public String toString() {
        return "SeekerRegiCtrl{" + "jobseekerreg=" + jobseekerreg + '}';
    }
    
     public String save(){
        try {
            
            boolean status =srd.create(jobseekerreg);
            
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
            
        } catch (Exception ex) {
            Logger.getLogger(SeekerRegiCtrl.class.getName()).log(Level.SEVERE, null, ex);
          
             return null;
        }
    }
     
         List<Jobseekerreg> findAll = srd.findAll();

    public List<Jobseekerreg> getFindAll() {
        return findAll;
    }

    public SeekerRegiDao getSrd() {
        return srd;
    }

    public void setSrd(SeekerRegiDao srd) {
        this.srd = srd;
    }


    public void setFindAll(List<Jobseekerreg> findAll) {
        this.findAll = findAll;
    }
    
}
