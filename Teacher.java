package com.assingment;

public class Teacher {
	String designation = "Teaacher";
	String collegeName = "IMPS College of Engineering & Technology";
	void work() {
		System.out.println("Teaching students...");
	}
	
	public static void main(String[] args) {
		ITTeacher obj = new ITTeacher();
		System.out.println("Department:- " + obj.department);
		System.out.println("Designation:- " + obj.designation);
		System.out.println("College Name:- " + obj.collegeName);
		obj.work();
		
	}

}

class ITTeacher extends Teacher {
	String department = "IT";
	
}

