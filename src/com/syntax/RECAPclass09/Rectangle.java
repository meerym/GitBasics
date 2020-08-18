package com.syntax.RECAPclass09;

public class Rectangle extends Shape{

	//created classes defining and implementing some methods to them 
	//created other classes and extend them to the parent class
	
	
	int length, width;
	
	public Rectangle(int length, int width) {
		super();
		this.length= length;
		this.width = width;
		
	}
	
	
	
	@Override
	
	public void calculateArea() {
		
		System.out.println("The area of the given rectangle is: " + (length*width));
		
	}
	
	
	@Override
	public void calculatePerimeter() {
		
		System.out.println("The perimeter of the given rectangle is: " + 2*(length+width));
		
	}
	
	
}
