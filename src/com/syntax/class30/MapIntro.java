package com.syntax.class30;

import java.util.HashMap;

public class MapIntro {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		
		//storing object inside map as aKey and Value Pair
		hm.put(10, "John"); //K+V = Entry
		hm.put(11, "Jane");
		hm.put(12, "James");
		
		System.out.println(hm);
		
		//cannot have duplicate keys
		hm.put(12, "Meryem");
		hm.put(13, "Ahmet");
		//can have duplicate values
		hm.put(14, "Meryem");
		
		System.out.println(hm);
		
		//how many entry objects inside the map?
		
		int entryObjects = hm.size();
		System.out.println(entryObjects);
		
		//how to check whether map has any elements?
		
		boolean isEmpty = hm.isEmpty();
		System.out.println(isEmpty);
		
		
		//check if map has specific key or value?
		boolean hasKey = hm.containsKey(12);
		System.out.println("Map contains key object 12 " + hasKey);
		
		boolean hasValue = hm.containsValue("Meryem");
		System.out.println("Map contains Value Meryem " + hasValue);
		
		//how to retrieve 1 value from the Map
		
		String value = hm.get(13);
		System.out.println(value);
		
		//how to remove a key from a map
		
		hm.remove(10);
		System.out.println(hm);
		
	}

}
