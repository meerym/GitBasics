package com.syntax.RECAPclass09;

public class MethodOverloading {
	
	//polymorphism --> having more than one form or shape
	//for java --ability to implement a method in a different ways
	
	
	//static binding -- compile time polymorphism --Method Overloading
	
	//different implementation of a method or constructor inside the same class
	
	
	
	//1.change the type parameters
	
	//2.change the number parameters
	
	//3.change the order of parameters
	
	public void method() {
		
		System.out.println("I am a method without parameters");
	}
	
    public void method(String str) {
		
		System.out.println("I am a method with a string parameter");
	}
	
    public void method(int i) {
	
	    System.out.println("I am a method with an integer parameter");
    }
    
    public void method(String str, int i) {
		
		System.out.println("I am a method with a string and one integer parameter");
	}
    
    public void method( int i, String str) {
		
		System.out.println("I am a method with one integer and with a string parameter");
	}
	
 public void method( String str1, String str) {
		
		System.out.println("I am a method with two string parameters, therefore I can't be overloaded");
	}

}
