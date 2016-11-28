/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;

import info.diit.dao.SeekerOtherDao;
import info.diit.entity.Seekerothers;

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
public class SeekerOtherCon {
    Seekerothers seekerothers=new Seekerothers();
    
    SeekerOtherDao sod=new SeekerOtherDao();

    public SeekerOtherCon() {
    }

    public Seekerothers getSeekerothers() {
        return seekerothers;
    }

    public void setSeekerothers(Seekerothers seekerothers) {
        this.seekerothers = seekerothers;
    }

    @Override
    public String toString() {
        return "SeekerOtherCon{" + "seekerothers=" + seekerothers + '}';
    }
    
    public String save(){
       try {
            boolean status=sod.create(seekerothers);
            
              
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
        } catch (Exception ex) {
            Logger.getLogger(SeekerOtherCon.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
