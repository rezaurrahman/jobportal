package info.diit.controller;


import info.diit.dao.TrainingDao;
import info.diit.entity.Training;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean 
@RequestScoped
public class TrainingMB {
    
    private Training training=new Training();
    
    TrainingDao td=new TrainingDao();

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public TrainingDao getTd() {
        return td;
    }

    public void setTd(TrainingDao td) {
        this.td = td;
    }

   
    public String save(){
        try {
            
            boolean status =td.create(training);
            
              if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data saved", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not saved", ""));
        }
        return null;
            
        } catch (Exception ex) {
            Logger.getLogger(TrainingMB.class.getName()).log(Level.SEVERE, null, ex);
          
             return null;
        }
    }
}
