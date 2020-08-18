package com.syntax.class19;

public class Employee {
	
	public static String company; //any class from any package
	
	
	
	public String name, lastName; 
	protected int age;            //if the class is in the same package
	double salary; //default      //if the class is in the same package
	private long ssn;             //no one only its own class has access




	static void displayCompany() {
		
		System.out.println("Employee works at " + company);
	}
	
	
	public void displayName() {
		
		System.out.println("Employee name is " + name + " " + lastName);
	}
	
	protected void displayAge() {
		
		System.out.println( "Employee is " + age + " years old");
		
	}
	
	void displaySalary() {
		
		System.out.println("Employee earns " + salary );
	}
	
	private void displaySsn() {
		
		System.out.println("Employee ssn is " + ssn);
		
	}
	
	
	public static void main(String[] args) {
		
		 company= "Google";
		 
		Employee emp = new Employee();
		
		emp.name = "Meryem";
		emp.lastName = "Akcay";
		emp.age = 27;
		emp.salary = 900000;
		emp.ssn = 728025730;
		
		
	}

}



