package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args ) {
		
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Hello"); // index 0
		arrayList.add("Welcome"); // index 1
		arrayList.add("How are you"); //index 2
		
		
		//how many elements inside my ArrayList
		
		int arrayListSize = arrayList.size();
		System.out.println(arrayListSize);
		
		
		//how to access elements from ArrayList
		
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);
		
		//I would like to add more objects into ArrayList
		
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		
		System.out.println("Size of ArrayList after adding more String Objects = " + arrayList.size());
		
		//Let's remove "Hello";
		arrayList.remove(0);
		
		System.out.println("size of arrayList after removing Object " + arrayList.size());
		
		//I want to update value "Good Bye"  --- "Bye"
		
		arrayList.set(2, "Bye");
	    System.out.println("ArrayList after replacing Object " + arrayList);
		
		
		//
		
		
 		
		
		
		
		
		
	}

}
