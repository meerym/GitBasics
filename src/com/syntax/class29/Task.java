package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<>();
		
		
		alist.add("Ahmet");
		alist.add("Meryem");
		alist.add("Ruhan");
		alist.add("Kamil");
		alist.add("Selami");
		
		System.out.println(alist);
		
		System.out.println("   ");///////////
		
		alist.clear();
		System.out.println("Collection after clear ->>" + alist);
		
		System.out.println("   ");//////////
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Mehmet");
		list.add("Merve");
		list.add("Rusen");
		list.add("Kemal");
		list.add("Selma");
		
		
		System.out.println(list);
		
		System.out.println("   ");//////////
		
		alist.addAll(list);
		System.out.println("Names after adding all objects from list collection ->> " + alist);
		System.out.println("   ");//////////
		
		System.out.println("Objects inside list collection ->> " + list);
		
		alist.remove("Selma");
		System.out.println("   ");//////////
		System.out.println("After removing new name5 ->> " + alist);
		
		
		
		System.out.println();
		boolean emp = alist.isEmpty();
		System.out.println(emp);
		
		
		boolean str = alist.contains(4);
		System.out.println(str);
		
		
		int size = alist.size();
		System.out.println(size);
		
		//how to retrieve a value
		
		String s =alist.get(3);
		System.out.println(s);
		
		
		//how to retrieve values 1 by 1
		
		for(String a:alist) {
			
			System.out.println(a);
			
			if(a.equals("Kemal")) {
				System.out.println("You are awesome");
				
			}
		}
		
		System.out.println("Retrieving values from ArrayList using for loop");
		
		for(int i=0; i<alist.size(); i++) {
			
			String si = alist.get(i);
			System.out.println(si);
			
		}
		
		
		System.out.println("Retrieving values from ArrayList using iterator");
		
		Iterator<String> it=alist.iterator();
		while(it.hasNext()) {
			String a =it.next();
			System.out.println(a);
		}
		
		
		
	}
	

}
