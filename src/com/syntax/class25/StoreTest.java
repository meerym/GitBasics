package com.syntax.class25;

public class StoreTest {
	
	public static void main(String[] args) {
		
	Store macys = new Macys("Macys", "Tysons, Virginia");
	Store starbucks = new Starbucks("Starbucks", "New York");
    Store nike = new Nike("Nike", "Los Angeles", "running");
		
    
   
    String[] array = {"Hello", "Hi" };
    Store[] myStores = {macys, starbucks, nike};	
    
    
    
    
    //Array of store type 
    Store[] stores = {new Macys("Macys", "Florida"), new Starbucks("Starbucks", "Texas"), new Nike("Nike", "Los Angeles", "running")};
    
    int size = stores.length;   
    System.out.println("There are "+size + " stores");
	System.out.println("              ______________");
    
    for(Store s:stores) {
    	s.openHours();
    	s.sell();
    	System.out.println("              ______________");
    	System.out.println(" ");
    }
    
    System.out.println("______________LOOPING MY STORES ARRAY__________");
    
    for (int i=0; i<myStores.length; i++) {
    	
    	myStores[i].openHours();
    	System.out.println();
    	
    }
    
	}

}
