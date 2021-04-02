package com.cts.prime.login;

public class Student_Datas {

	public void student_Id() {
		// first method

		System.out.println("Student Id : 1710");

	}

	private void student_Name() {
		// second method
		System.out.println("Student name : Smith");

	}

	// main method
	public static void main(String[] args) {

		// ClassName objName = new ClassName();

		Student_Datas data = new Student_Datas();

		// method calling

		data.student_Name();
		data.student_Id();

	}

}
