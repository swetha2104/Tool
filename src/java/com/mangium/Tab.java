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
import org.primefaces.event.TabChangeEvent;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class Tab {

   public void onTabChange(TabChangeEvent event){
     FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab:" + event.getTab().getTitle());
     FacesContext.getCurrentInstance().addMessage(null, msg);
     
 }   
    
}
