package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {

	//writing into existing file
	public static void main(String[] args) throws IOException {
		String file = "Configurations/Example.properties";
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
		
		p.setProperty("street", "12 Wallace");
		
		
		FileOutputStream fos = new FileOutputStream(file);
		
		p.store(fos, "Added additional key");
		
		
	}
	
}
