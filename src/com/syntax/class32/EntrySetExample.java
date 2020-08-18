package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class EntrySetExample {

	public static void main(String[] args) {
Map<Integer, String> floors = new LinkedHashMap<>();
		
		floors.put(1, "Meryem & CO.");
		floors.put(2, "Ahmed & CO.");
		floors.put(3, "Olga & CO.");
		floors.put(4, "Sema & CO.");
		floors.put(5, "Semra & CO.");
		floors.put(6, "Gozde & CO.");
		
		System.out.println("Floors map: " + floors);

		
		
		Set<Entry<Integer, String>>entries = floors.entrySet();
		
		System.out.println("Set Entry objects: " + entries);
		
		System.out.println("----------Retrieving key and value pair from Entry using For Loop----------");
		
		for(Entry<Integer, String> ent:entries) {
			System.out.println(ent.getKey()+ " ----" + ent.getValue());
		}
		
		
		System.out.println("----------Retrieving key and value pair from Entry using Iterator----------");
		
		Iterator<Entry<Integer, String>> it = entries.iterator();
	
		
		while(it.hasNext()) {
		Entry<Integer, String> ent = it.next();
		
			
		System.out.println(ent.getKey()+ "======" + ent.getValue());
		}
	}

}
