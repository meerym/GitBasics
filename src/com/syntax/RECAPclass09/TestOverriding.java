package com.syntax.RECAPclass09;

public class TestOverriding {
	
	
	public static void main(String[] args) {
		
		Square s = new Square(5);
		
		s.calculateArea();
		s.calculatePerimeter();
		
	    Shape sh = new Shape();
	    
	    sh.calculateArea();
	    sh.calculatePerimeter();
	    
	    
	    System.out.println("________________");
	    
	    Rectangle r = new Rectangle(5, 4);
		
		r.calculateArea();
		r.calculatePerimeter();
		
		
		//we cannot change method signature
		//we cannot change return type
		//can we change access modifiers? --> Yes
		
		
				//we can increase visibility but we cannot decrease it
		//increase --> private --> default --> protected --> public
		//decrease --> public --> protected -->  default --> private
		
		
		
		//can we override private methods? NO --> private is accessible only inside e same class
		//can we override static methods? NO --> static is a keyword which makes the variable or method 
		//belongs to a class not to an instance --> we can re-declare static methods
		
		//can we override Constructors? NO
		
		//Class implementation method signature
		
		//can we override main method? --> NO it is static
		
		//Overridden method --> method inside the parent class
		//overriding method --> method inside the child class
		
		//an important oops concept
		//ability of a method or a constructor o have different implementations
		
		
		
		
		
		
		
		
		
		
	} 

}
