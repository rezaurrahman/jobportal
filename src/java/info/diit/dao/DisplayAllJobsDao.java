/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.dao;

import info.diit.entity.Jobpost;



/**
 *
 * @author Rana
 */
public class DisplayAllJobsDao extends JobDao<Jobpost>{
    public DisplayAllJobsDao() {
        super(Jobpost.class);
    }
}
