package com.syntax.class25;

public class Computer {
//	
//	Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//
//	Define common behavior within and some fields in parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Create objects of child classes and store them into array. Loop through each object and execute available methods.
	
	String operatingSystem, processor;
	int ram;

	public Computer(String operatingSystem, String processor, int ram) {
		
		this.operatingSystem=operatingSystem;
		this.processor=processor;
		this.ram=ram;
	   }
		
		public void operatingSystem() {
			
			System.out.println("An Operating System lets you interact with your computer instead of typing computer code");
		}
		public void processor(){
			
			System.out.println("Processors recieve the inputs and provide appropriate outputs");
		
		}
		
		class Apple extends Computer{
			
			public Apple(String brand, String operatingSystem, String processor, int ram ) {
				
				super(operatingSystem, processor, ram);
			}
			
			public void operatingSystem(){
				System.out.println(operatingSystem + " uses MC OS operating system");
				
			}
			
		}
		
		
		
	}
	


