package info.diit.entity;
// Generated Oct 31, 2016 1:41:14 PM by Hibernate Tools 4.3.1



/**
 * Education generated by hbm2java
 */
public class Education  implements java.io.Serializable {


     private Integer exId;
     private Jobseekerreg jobseekerreg;
     private String exTitle;
     private String exGroup;
     private String exBoard;
     private String exPassing;
     private String exresult;
     private String exDuration;

    public Education() {
    }

    public Education(Jobseekerreg jobseekerreg, String exTitle, String exGroup, String exBoard, String exPassing, String exresult, String exDuration) {
       this.jobseekerreg = jobseekerreg;
       this.exTitle = exTitle;
       this.exGroup = exGroup;
       this.exBoard = exBoard;
       this.exPassing = exPassing;
       this.exresult = exresult;
       this.exDuration = exDuration;
    }
   
    public Integer getExId() {
        return this.exId;
    }
    
    public void setExId(Integer exId) {
        this.exId = exId;
    }
    public Jobseekerreg getJobseekerreg() {
        return this.jobseekerreg;
    }
    
    public void setJobseekerreg(Jobseekerreg jobseekerreg) {
        this.jobseekerreg = jobseekerreg;
    }
    public String getExTitle() {
        return this.exTitle;
    }
    
    public void setExTitle(String exTitle) {
        this.exTitle = exTitle;
    }
    public String getExGroup() {
        return this.exGroup;
    }
    
    public void setExGroup(String exGroup) {
        this.exGroup = exGroup;
    }
    public String getExBoard() {
        return this.exBoard;
    }
    
    public void setExBoard(String exBoard) {
        this.exBoard = exBoard;
    }
    public String getExPassing() {
        return this.exPassing;
    }
    
    public void setExPassing(String exPassing) {
        this.exPassing = exPassing;
    }
    public String getExresult() {
        return this.exresult;
    }
    
    public void setExresult(String exresult) {
        this.exresult = exresult;
    }
    public String getExDuration() {
        return this.exDuration;
    }
    
    public void setExDuration(String exDuration) {
        this.exDuration = exDuration;
    }




}


