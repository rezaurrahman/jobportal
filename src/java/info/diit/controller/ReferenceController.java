/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Kamrul
 */
@ManagedBean
@RequestScoped
public class ReferenceController {
    private Reference reference=new Reference();
    
    ReferenceDao rd=new ReferenceDao();

    public ReferenceController() {
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "ReferenceController{" + "reference=" + reference + '}';
    }
    
    public String save(){
       try {
            boolean status=rd.create(reference);
            
              
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
        } catch (Exception ex) {
            Logger.getLogger(ReferenceController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
}
