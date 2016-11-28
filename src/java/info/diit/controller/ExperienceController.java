/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Kamrul
 */
@ManagedBean
@RequestScoped
public class ExperienceController {

    private Experience experience = new Experience();

    ExperienceDao expDao = new ExperienceDao();//save er jonno

    public ExperienceController() {
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "ExperienceController{" + "experience=" + experience + '}';
    }

  

    public String save() {
      try {
            boolean status=expDao.create(experience);
            
              
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
        } catch (Exception ex) {
            Logger.getLogger(ExperienceController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

}
