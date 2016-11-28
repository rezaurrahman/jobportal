/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;

import info.diit.dao.JobPostDao;
import info.diit.entity.Jobpost;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rana
 */
@ManagedBean
@SessionScoped
public class DisplayITMB {
    Jobpost jp = new Jobpost();
    JobPostDao jpd= new JobPostDao();

    public Jobpost getJp() {
        return jp;
    }

    public void setJp(Jobpost jp) {
        this.jp = jp;
    }
    
    public List<Jobpost> getAllIT(){
    List<Jobpost> itList = jpd.allITList();
    return itList;
    }
    
    public List<Jobpost> getAllSales(){
    List<Jobpost> itList = jpd.allSalesList();
    return itList;
    }
    
    public List<Jobpost> getAllAccounting(){
    List<Jobpost> itList = jpd.allAccountingList();
    return itList;
    }
    
}
