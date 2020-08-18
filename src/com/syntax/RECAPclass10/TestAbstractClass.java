package com.syntax.RECAPclass10;

public class TestAbstractClass {
	
	
	public static void main(String[] args) {
		
		ChaseBankATM obj = new ChaseBankATM(1500.00, 300.00);
		
     		obj.depositMoney("checking", 8000.00);
     		
     		
//		   System.out.println(obj.checkingFund);
    		
//    		obj.depositCheck("saving", 450);
    		
//    		obj.withdrawMoney("checking", 365.00);
    		
//    		obj.withdrawMoney("saving", 500);
    		
    		obj.withdrawMoney("checking", 100);
    		
    		// can we create an object abstract class?
    		// we can create in an indirect way??
    	
    	 BankATM atm = new ChaseBankATM(1500.00, 45000.00); // --> We can create on object of abstract indirectly
    ​
    		
    
    
    // can we create constructor inside an abstract class?
    		
    		// 1. What kind of OOPs concepts we applied in this example?
    		
    		// abstraction -- inheritance -- polymorphism --> method overriding-- dynamic binding -- run time polymorphism
    ​
    		// can we make abstract method final?
    		
    		// can we make abstract method private? Why?
    		
    		// can we make an abstract method static? Why?
    		
    		// can we reduce visibility of method while implementing inside the child class? 
    		
    		// do we have to have an abstract method inside and abstract class?
    		
    		// 0-100% abstraction

	}
}
