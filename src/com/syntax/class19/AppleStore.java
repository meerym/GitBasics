package com.syntax.class19;

public class AppleStore {
	
	
	public static void main(String[] args) {
	
	Iphone phone1 = new Iphone();
	
	
	
	phone1.model = "11 pro";
	phone1.memory = 256;
	phone1.price = 1000;
	phone1.color = "blue";
	phone1.displayInfo1();
	phone1.displayDetails();
	
	//phone1.displayInfo();
	Iphone.displayInfo(); // accessing my static method 
	Iphone phone2 = new Iphone();
	
	
	phone2.model = "11";
	phone2.memory = 64;
	phone2.price = 900;
	phone2.color = "pink";
	phone2.displayInfo1();
	phone2.displayDetails();
	
	Iphone.touchScreen = false;
	
	System.out.println("Recalling info method again");
	
	Iphone.touchScreen = false;
	
	
	phone2.displayInfo1();
	
	
	

}
}
