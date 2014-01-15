package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class DGBean {
    
    private ArrayList data;

    public void setData(ArrayList data) {
        this.data = data;
    }
    
    public ArrayList getData() {
        
        data = new ArrayList();
        
        DataGridBean d1 = new DataGridBean();
        d1.setContent("Check here the latest IT industry news & detailed explanations IT jargon. You must know these to make yourself ready for the interviews and to update yourself with more knowledge about industry.");
        d1.setName("Jhon Smith");
        d1.setCollege("JNTU Hyderabad.");
        d1.setImgname("1");
        data.add(d1);
        
        DataGridBean d2 = new DataGridBean();
        d2.setContent("This board is dedicated to discussions on latest GD topics. You can post a topic of your choice for discussion or you can actively participate and echo your voice on any topic.");
        d2.setName("Benny Daniel");
        d2.setCollege("Vidhayniketan.");
        d2.setImgname("2");
        data.add(d2);
        
        DataGridBean d3 = new DataGridBean();
        d3.setContent("HR interview FAQ will be discussed here to help you to crack HR interviews. You can post any HR question to know how to answer the question in best way. Please do NOT post here any questions other than HR questions.");
        d3.setName("Will Smith");
        d3.setCollege("Brindavanam college");
        d3.setImgname("3");
        data.add(d3);
        
        DataGridBean d4 = new DataGridBean();
        d4.setContent("This is to help you if you are not sure what training institutes exist in various places for various technologies. Please note that the posting here is reserved only for various training institutes. Job seekers can view the information and decide the institute that fits their bill.");
        d4.setName("Jhonny Bravo");
        d4.setCollege("Jain University");
        d4.setImgname("4");
        data.add(d4);
        
        return data;
    }

   
    
    
    
}
