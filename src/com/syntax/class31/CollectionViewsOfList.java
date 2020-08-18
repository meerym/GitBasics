package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfList {
	
	public static void main(String[] args) {
		
	
	
	Map<String, Double> grocery = new HashMap<>();
	grocery.put("Apple", null);
	grocery.put("Milk", 4.99);
	grocery.put("Ice Cream", 2.99);
	grocery.put("Eggs", 4.99);
	grocery.put("Juice", 5.99);
	grocery.put("Milk", 4.40);
	
	System.out.println(grocery);
	
	double value = grocery.get("Milk");
	System.out.println(value);
	
	//how to get All values
	Collection<Double> values = grocery.values();
	
	System.out.println(" --------- get all values 1 by 1 using loop ---------");
	
	for(Double v:values ) {
		System.out.println(v);
	}
	
	System.out.println("--------- get all values 1 by 1 using iterator ---------");
	
	Iterator<Double>it=values.iterator();
	while(it.hasNext()) {
		double v = it.next();
		System.out.println(v);
		
	}
	
	//how to get all keys
	
	Set<String> keys = grocery.keySet();
	System.out.println("--------- get all keys 1 by 1 using iterator ---------");
	
	Iterator<String> keysIterator = keys.iterator();
	
	while(keysIterator.hasNext()) {
		
		System.out.println(keysIterator.next());
	}
	
	System.out.println("--------- get all keys 1 by 1 using loop ---------");
	
	//I want to print key + value pair together
	
	for(String key:keys) {
		
		System.out.println(key + " ==== " + grocery.get(key));
	}
	
	}

}
