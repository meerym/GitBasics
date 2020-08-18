package com.syntax.class28;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		c.radius = 20;
		
		c.calculateArea();
		c.calculatePerimeter();
		
		Square s = new Square();
		
		s.side = 5;
		
		s.calculateArea();
		s.calculatePerimeter();
		
	}

}
