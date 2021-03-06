package info.diit.entity;
// Generated Oct 31, 2016 1:41:14 PM by Hibernate Tools 4.3.1



/**
 * Personalinfo generated by hbm2java
 */
public class Personalinfo  implements java.io.Serializable {


     private Integer seekerId;
     private Jobseekerreg jobseekerreg;
     private String firstName;
     private String lastName;
     private String fathersName;
     private String mothersName;
     private String dob;
     private String gender;
     private String maritalSt;
     private String religion;
     private String presentAdrs;
     private String prmntAdrs;
     private String email;
     private String contactNo;
     private String nationality;
     private Integer nationId;

    public Personalinfo() {
    }

    public Personalinfo(Jobseekerreg jobseekerreg, String firstName, String lastName, String fathersName, String mothersName, String dob, String gender, String maritalSt, String religion, String presentAdrs, String prmntAdrs, String email, String contactNo, String nationality, Integer nationId) {
       this.jobseekerreg = jobseekerreg;
       this.firstName = firstName;
       this.lastName = lastName;
       this.fathersName = fathersName;
       this.mothersName = mothersName;
       this.dob = dob;
       this.gender = gender;
       this.maritalSt = maritalSt;
       this.religion = religion;
       this.presentAdrs = presentAdrs;
       this.prmntAdrs = prmntAdrs;
       this.email = email;
       this.contactNo = contactNo;
       this.nationality = nationality;
       this.nationId = nationId;
    }
   
    public Integer getSeekerId() {
        return this.seekerId;
    }
    
    public void setSeekerId(Integer seekerId) {
        this.seekerId = seekerId;
    }
    public Jobseekerreg getJobseekerreg() {
        return this.jobseekerreg;
    }
    
    public void setJobseekerreg(Jobseekerreg jobseekerreg) {
        this.jobseekerreg = jobseekerreg;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFathersName() {
        return this.fathersName;
    }
    
    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
    public String getMothersName() {
        return this.mothersName;
    }
    
    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMaritalSt() {
        return this.maritalSt;
    }
    
    public void setMaritalSt(String maritalSt) {
        this.maritalSt = maritalSt;
    }
    public String getReligion() {
        return this.religion;
    }
    
    public void setReligion(String religion) {
        this.religion = religion;
    }
    public String getPresentAdrs() {
        return this.presentAdrs;
    }
    
    public void setPresentAdrs(String presentAdrs) {
        this.presentAdrs = presentAdrs;
    }
    public String getPrmntAdrs() {
        return this.prmntAdrs;
    }
    
    public void setPrmntAdrs(String prmntAdrs) {
        this.prmntAdrs = prmntAdrs;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public Integer getNationId() {
        return this.nationId;
    }
    
    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }




}


