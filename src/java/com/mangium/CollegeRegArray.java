/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class CollegeRegArray implements Serializable{

private String country;  
  
    private String city;  
    
     private List<String> selectedUniversity;  
  
    private Map<String,String> universities;  
      
    private Map<String,String> countries = new HashMap<String, String>();  
  
    private Map<String,Map<String,String>> citiesData = new HashMap<String, Map<String,String>>();  
      
    private Map<String,String> suburbs = new HashMap<String, String>();  
  
    public CollegeRegArray() { 
         universities = new HashMap<String, String>();  
        universities.put("Scarface", "Scarface");  
        universities.put("Goodfellas", "Goodfellas");  
        universities.put("Godfather", "Godfather");  
        universities.put("Carlito's Way", "Carlito's Way");  
        
        countries.put("India", "India");  
        countries.put("China", "China");  
        countries.put("Srilanka", "Srilanka");  
          
        Map<String,String> citiesIndia = new HashMap<String, String>();  
        citiesIndia.put("Banglore", "Banglore");  
        citiesIndia.put("Hydrabad", "Hydrabad");  
        citiesIndia.put("Chennai", "Chennai");  
          
        Map<String,String> citiesChina = new HashMap<String, String>();  
        citiesChina.put("Kecioren", "Kecioren");  
        citiesChina.put("Cankaya", "Cankaya");  
        citiesChina.put("Yenimahalle", "Yenimahalle");  
          
        Map<String,String> citiesSrilanka = new HashMap<String, String>();  
        citiesSrilanka.put("Cesme", "Cesme");  
        citiesSrilanka.put("Gumuldur", "Gumuldur");  
        citiesSrilanka.put("Foca", "Foca");  
          
        citiesData.put("India", citiesIndia);  
        citiesData.put("China", citiesChina);  
        citiesData.put("Srilanka", citiesSrilanka);  
    }  

    public List<String> getSelectedUniversity() {
        return selectedUniversity;
    }

    public void setSelectedUniversity(List<String> selectedUniversity) {
        this.selectedUniversity = selectedUniversity;
    }

    public Map<String, String> getUniversities() {
        return universities;
    }

    public void setUniversities(Map<String, String> universities) {
        this.universities = universities;
    }
      
    public String getCity() {  
        return country;  
    }  
  
    public void setCity(String city) {  
        this.country = city;  
    }  
  
    public String getSuburb() {  
        return city;  
    }  
  
    public void setSuburb(String suburb) {  
        this.city = suburb;  
    }  
  
    public Map<String, String> getCities() {  
        return countries;  
    }  
  
    public void setCities(Map<String, String> cities) {  
        this.countries = cities;  
    }  
      
    public Map<String, Map<String, String>> getSuburbsData() {  
        return citiesData;  
    }  
  
    public void setSuburbsData(Map<String, Map<String, String>> suburbsData) {  
        this.citiesData = suburbsData;  
    }  
      
    public Map<String, String> getSuburbs() {  
        return suburbs;  
    }  
  
    public void setSuburbs(Map<String, String> suburbs) {  
        this.suburbs = suburbs;  
    }  
      
    public void handleCityChange() {  
        if(country !=null && !country.equals(""))  
            suburbs = citiesData.get(country);  
        else  
            suburbs = new HashMap<String, String>();  
    }  
  
    public void displayLocation() {  
        FacesMessage msg = new FacesMessage("Selected", "City:" + country + ", Suburb: " + city);  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
    
   
    
      
    
}
