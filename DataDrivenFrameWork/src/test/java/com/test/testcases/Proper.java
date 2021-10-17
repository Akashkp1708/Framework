package com.test.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Proper {
	Properties prop;
     public Proper() {
    	 File  src =new File("./config.properties");
    	 try {
	
	FileInputStream inp = new FileInputStream(src);
	 prop = new Properties();
	prop.load(inp);
	System.out.println(prop.getProperty("browser"));
	
     } catch(Exception e) {
    	 System.out.println(e);
     }
}
     public  String bro() {
    	return prop.getProperty("browser");
    	
     }


}

