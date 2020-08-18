package com.syntax.class25;

public class FinalKeyword {

	
	public static String str= "Hello";
	public static final String username= "Admin"; //final variables MUST be initialized
	public final String PASSWORD= "Admin123";
	
	
	
	public static void main(String[] args) {
		
		System.out.println("str");
		str="Hi";
		System.out.println(str);
		
		System.out.println(username);
		//username= "user123"; COMPILE ERROR: this is the final and we cannot change final value
		
			FinalKeyword fk = new FinalKeyword();
			
			// fk.PASSWORD = "user123"; // COMPILE ERROR: variable is final
			System.out.println(fk.PASSWORD);
	}
	
		public final void hello() { // FINAL HERE DOES NOT ALLOW ANOTHER IMPLEMANTATION TO THIS METHOD
			System.out.println("last hello of today");
			
			
		}
}


//FINAL METHOD CANNOT BE OVERRIDING
//class FinalBaby extends FinalKeyword{
//	
//	public void hello() {
//		System.out.println("Sorry not the last Hello");  //
//		
//		
//	}
//}
