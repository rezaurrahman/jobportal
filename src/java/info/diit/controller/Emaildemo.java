/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;

import info.diit.entity.Education;
import info.diit.entity.Role;
import info.diit.util.HibernateUtil;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;

/**
 *
 * @author Rana
 */
@ManagedBean
public class Emaildemo {
    String company;
    String message;
    String ename;
    String mail;
     
   
    
    
    
    

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    SendAttachmentInEmail se = new SendAttachmentInEmail();

    public SendAttachmentInEmail getSe() {
        return se;
    }

    public void setSe(SendAttachmentInEmail se) {
        this.se = se;
    }
    
    
    
    
    public void save(){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        Education e = new Education();
        e.setExBoard(company);
        e.setExDuration(message);
        e.setExGroup(ename);
        e.setExPassing(mail);
        
        
         
        //Save the employee in database
        session.save(e);
 
        //Commit the transaction
        session.getTransaction().commit();
        session.close();
    }
    
    
    
    public void email() {
        String[] to = {company}; 
        if(EmailSender.sendmail("rrezaur166@gmail.com",
                "nfb110099", 
                message, ename, mail, to))System.out.println("email sent");
        else System.out.println("some error ....");
        
        save();
        //System.out.println("company name "+company+" Message "+message+" ename "+" mail "+mail);
        
        se.m();
        
    }
}


