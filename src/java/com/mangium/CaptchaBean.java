

package com.mangium;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean
@RequestScoped
public class CaptchaBean {

    public void submit(ActionEvent event) {  
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");  
          
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    } 
    
}
