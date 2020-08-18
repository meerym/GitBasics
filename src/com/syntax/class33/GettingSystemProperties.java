package com.syntax.class33;

public class GettingSystemProperties {
	
	public static void main(String[] args) {
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String timezone = System.getProperty("user.dir");
		System.out.println(timezone);
		
	    String filePath= System.getProperty("user.dir")+"Configurations/Example.properties";

		
		
		
	}

}
