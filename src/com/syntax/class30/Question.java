package com.syntax.class30;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question {
	
	
	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<>();
		
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> set = new LinkedHashSet<>(aList);
		
		//set.addAll(aList);
		
		System.out.println(set);
		
		Set<String> lList = new LinkedHashSet<>();
		lList.add("Turkey");
		lList.add("USA");
		lList.add("Bangladesh");
		lList.add("Litvania");
		lList.add("Belgium");
		
		List<String> list = new ArrayList<>();
		
		String country = list.get(2);
		System.out.println(country);
	}
	

		
	}


