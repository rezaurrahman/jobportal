package info.diit.entity;
// Generated Oct 31, 2016 1:41:14 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Jobseekerreg generated by hbm2java
 */
public class Jobseekerreg  implements java.io.Serializable {


     private Integer jsId;
     private String jsFirstname;
     private String jsLastName;
     private String jsUserName;
     private String jsEmail;
     private String jsPassword;
     private String jsConPass;
     private Set experiences = new HashSet(0);
     private Set seekerotherses = new HashSet(0);
     private Set references = new HashSet(0);
     private Set educations = new HashSet(0);
     private Set personalinfos = new HashSet(0);
     private Set trainings = new HashSet(0);

    public Jobseekerreg() {
    }

    public Jobseekerreg(String jsFirstname, String jsLastName, String jsUserName, String jsEmail, String jsPassword, String jsConPass, Set experiences, Set seekerotherses, Set references, Set educations, Set personalinfos, Set trainings) {
       this.jsFirstname = jsFirstname;
       this.jsLastName = jsLastName;
       this.jsUserName = jsUserName;
       this.jsEmail = jsEmail;
       this.jsPassword = jsPassword;
       this.jsConPass = jsConPass;
       this.experiences = experiences;
       this.seekerotherses = seekerotherses;
       this.references = references;
       this.educations = educations;
       this.personalinfos = personalinfos;
       this.trainings = trainings;
    }
   
    public Integer getJsId() {
        return this.jsId;
    }
    
    public void setJsId(Integer jsId) {
        this.jsId = jsId;
    }
    public String getJsFirstname() {
        return this.jsFirstname;
    }
    
    public void setJsFirstname(String jsFirstname) {
        this.jsFirstname = jsFirstname;
    }
    public String getJsLastName() {
        return this.jsLastName;
    }
    
    public void setJsLastName(String jsLastName) {
        this.jsLastName = jsLastName;
    }
    public String getJsUserName() {
        return this.jsUserName;
    }
    
    public void setJsUserName(String jsUserName) {
        this.jsUserName = jsUserName;
    }
    public String getJsEmail() {
        return this.jsEmail;
    }
    
    public void setJsEmail(String jsEmail) {
        this.jsEmail = jsEmail;
    }
    public String getJsPassword() {
        return this.jsPassword;
    }
    
    public void setJsPassword(String jsPassword) {
        this.jsPassword = jsPassword;
    }
    public String getJsConPass() {
        return this.jsConPass;
    }
    
    public void setJsConPass(String jsConPass) {
        this.jsConPass = jsConPass;
    }
    public Set getExperiences() {
        return this.experiences;
    }
    
    public void setExperiences(Set experiences) {
        this.experiences = experiences;
    }
    public Set getSeekerotherses() {
        return this.seekerotherses;
    }
    
    public void setSeekerotherses(Set seekerotherses) {
        this.seekerotherses = seekerotherses;
    }
    public Set getReferences() {
        return this.references;
    }
    
    public void setReferences(Set references) {
        this.references = references;
    }
    public Set getEducations() {
        return this.educations;
    }
    
    public void setEducations(Set educations) {
        this.educations = educations;
    }
    public Set getPersonalinfos() {
        return this.personalinfos;
    }
    
    public void setPersonalinfos(Set personalinfos) {
        this.personalinfos = personalinfos;
    }
    public Set getTrainings() {
        return this.trainings;
    }
    
    public void setTrainings(Set trainings) {
        this.trainings = trainings;
    }




}


