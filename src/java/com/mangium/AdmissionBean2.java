/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean
@RequestScoped
public class AdmissionBean2 {

    private String Aggregate;
    private String final1;

    public String getAggregate() {
        return Aggregate;
    }

    public void setAggregate(String Aggregate) {
        this.Aggregate = Aggregate;
    }

    public String getFinal1() {
        return final1;
    }

    public void setFinal1(String final1) {
        this.final1 = final1;
    }
    public void savePerson(ActionEvent actionEvent) {  
         FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Thanks for Registering "));  
    } 
    
}
