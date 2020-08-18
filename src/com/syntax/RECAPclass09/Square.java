package com.syntax.RECAPclass09;

public class Square extends Shape{
	
	
int length;
	
	public Square(int length) {
		super();
		this.length= length;
	
		
	}
	
	
	
	@Override
	
	public void calculateArea() {
		
		System.out.println("The area of the given square is: " + (length*length));
		
	}
	
	@Override
	
	public void calculatePerimeter() {
		
		System.out.println("The perimeter of the given square  is: " + 4*length);
		
	}
	

}
