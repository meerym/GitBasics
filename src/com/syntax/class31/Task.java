package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;


public class Task {
	
	
	public static void main(String[] args) {
		
		
		HashSet<String> countries = new HashSet<>();
		countries.add("Turkey");
		countries.add("USA");
		countries.add("Bangladesh");
		countries.add("Litvania");
		countries.add("Belgium");
		
		Iterator<String> c = countries.iterator();
		
		String it = c.next();
		System.out.println(it);
	}
	

}
