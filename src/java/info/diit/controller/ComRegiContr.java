/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;

import info.diit.dao.ComRegiDao;

import info.diit.entity.Companyreg;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


/**
 *
 * @author Kamrul
 */
@ManagedBean
@RequestScoped
public class ComRegiContr {
    
    Companyreg companyreg=new Companyreg();
     
    
    ComRegiDao crd=new ComRegiDao();

    public ComRegiContr() {
    }

    public Companyreg getCompanyreg() {
        return companyreg;
    }

    public void setCompanyreg(Companyreg companyreg) {
        this.companyreg = companyreg;
    }

    @Override
    public String toString() {
        return "ComRegiContr{" + "companyreg=" + companyreg + '}';
    }

public String save(){
        try {
            boolean status=crd.create(companyreg);
            
             if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
        } catch (Exception ex) {
            Logger.getLogger(ComRegiContr.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
}

}
