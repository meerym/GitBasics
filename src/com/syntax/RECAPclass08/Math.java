package com.syntax.RECAPclass08;

public class Math{
	
	//If I don't want to create the object of the class I use static keyword
	//the variables or methods are static it means, you don't need to create object you can call them by class name
	
	public String name;
	String phone; //it is the most restricted one being as default,
	protected String address;
	private int SSN;
	
	//this method can be access everywhere in the project
	public static int add(int num1, int num2){ //method, it will find these parameters and give me back the result
			return num1 + num2;  
		}

    //this method can be accessed from inside the package and from everywhere through inheritance
    protected static int multiply(int num1, int num2) {
	
	        return num1 *num2;
}   
    
    //default, when don't 
    static int subtract(int a, int b) {
    	return a -b;
    }
    
    private static int divide(int y, int z) {//only inside this methods I will use these parameter names
    	
    		if (z==0) {
    			return -1;
    		}
    		
    		return y / z;
    		
    		
    }

    
    public static void main(String[] args) { //main method: it will start executing the code
    	int result = 0;
    	result = Math.add(4,7); //I don't need to refer Math class since we are already in there
    	
    	System.out.println("addition result: " + result);
    	
    	result = multiply(4,6);
    	System.out.println("Multiplication result:" + result);
    	
    	result = subtract(6,10);
    	System.out.println("Subtraction result: " + result);
    	
    	result = divide(6,0);
    	System.out.println("Division result: " +result);
    	
    	
    	 //First I have to create the object/instance than we can access the variable
    	

		Math m = new Math();
		
		m.name = "Math";
		m.phone = "(123)  456-7890";
		m.address = "Virginia, USA";
		m.SSN = 123678907;
	
		System.out.println(m.SSN);
    	
    	
    }







}