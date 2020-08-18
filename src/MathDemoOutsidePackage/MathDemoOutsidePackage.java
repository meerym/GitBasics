package MathDemoOutsidePackage;

import com.syntax.RECAPclass08.Math;

public class MathDemoOutsidePackage extends Math {
	
	
	public static void main(String[] args) {
	
	
	int result = 0;
	
	
	//I have to specify Math in another package
	
	//This method can be accessed from everywhere since it is public
	result = Math.add(4, 7);
	System.out.println("Addition result: " + result);
	
	
	
	//This method is accessed from outside through inheritance
	result = Math.multiply(4,6);
	System.out.println("Multiplication result: " + result);
	
	//result = Math.subtract(6, 10);
	//System.out.println("Subtraction result: " + result);
	
	//This method cannot be accessed from outside Match class
	//result = Math.divide(12, 5);
	//System.out.println("Division result:" + result);
	
	Math m = new Math();
	
	m.name = "Math";
	//m.phone = "(123)  456-7890";
	//m.address = "Virginia, USA";
	
	
	//This cannot be accessed because it is private
	//m.SSN = 123678907;
	
	
	
	
	MathDemoOutsidePackage m2 = new MathDemoOutsidePackage(); //I created the object of this class 
	       
	//and initialized it to the variable of another class:
	
	m2.name = "Math";
	//m2.phone = "(123)  456-7890";
	
	m2.address = "Virginia, USA";
	
	
	//This variable cannot be accessed because it is private
	//m2.SSN = 123678907;
	
			
}

}
