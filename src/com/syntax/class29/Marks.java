package com.syntax.class29;

public abstract class Marks {
	
	public abstract int getPercentage();
	

}

class A extends Marks{
	int a , b, c;
	
	public A(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public int getPercentage() {
		int average = (a+b+c)/3;
		return average;
		
	}

}

class B extends Marks{
	
	int a, b, c, d;
	
	public B(int a, int b, int c, int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public int getPercentage() {
		int average = (a+b+c+d)/4;
		return average;
	}
	
}

