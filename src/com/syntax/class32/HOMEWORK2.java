package com.syntax.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HOMEWORK2 {	

	public static void main(String[] args) {
		
	Map<Integer, String> bestBuyStore = new  HashMap<>();
	bestBuyStore.put(20601, "Printer");
	bestBuyStore.put(20602, "Computer");		
	bestBuyStore.put(20603, "Chair");	
	bestBuyStore.put(20604, "Organizer");	
	bestBuyStore.put(20605, "Desk");	

	Set<Entry<Integer, String>> ent = bestBuyStore.entrySet();
	
	System.out.println("Set Entry objects" + ent);
	
	System.out.println("retrieving by Loop");
	
	for(Entry<Integer, String> e:ent) { 
		System.out.println("Product ID: " + e.getKey() + " Product Name: " + e.getValue());
		
	}
	System.out.println("retrieving by Iterator");
	
	Iterator<Entry<Integer, String>> iterator = ent.iterator();
	
	while(iterator.hasNext()) {
	Entry<Integer, String> e = iterator.next();
	System.out.println("Product ID : " + e.getKey()+ " Product Name: " + e.getValue());
	}
	
	
	}
}

