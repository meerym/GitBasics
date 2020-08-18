package com.syntax.class19;

public class Iphone {
	
	static String brand = "Apple";
	static String OS= "IOS";
	static boolean touchScreen = true;
	
	
	
	String model;
	int memory;
	double price;
	String color;
	
	
	static void displayInfo() {
		
		System.out.println("iphone belongs to brand + " + brand + " it has operating system as " + OS + " and all iphones have touchscreen = " + touchScreen);
	}
	void displayDetails() {
		
		System.out.println(" We build iphone " + model + " with memory " + memory + ", price " + price + " in " + color);
	} 
	
//	static void displayDetails() {  static method cannot access instance variables
//		
//		System.out.println(" We build iPhone " + model + " with memory " + memory + ", price " + price + " in " + color);
//	} 
	
    void displayInfo1() { //non static methods can work with both static and instance variables
		
		System.out.println("iphone belongs to brand + " + brand + " it has operating system as " + OS + " and all iphones have touchscreen = " + touchScreen);
	}

}
