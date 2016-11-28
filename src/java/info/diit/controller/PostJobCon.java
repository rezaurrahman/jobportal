/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;

import info.diit.dao.JobPostDao;
import info.diit.entity.Jobpost;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rana
 */
@ManagedBean
@SessionScoped
public class PostJobCon {

    private Jobpost jp = new Jobpost();
    JobPostDao jpd = new JobPostDao();
    Jobpost selectedJob;

    public Jobpost getSelectedJob() {
        return selectedJob;
    }

    public void setSelectedJob(Jobpost selectedJob) {
        this.selectedJob = selectedJob;
    }

    public PostJobCon() {
    }

    public Jobpost getJp() {
        return jp;
    }

    public void setJp(Jobpost jp) {
        this.jp = jp;
    }

    @Override
    public String toString() {
        return "JobPostCon{" + "jp=" + jp + ", jpd=" + jpd + '}';
    }

    public String save() {

        try {
            jpd.create(jp);
            return "saved";
        } catch (Exception ex) {
            Logger.getLogger(PostJobCon.class.getName()).log(Level.SEVERE, null, ex);
            return "not saved";
        }
    }

    public String delete() {

        try {
            jpd.delete(jp);
            return "deleted";
        } catch (Exception ex) {
            Logger.getLogger(PostJobCon.class.getName()).log(Level.SEVERE, null, ex);
            return "not deleted";
        }
    }

    List<Jobpost> findAll = jpd.findAll();

    public List<Jobpost> getFindAll() {
        return findAll;
    }

    public JobPostDao getJpd() {
        return jpd;
    }

    public void setJpd(JobPostDao jpd) {
        this.jpd = jpd;
    }

    public void setFindAll(List<Jobpost> findAll) {
        this.findAll = findAll;
    }

}
