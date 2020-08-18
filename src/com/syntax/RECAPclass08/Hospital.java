package com.syntax.RECAPclass08;

public class Hospital {
	
	
	public static void main(String[] args) {
		
		
		
		Doctor d1 = new Doctor("John", "Family Doctor", 123456);
		
	//I already created my constructor and assigned my parameters inside the constructor therefore I don't need to assign them again as below
	
	 //	d1.name = "John";
	//	d1.specialty = "Family Doctor";
	//	d1.lisencedId = 123456;
		
		
		d1.chargePatient();
	
		d1.displayInfo();
		d1.checkUp("Luis");
		
		//to access the name of the doctor outside the class
		//we have to use the variable d1
		
		
		Doctor d2 = new Doctor("Smith");
		d2.displayInfo();
		
		System.out.println("Creating a dermatologist");
		
		Dermatologist derma1 = new Dermatologist("Tuba", "Dermatologist", 2345678, 67885);
		System.out.println("the name of the dermatologist is " + derma1.name );
		derma1.displayInfo();
		derma1.chargePatient();
		
		
		
		
	}
}
