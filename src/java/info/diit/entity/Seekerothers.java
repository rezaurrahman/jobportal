package info.diit.entity;
// Generated Oct 31, 2016 1:41:14 PM by Hibernate Tools 4.3.1



/**
 * Seekerothers generated by hbm2java
 */
public class Seekerothers  implements java.io.Serializable {


     private Integer otherId;
     private Jobseekerreg jobseekerreg;
     private String preferArea;
     private String prSalary;
     private String exSalary;

    public Seekerothers() {
    }

    public Seekerothers(Jobseekerreg jobseekerreg, String preferArea, String prSalary, String exSalary) {
       this.jobseekerreg = jobseekerreg;
       this.preferArea = preferArea;
       this.prSalary = prSalary;
       this.exSalary = exSalary;
    }
   
    public Integer getOtherId() {
        return this.otherId;
    }
    
    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
    }
    public Jobseekerreg getJobseekerreg() {
        return this.jobseekerreg;
    }
    
    public void setJobseekerreg(Jobseekerreg jobseekerreg) {
        this.jobseekerreg = jobseekerreg;
    }
    public String getPreferArea() {
        return this.preferArea;
    }
    
    public void setPreferArea(String preferArea) {
        this.preferArea = preferArea;
    }
    public String getPrSalary() {
        return this.prSalary;
    }
    
    public void setPrSalary(String prSalary) {
        this.prSalary = prSalary;
    }
    public String getExSalary() {
        return this.exSalary;
    }
    
    public void setExSalary(String exSalary) {
        this.exSalary = exSalary;
    }




}


