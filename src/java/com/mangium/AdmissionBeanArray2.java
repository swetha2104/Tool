

package com.mangium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class AdmissionBeanArray2 {
     private List<String> selectedgraduation;  
     private Map<String,String> graduation; 
     private List<String> selectedduration;  
     private Map<String,String> durations;  
     private List<String> selectedcountry;  
     private Map<String,String> countries;  
     private List<String> selecteduniversity;        
     private Map<String,String> universities;  
      private List<String> selectedinstitute;        
     private Map<String,String> institutes;  
      private List<String> selectedpassing;        
     private Map<String,String> passing;  
    public AdmissionBeanArray2() {
        graduation = new HashMap<String, String>();
        durations = new HashMap<String, String>();
        countries = new HashMap<String, String>();
        universities = new HashMap<String, String>();
        institutes = new HashMap<String, String>();
        passing = new HashMap<String, String>();
        
        graduation.put("B.E", "B.E");
        graduation.put("M.S", "M.S");
        graduation.put("MBA", "MBA");
        
        durations.put("FullTime", "FullTimeE");
        durations.put("PartTime", "PartTime");
        
        countries.put("India", "India");
        countries.put("United States", "United States");
        countries.put("United Kindons", "United Kingdom");
        
         universities.put("Mysore University", "Mysore University");
         universities.put("VTU", "VTU");
         
         institutes.put("NIE", "NIE");
         institutes.put("MIT", "MIT");
          institutes.put("CBIT", "CBIT");
          
          passing.put("2010", "2010");
              passing.put("2011", "2011");
                  passing.put("2012", "2012");
         
    }

    public List<String> getSelectedgraduation() {
        return selectedgraduation;
    }

    public void setSelectedgraduation(List<String> selectedgraduation) {
        this.selectedgraduation = selectedgraduation;
    }

    public Map<String, String> getGraduation() {
        return graduation;
    }

    public void setGraduation(Map<String, String> graduation) {
        this.graduation = graduation;
    }

    public List<String> getSelectedduration() {
        return selectedduration;
    }

    public void setSelectedduration(List<String> selectedduration) {
        this.selectedduration = selectedduration;
    }

    public Map<String, String> getDurations() {
        return durations;
    }

    public void setDurations(Map<String, String> durations) {
        this.durations = durations;
    }

    public List<String> getSelectedcountry() {
        return selectedcountry;
    }

    public void setSelectedcountry(List<String> selectedcountry) {
        this.selectedcountry = selectedcountry;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    public List<String> getSelecteduniversity() {
        return selecteduniversity;
    }

    public void setSelecteduniversity(List<String> selecteduniversity) {
        this.selecteduniversity = selecteduniversity;
    }

    public Map<String, String> getUniversities() {
        return universities;
    }

    public void setUniversities(Map<String, String> universities) {
        this.universities = universities;
    }

    public List<String> getSelectedinstitute() {
        return selectedinstitute;
    }

    public void setSelectedinstitute(List<String> selectedinstitute) {
        this.selectedinstitute = selectedinstitute;
    }

    public Map<String, String> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(Map<String, String> institutes) {
        this.institutes = institutes;
    }

    public List<String> getSelectedpassing() {
        return selectedpassing;
    }

    public void setSelectedpassing(List<String> selectedpassing) {
        this.selectedpassing = selectedpassing;
    }

    public Map<String, String> getPassing() {
        return passing;
    }

    public void setPassing(Map<String, String> passing) {
        this.passing = passing;
    }
    
         
        
        
        
        
        
        
    
    
}
