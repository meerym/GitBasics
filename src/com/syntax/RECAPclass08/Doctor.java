package com.syntax.RECAPclass08;

public class Doctor {
	
	public String name;
	public String specialty;
	public int licensedId;
	
	
	
	public Doctor() { //we can have a lot of different constructors with different parameters
		
	}
	
	public Doctor(String name) {  //
		
	}
	 
	
	public Doctor(String name, String specialty, int licensedId) {

// variable name = parameter name
		this(name);
		this.specialty = specialty;
		this.licensedId = licensedId;
	}
	
	
	public void checkUp(String name) {
		
		//to access the name of the doctor inside the class
		//we have to use this keyword
		
		System.out.println("Doctor " + this.name + 
				           " ordered blood test for patient " + name );//patientName
		
	}
	
	public void treatPatient() {
		
		System.out.println();
	}
	
	public void chargePatient() {
		System.out.println("Gets $200!");
		
	}
	
	public void displayInfo() {
		
	
		System.out.println("Doctor " + this.name + 
						   " with licensedId " + this.licensedId + 
						   " is a " + this.specialty);
	}
	
}