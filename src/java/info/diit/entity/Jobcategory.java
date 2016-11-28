package info.diit.entity;
// Generated Oct 31, 2016 1:41:14 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Jobcategory generated by hbm2java
 */
public class Jobcategory  implements java.io.Serializable {


     private String category;
     private Integer id;
     private Set jobposts = new HashSet(0);

    public Jobcategory() {
    }

	
    public Jobcategory(String category) {
        this.category = category;
    }
    public Jobcategory(String category, Integer id, Set jobposts) {
       this.category = category;
       this.id = id;
       this.jobposts = jobposts;
    }
   
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Set getJobposts() {
        return this.jobposts;
    }
    
    public void setJobposts(Set jobposts) {
        this.jobposts = jobposts;
    }




}

