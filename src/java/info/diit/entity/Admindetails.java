package info.diit.entity;
// Generated Oct 31, 2016 1:41:14 PM by Hibernate Tools 4.3.1



/**
 * Admindetails generated by hbm2java
 */
public class Admindetails  implements java.io.Serializable {


     private Integer adminId;
     private String adminName;
     private String adminPass;

    public Admindetails() {
    }

    public Admindetails(String adminName, String adminPass) {
       this.adminName = adminName;
       this.adminPass = adminPass;
    }
   
    public Integer getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public String getAdminName() {
        return this.adminName;
    }
    
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getAdminPass() {
        return this.adminPass;
    }
    
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }




}


