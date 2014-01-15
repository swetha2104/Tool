

package com.mangium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class AdmissionBeanArray1 {
     private List<String> selectedcourse;  
     private Map<String,String> courses; 
     private List<String> selectedlocation;  
     private Map<String,String> locations;  
    
    public AdmissionBeanArray1() {
         courses = new HashMap<String, String>();
          locations = new HashMap<String, String>();
         courses.put("B.E", "B.E");
         courses.put("M.S", "M.S");
         courses.put("MBA","MBA");
         locations.put("Banglore","Banglore");
         locations.put("Hydrabad","Hydrabad");
         locations.put("Chennai","Chennai");
         
    }

    public List<String> getSelectedcourse() {
        return selectedcourse;
    }

    public void setSelectedcourse(List<String> selectedcourse) {
        this.selectedcourse = selectedcourse;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public List<String> getSelectedlocation() {
        return selectedlocation;
    }

    public void setSelectedlocation(List<String> selectedlocation) {
        this.selectedlocation = selectedlocation;
    }

    public Map<String, String> getLocations() {
        return locations;
    }

    public void setLocations(Map<String, String> locations) {
        this.locations = locations;
    }
    
    
}
