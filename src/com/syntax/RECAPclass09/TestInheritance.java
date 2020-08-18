package com.syntax.RECAPclass09;

public class TestInheritance {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student("James", "Miller", "ID00001");
//		stu.name ="James";
//		stu.lastName= "Miller";
//		stu.stuId= "ID00001";
		
		Student stu2 = new Student("Keira", "Knox", "ID00002");
		
		Student stu3 = new Student("Kylie", "Jainer", "ID00003");
		
		School stu4 = new School("Jenny", "Connely");
		
		School school =new School("Charlie", "Chaplin");
		
		School.schoolName= "Syntax Technologies";
		
		
		//objects of student type
		stu1.printDetails();	
	    stu2.printDetails();	
		stu3.declareValues(); //inherits the parent methods
		
		
		//objects of school type
		stu4.declareValues();
		school.declareValues();
		
		System.out.println(School.schoolName);
	
	//	System.out.println(stu4.schoolName);
	}

}
