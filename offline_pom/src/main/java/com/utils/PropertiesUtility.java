package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	 //why we need  -- read prpoerty file
	//whats are d inputs --  key 
	//what will be the output --  value
	
	
	FileInputStream fis =null;
	
	public String readPropertiesFiles(String key){		
		Properties prop = new Properties ();
        try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
        return prop.getProperty(key);
	
	
	}
}
