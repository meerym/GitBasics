package com.syntax.RECAPclass08;

public class Dermatologist extends Doctor {

	
	public int dermatologyId;
	
	
	//I can't use the constructors of the parent class 
	//but I can create constructors using the variables of the parent class
	public Dermatologist(String name, String specialty, int licensedId, int dermatologyId) {
		
		
		//I can use super or this keyword
	//super.name = name;
	//super.specialty = specialty;
	//super.licensedId = licensedId;
		
	    super(name, specialty, licensedId);
		this.dermatologyId = dermatologyId;
	}
	
	public static void applySkinTreatment() {
		
		System.out.println("Applies some cream on patients");
	}
}


