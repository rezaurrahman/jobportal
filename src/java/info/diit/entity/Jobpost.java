package info.diit.entity;
// Generated Oct 31, 2016 1:41:14 PM by Hibernate Tools 4.3.1



/**
 * Jobpost generated by hbm2java
 */
public class Jobpost  implements java.io.Serializable {


     private Integer jobId;
     private Companycategory companycategory;
     private Jobcategory jobcategory;
     private String jobTitle;
     private String jobRequ;
     private String noOfPost;
     private String poatDate;
     private String expDate;
     private String deadline;
     private String jobNature;
     private String jobDesc;
     private String workingPlace;
     private String salary;
     private String requireExperience;
     private String educationReqr;
     private String workingHours;
     private String address;
     private String email;
     private String employerName;

    public Jobpost() {
    }

    public Jobpost(Companycategory companycategory, Jobcategory jobcategory, String jobTitle, String jobRequ, String noOfPost, String poatDate, String expDate, String deadline, String jobNature, String jobDesc, String workingPlace, String salary, String requireExperience, String educationReqr, String workingHours, String address, String email, String employerName) {
       this.companycategory = companycategory;
       this.jobcategory = jobcategory;
       this.jobTitle = jobTitle;
       this.jobRequ = jobRequ;
       this.noOfPost = noOfPost;
       this.poatDate = poatDate;
       this.expDate = expDate;
       this.deadline = deadline;
       this.jobNature = jobNature;
       this.jobDesc = jobDesc;
       this.workingPlace = workingPlace;
       this.salary = salary;
       this.requireExperience = requireExperience;
       this.educationReqr = educationReqr;
       this.workingHours = workingHours;
       this.address = address;
       this.email = email;
       this.employerName = employerName;
    }
   
    public Integer getJobId() {
        return this.jobId;
    }
    
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
    public Companycategory getCompanycategory() {
        return this.companycategory;
    }
    
    public void setCompanycategory(Companycategory companycategory) {
        this.companycategory = companycategory;
    }
    public Jobcategory getJobcategory() {
        return this.jobcategory;
    }
    
    public void setJobcategory(Jobcategory jobcategory) {
        this.jobcategory = jobcategory;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getJobRequ() {
        return this.jobRequ;
    }
    
    public void setJobRequ(String jobRequ) {
        this.jobRequ = jobRequ;
    }
    public String getNoOfPost() {
        return this.noOfPost;
    }
    
    public void setNoOfPost(String noOfPost) {
        this.noOfPost = noOfPost;
    }
    public String getPoatDate() {
        return this.poatDate;
    }
    
    public void setPoatDate(String poatDate) {
        this.poatDate = poatDate;
    }
    public String getExpDate() {
        return this.expDate;
    }
    
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public String getDeadline() {
        return this.deadline;
    }
    
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public String getJobNature() {
        return this.jobNature;
    }
    
    public void setJobNature(String jobNature) {
        this.jobNature = jobNature;
    }
    public String getJobDesc() {
        return this.jobDesc;
    }
    
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }
    public String getWorkingPlace() {
        return this.workingPlace;
    }
    
    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }
    public String getSalary() {
        return this.salary;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getRequireExperience() {
        return this.requireExperience;
    }
    
    public void setRequireExperience(String requireExperience) {
        this.requireExperience = requireExperience;
    }
    public String getEducationReqr() {
        return this.educationReqr;
    }
    
    public void setEducationReqr(String educationReqr) {
        this.educationReqr = educationReqr;
    }
    public String getWorkingHours() {
        return this.workingHours;
    }
    
    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmployerName() {
        return this.employerName;
    }
    
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }




}

