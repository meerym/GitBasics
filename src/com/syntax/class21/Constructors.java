package com.syntax.class21;

public class Constructors {
	
	String word;
	public Constructors() {
		
		System.out.println("I am a non argument constructor");
	}
	
	public Constructors(String word) {
		
		this(12);
		this.word=word;
		System.out.println("I am a parameterized constructor with str = " + word );
	}
	
	Constructors(int num){
		System.out.println("I am constructor with 1 parameter = " + num);
	}
	
	
	public static void main(String[] args) {
		
		Constructors obj = new Constructors("Java");
		System.out.println(obj.word);
	   
	}
	

}
