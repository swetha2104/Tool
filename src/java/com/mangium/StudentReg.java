

package com.mangium;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean
@RequestScoped
public class StudentReg {
 private String firstname;
 private String lastname;
 private String username;
 private String password;
 private String confirmpassword;
 private Date date;
 private String gender;
 private long mobileno;
 private String interstedcourse;
 private String interestedlocation;
private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInterstedcourse() {
        return interstedcourse;
    }

    public void setInterstedcourse(String interstedcourse) {
        this.interstedcourse = interstedcourse;
    }

    public String getInterestedlocation() {
        return interestedlocation;
    }

    public void setInterestedlocation(String interestedlocation) {
        this.interestedlocation = interestedlocation;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }
     public void savePerson(ActionEvent actionEvent) {  
           FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");  
          
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Thanks for Registering "));  
    } 
     
//     public void submit(ActionEvent event) {  
//        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");  
//          
//        FacesContext.getCurrentInstance().addMessage(null, msg);  
//    } 
// public void submit(ActionEvent event) {  
//        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");  
//          
//        FacesContext.getCurrentInstance().addMessage(null, msg);  
//    }  
    
}
