package com.syntax.RECAPclass09;

public class School {
	
	
	String name, lastName;
	static String schoolName;
	int age, weight, height;
	
	
	School(String name, String lastName){
	
		this.name=name;
		this.lastName=lastName;
	}
	
	
	public void declareValues() {
		
		
		System.out.println("Name: "+name);
		System.out.println("Last Name: "+lastName);
		
	}
	
	

	School(String name, String lastName, int age){
	
		this(name, lastName);
		this.age=age;
	}
	
	School(String name, String lastName, int age, int weight, int height){
		
		this(name, lastName, age);
		this.weight=weight;
		this.height=height;
		
	}

}
