package com.syntax.RECAPclass09;

public class Student extends School{
	
	String stuId;
	
	
	public Student(String name, String lastName, String stuId) {
		
		
		super(name, lastName); //we invoke super class constructor
		this.stuId = stuId;
	}
	
	
	public void printDetails() {
		System.out.println(name + " "+ lastName + " " + schoolName);
		
	}
	
	
	public void study(){
		
		
		System.out.println(name + " "+ lastName + " studies at " + schoolName);
		
		
	}

}


//overloading -->different implementation of a method inside the same class

		//playing with arguments

//overriding -->different implementation of a method inside a different class
		
		//arguments stay the same