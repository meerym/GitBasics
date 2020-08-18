package com.syntax.class32;
import java.util.Iterator;
//
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HOMEWORK3 {
//	 Create a Map from array of cities that will sort keys in alphabetical order. 
//   As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	 If any city name is more than 7 characters remove that city . 

	public static void main(String[] args) {
		
		
		String[] city= {"Istanbul", "Paris", "Londan", "NewYork", "Beirut"};
		
		
		
			
	Map<String, Integer>cityMap = new TreeMap<>();
		
	cityMap.put(city[0], city[0].length());
	cityMap.put(city[1], city[1].length());
	cityMap.put(city[2], city[2].length());
	cityMap.put(city[3], city[3].length());
	cityMap.put(city[4], city[4].length());
	
	for (int i =0; i<city.length; i++) {
		cityMap.put(city[i], city[i].length());
		
	}
	
	
	for(String c:city) {
		cityMap.put(c, c.length());
		
		
	}
	
	System.out.println(cityMap);
	
	Iterator<Entry<String,Integer>> iterator = cityMap.entrySet().iterator();
	
	
	while(iterator.hasNext()) {
		
		Entry<String, Integer> entry = iterator.next();
		
		if (entry.getValue()>7) {
			iterator.remove();
		}
	}
	
	System.out.println("Map after removal " + cityMap);
	
	
	
	}
	
	
	
	
}
	

