package com.syntax.class28;

public interface Shape {
	
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	

}

class Circle implements Shape{
	
	double pi = 3.14;
	double radius;
	
	
	public void calculateArea() {
		
		System.out.println(pi*radius*radius);
	}
	
	public void calculatePerimeter() {
		
	}
}

class Square implements Shape{
	
	double side;
	public void calculateArea() {
		System.out.println(side*side);
	}
	public void calculatePerimeter() {
		System.out.println(side*4);
	}
	
}
