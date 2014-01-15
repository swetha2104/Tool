/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ask;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class AskBean {

    public String getFname1() {
        return fname1;
    }

    public void setFname1(String fname) {
        this.fname1 = fname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Creates a new instance of AskBean
     */
    public AskBean() {
    }
    private String fname1;
    private String lname1;
    private String email;
    private String city1;
    private String nationality;
    private String country1;
    private String course1;
    private String question;
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }


    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }
      

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }
    private int mobile;

    public String getEmail() {
        return email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  

    public String getLname1() {
        return lname1;
    }

    public void setLname1(String lname1) {
        this.lname1 = lname1;
    }
 

   
  private static Map <String,Object> national;

    
  
    static
    {
            
            national= new LinkedHashMap<String,Object>();
            national.put("Indian","in1");
            national.put("American","am1");
            national.put("Chinese", "ch1");
            national.put("Bangaladeshi","bg1");
            national.put("mexican", "mx1");
            national.put("Pakistani", "pk1");
    }
    public static Map<String, Object> getNational() {
        return national;
    }

  private static Map<String,Object> country2;   
 {
            
           country2= new LinkedHashMap<String,Object>();
           country2.put("India","in");
           country2.put("America","am");
           country2.put("China", "ch");
           country2.put("Bangaladesh","bg");
           country2.put("Bhutan", "bh");
           country2.put("Pakistan", "pk");
           
    }
        private static Map<String,Object> course2;
      static
    {
            
     course2= new LinkedHashMap<String,Object>();
     course2.put("B.Tech","in");
     course2.put("MBA","am");
     course2.put("MCA", "ch");
     course2.put("BBM","bg");
     course2.put("BCA", "bh");
 
           
    }

    public static Map<String, Object> getCourse2() {
        return course2;
    }

    public static Map<String, Object> getCountry2() {
        return country2;
    }

    public static void setCountry2(Map<String, Object> country2) {
        AskBean.country2 = country2;
    }
    
      public void savePerson(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + fname1 + " " + lname1 +" "+ mobile +" " 
                + email +" "+city1+" "+nationality+" "+country1+" "+course1+" "+question+ "!"));  

    }  
    
    }
