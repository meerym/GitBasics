package com.syntax.class19;

public class AccessingEmployeeMembers {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "Meryem";
		emp.lastName = "Akcay";
		emp.age= 27;
		emp.salary=900000;
		// 
		//emp.ssn -->  private
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		// emp.displaySsn(); private can't be accessed outside of the class
		
		
		
		
	}
	
	
	
	
}
