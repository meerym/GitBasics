package com.syntax.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	
	public static void main(String[] args) {
		
		//create a map off grocery that hold item: price
		Map<String, Double> grocery = new HashMap<>();
		grocery.put("Apple", null);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 4.40);
	//	grocery.put(null, 0.00);  HashMap can have at least 1 null key
	//	grocery.put(Cup, null);  HashMap can have multiple null values
		
		System.out.println(grocery);
		
		//LinkedHashMap preserve insertion order of keys
		Map<String, Double> mall = new LinkedHashMap<>();
		mall.put("Cologne", 99.99);
		mall.put("Shirt", 109.99);
		mall.put("Shoes", 100.99);
		mall.put("Soap", 10.99);
		mall.put("Cologne", 99.99);
		mall.put("Tea", 5.99);
	//	mall.put(null, null);
		
		System.out.println(mall);
		
		
		TreeMap<String, Double> shoppingList= new TreeMap<>();
		shoppingList.putAll(grocery);
		shoppingList.putAll(mall);
		//TreeMap we cannot have null keys
		
		
		System.out.println(shoppingList);
		
		
		
		
		Map<String, Double> ht = new Hashtable<>();
		
		ht.put("House", 6000000.00);
		ht.put("Car", 60000.00);
		ht.put("Food", 100.00);
		ht.put("Cup", 10.00);
		
		System.out.println(ht);
		
		//HashTable does not allow null keys and null values
	}

}
