package info.diit.dao;

import info.diit.entity.Jobpost;
import info.diit.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamrul
 */
public class JobPostDao extends JobDao<Jobpost>{
    
    public JobPostDao(){
    super(Jobpost.class);
    }
    
    public List<Jobpost> allITList() {
       SessionFactory factory = HibernateUtil.getSessionFactory();
    Session s = factory.openSession();
    
    List<Jobpost> cList =  s.createQuery(" from Jobpost j where j.jobcategory = 'IT' ").list();
    //"Select * from experience where exid=(SELECT MAX(exid) FROM experience)"
    cList.toString();
    s.close();
    return cList;
    
        }
    
    
    
    public List<Jobpost> allSalesList() {
       SessionFactory factory = HibernateUtil.getSessionFactory();
    Session s = factory.openSession();
    
    List<Jobpost> cList =  s.createQuery(" from Jobpost j where j.jobcategory = 'Sales' ").list();
    //"Select * from experience where exid=(SELECT MAX(exid) FROM experience)"
    cList.toString();
    s.close();
    return cList;
    
        }
    
    public List<Jobpost> allAccountingList() {
       SessionFactory factory = HibernateUtil.getSessionFactory();
    Session s = factory.openSession();
    
    List<Jobpost> cList =  s.createQuery(" from Jobpost j where j.jobcategory = 'Accounting' ").list();
    //"Select * from experience where exid=(SELECT MAX(exid) FROM experience)"
    cList.toString();
    s.close();
    return cList;
    
        }
}
