package com.syntax.RECAPclass08;

public class MathDemo {
	public static void main(String[] args) {
		
		
		int result = 0;
		
		
		//I have to specify Math in another package
		result = Math.add(4, 7);
		System.out.println("Addition result: " + result);
		
		result = Math.multiply(4,6);
		System.out.println("Multiplication result: " + result);
		
		result = Math.subtract(6, 10);
		System.out.println("Subtraction result: " + result);
		
		//This method cannot be accessed from outside Match class
		//result = Math.divide(12, 5);
		//System.out.println("Division result:" + result);
		

		Math m = new Math();
		
		m.name = "Math";
		m.phone = "(123)  456-7890";
		m.address = "Virginia, USA";
		//m.SSN = 123678907; Cannot be accessed because it is private
		
		
		
				
	}

}
