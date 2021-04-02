package com.cts.prime.login;

public class Student_Details {

	public void student_Data() {
		System.out.println("Student Data");
	}

	public void student_Data(int id) {
		System.out.println("Student id : " + id);
	}

	public void student_Data(String name, char initial) {

		System.out.println("Student name : " + name);
		System.out.println("Initial : " + initial);

	}

	public static void main(String[] args) {

		// ClassName objName = new ClassName();

		Student_Details details = new Student_Details();

		// method calling

		details.student_Data();
		details.student_Data(17);
		details.student_Data("Smith", 'A');

	}

}
