/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;


import info.diit.dao.JobPostDao;
import info.diit.entity.Jobpost;
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
public class JobPostCtrl {
    
    private Jobpost jobpost=new Jobpost();
    
    JobPostDao jpd=new JobPostDao();

    public JobPostCtrl() {
    }

    public Jobpost getJobpost() {
        return jobpost;
    }

    public void setJobpost(Jobpost jobpost) {
        this.jobpost = jobpost;
    }

    @Override
    public String toString() {
        return "JobPostCtrl{" + "jobpost=" + jobpost + '}';
    }
    public String save(){
        try {
            
            boolean status =jpd.create(jobpost);
            
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
            
        } catch (Exception ex) {
            Logger.getLogger(JobPostCtrl.class.getName()).log(Level.SEVERE, null, ex);
          
             return null;
        }
    }
    public void apply(){
     
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "You have successfully Applied", ""));
       
    }
    
}
