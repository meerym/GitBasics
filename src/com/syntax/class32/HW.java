package com.syntax.class32;

//import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> floors = new LinkedHashMap<>();
		
		floors.put(1, "Meryem & CO.");
		floors.put(2, "Ahmed & CO.");
		floors.put(3, "Olga & CO.");
		floors.put(4, "Sema & CO.");
		floors.put(5, "Semra & CO.");
		floors.put(6, "Gozde & CO.");
		
		System.out.println("Original map : " + floors);
		System.out.println("The size of map " + floors.size());
		
		String company = floors.get(4);
		System.out.println(company);
		
		System.out.println("-------------------");
		
		Set<Integer> keys = floors.keySet();
		
		for(int key:keys) {
			System.out.println(key + "---->"+ floors.get(key));
		}
		
		
		System.out.println("-------------------");
		
		Iterator<Integer> iterator = keys.iterator();
		while(iterator.hasNext()) {
		int key = iterator.next();
			
     	System.out.println(key + "----->" + floors.get(key));
	// System.out.println(iterator.next() + " ---" + floors.get(iterator.next()));
    // This wont work
     	
	    }
		
		System.out.println("-------------------");
		
		
	//	Collection<String> values = floors.values();
     	for(String val:floors.values()) {
     		System.out.println(val);
     	}
     	
     	System.out.println("-------------------");
		
     	
        Iterator<String> valuesIterator	=floors.values().iterator();
        while(valuesIterator.hasNext()) {
        	System.out.println(valuesIterator.next());
        }
		                     //map //collection //iterator//string type of object it brings
        String something   = floors.values().iterator().next();
        System.out.println(something);
        
                //map //set    //iterator  //integer
       int k = floors.keySet().iterator().next();
               //i,s //integer //integer //integer
       
       System.out.println(k);
        
		}

}
