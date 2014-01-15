

package com.mangium;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class AdmissionBeanArray implements Serializable {
    private String country;  
  
    private String city;  
 
    
     private List<String> selectedNationality;  
  
    private Map<String,String> nationalities;
    private List<String> selectedlocation;  
     private Map<String,String> currentlocation; 
     private List<String> selectedcategory;  
     private Map<String,String> categories;  
      
    private Map<String,String> countries = new HashMap<String, String>();  
  
    private Map<String,Map<String,String>> citiesData = new HashMap<String, Map<String,String>>();  
      
    private Map<String,String> suburbs = new HashMap<String, String>();  
  
    public AdmissionBeanArray() { 
        nationalities = new HashMap<String, String>(); 
        categories = new HashMap<String, String>(); 
         categories.put("Category1", "Category1");
          categories.put("Category2", "Category2");
           categories.put("Category3", "Category3");
        
         currentlocation = new HashMap<String, String>(); 
         currentlocation.put("Banglore", "Banglore");
          currentlocation.put("Hydrabad", "Hydrabad");
           currentlocation.put("Chennai", "Chennai");
         
        nationalities.put("Indian", "Indian");
        nationalities.put("United", "United");
        nationalities.put("United Kingdom", "United Kingdom");
        
        
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

    public List<String> getSelectedcategory() {
        return selectedcategory;
    }

    public void setSelectedcategory(List<String> selectedcategory) {
        this.selectedcategory = selectedcategory;
    }

    public Map<String, String> getCategories() {
        return categories;
    }

    public void setCategories(Map<String, String> categories) {
        this.categories = categories;
    }
    

    public List<String> getSelectedlocation() {
        return selectedlocation;
    }

    public void setSelectedlocation(List<String> selectedlocation) {
        this.selectedlocation = selectedlocation;
    }

    public Map<String, String> getCurrentlocation() {
        return currentlocation;
    }

    public void setCurrentlocation(Map<String, String> currentlocation) {
        this.currentlocation = currentlocation;
    }
    

    public List<String> getSelectedNationality() {
        return selectedNationality;
    }

    public void setSelectedNationality(List<String> selectedNationality) {
        this.selectedNationality = selectedNationality;
    }

    public Map<String, String> getNationalities() {
        return nationalities;
    }

    public void setNationalities(Map<String, String> nationalities) {
        this.nationalities = nationalities;
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
