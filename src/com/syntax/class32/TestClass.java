package com.syntax.class32;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TestClass {		 
		 
		 
		 public static void main(String[] args) {
		 
			 
		 Person p1 = new Person("Ahmet", "Akcay", 26, 100.00);
		 Person p2 = new Person("Meryem", "Akcay", 27, 95.000);
		 Person p3 = new Person("Sumeyra", "Mutlu", 31, 105.000);
		 Person p4 = new Person("Kerem", "Bilgic", 15, 99.000);
		 Person p5 = new Person("Halis", "Avci", 27, 100.500);
		 
		 
		 Map<Integer, Person> person = new TreeMap<>();
		 
		 person.put(10001, p1);
		 person.put(10002, p2);
		 person.put(10003, p3);
		 person.put(10004, p4);
		 person.put(10005, p5);
		 
		
		 Set<Entry<Integer, Person>> entries = person.entrySet();	
		 
		 for(Entry<Integer, Person> en:entries) {
			 Person user = en.getValue();
			
			// Integer ID = en.getKey();
     		// System.out.println("User ID : " + ID + " " + user);
			 System.out.println("  --- User Details ---");
			 
			 user.userDetails();
			 
		 }
		 
		 
		 
		 }
	}
