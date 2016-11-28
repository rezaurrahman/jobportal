package info.diit.dao;

import info.diit.entity.Personalinfo;



/**
 *
 * @author SHOHAG
 */
public class PersonalDao extends JobDao<Personalinfo> {
    public PersonalDao(){
    
        super(Personalinfo.class);
    }

}
