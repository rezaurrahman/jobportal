/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.dao;

import info.diit.entity.Experience;



/**
 *
 * @author SHOHAG
 */
public class ExperienceDao extends JobDao<Experience> {
     public ExperienceDao(){
    
        super(Experience.class);
    }
    
}
