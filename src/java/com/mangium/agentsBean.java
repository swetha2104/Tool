/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class agentsBean {

   public ArrayList agents;
    public ArrayList getAgents1(){
        return agents;
    }
    public agentsBean() {
         agents = new ArrayList();
         agents a = new agents();
        a.setId("Finance");
          a.setName("Goplan College");
//         a.setName("Pqr Company");
//         a.setCity("DOHA");
//         a.setCountry("INDIA");
         a.setType("Full time");
//         a.setDos("20-08-2013");
//         a.setDoe("20-08-2013");
//         a.setNo_of_connection("450 connections");
//         a.setPackages("Package-3");
//         a.setSubscription_status("Active");
//         a.setAmount("500$");
//         a.setCountries("15");
         agents.add(a);
         
         agents a1 = new agents();
         a1.setId("Marketing");
        a1.setName("East West College");
//         a1.setCity("DOHA");
//         a1.setCountry("QATAR");
        a1.setType("Modular MBA");
//         a1.setDos("20-08-2013");
//         a1.setDoe("20-08-2013");
//         a1.setNo_of_connection("450 connections");
//         a1.setPackages("Package-3");
//         a1.setSubscription_status("Active");
//         a1.setAmount("500$");
//         a1.setCountries("15");
         agents.add(a1);
         
         agents a2 = new agents();
         a2.setId("Human Resources");
           a2.setName("Rahmaiah College");
//         a2.setName("Pqr Company");
//        a2.setCity("DOHA");
//         a2.setCountry("QATAR");
        a2.setType("Dual MBA");
//         a2.setDos("20-08-2013");
//         a2.setDoe("20-08-2013");
//         a2.setNo_of_connection("450 connections");
//         a2.setPackages("Package-3");
//         a2.setSubscription_status("Active");
//         a2.setAmount("500$");
//         a2.setCountries("15");
         agents.add(a2);
          agents a3 = new agents();
         a3.setId("Finance");
           a3.setName("Brindavan College");
            a3.setType("Part time");
            agents.add(a3);
              agents a4 = new agents();
         a4.setId("Marketing");
           a4.setName("Presidency College");
            a4.setType("Dual MBA");
            agents.add(a4);
              agents a5 = new agents();
         a5.setId("Human Resources");
         a5.setName("AIMS College");
          a5.setType("Night college ");
            agents.add(a5);
                 
    }
}
