package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

	public class HOMEWORK {
//	Create a map of countries with its capital that will store countries in alphabetical order.
//	Print all keys and values from a country map using for each loop and iterator.
//	Print all values from a country map using for each loop and iterator.

	
		public static void main(String[] args) {	
			Map<String, String> countries = new TreeMap<>();
			countries.put("Turkey", "Ankara");
			countries.put("USA","Washington D.C.");
			countries.put("Italy", "Rome");
			countries.put("Lichtenstein", "Vaduz");
			countries.put("Sweden", "Stockholm");
		
			
						System.out.println("      USING LOOP      ");
			
		Collection<String> keys = countries.keySet();
		for(String key:keys) {
			System.out.println(key + " " + countries.get(key));	
		}
						System.out.println("  ");
						System.out.println("      USING ITERATOR      ");
	
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key + " " + countries.get(key));
		}
		
}
	
}
