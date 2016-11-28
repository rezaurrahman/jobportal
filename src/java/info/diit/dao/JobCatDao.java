/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.dao;

import info.diit.entity.Jobcategory;

/**
 *
 * @author J2EE-27
 */
public class JobCatDao extends JobDao<Jobcategory>{
     public JobCatDao(){
    super(Jobcategory.class);
    }
}
