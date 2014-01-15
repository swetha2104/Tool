package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class VTBean {

    private ArrayList url;

    public ArrayList getUrl() {
        
        url =  new ArrayList();
        
        url.add("http://www.youtube.com/v/KZnUr8lcqjo");
        url.add("http://www.youtube.com/v/KZnUr8lcqjo");
        url.add("http://www.youtube.com/v/KZnUr8lcqjo");
        url.add("http://www.youtube.com/v/KZnUr8lcqjo");
        return url;
    }
    
    
}
