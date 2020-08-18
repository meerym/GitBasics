package com.syntax.class28;

public class MarksTest {

	public static void main(String[] args) {
		
		Marks StuA = new A(90, 80, 70);
		
		System.out.println(StuA.getPercentage());
		
		
		Marks StuB = new B(20, 30, 40, 50);
		
		System.out.println(StuB.getPercentage());
		
	}
}
