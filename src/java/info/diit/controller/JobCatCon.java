/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;

import info.diit.dao.JobCatDao;
import info.diit.entity.Jobcategory;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author J2EE-27
 */
@ManagedBean
@RequestScoped
public class JobCatCon {
    Jobcategory jc = new Jobcategory();
    
    JobCatDao jd = new JobCatDao();

    public JobCatCon() {
    }

    public Jobcategory getJc() {
        return jc;
    }

    public void setJc(Jobcategory jc) {
        this.jc = jc;
    }

    @Override
    public String toString() {
        return "JobCatCon{" + "jc=" + jc + '}';
    }

            public List<SelectItem> getComType() {
        List<SelectItem> baList = new ArrayList<SelectItem>();
        List<Jobcategory> ban = new JobCatDao().findAll();
        for (Jobcategory ba : ban) {
            baList.add(new SelectItem(ba.getCategory()));
        }
        return baList;
    }        
}
