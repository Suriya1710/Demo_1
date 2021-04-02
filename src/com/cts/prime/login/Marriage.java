package com.cts.prime.login;

public class Marriage extends Boy {

	@Override
	public void boy_Name(String name) {
		super.boy_Name(name); // parent class
System.out.println("Override Boy Name : " + name);

	}

	public static void main(String[] args) {

		Marriage m = new Marriage();

		m.boy_Name("Starc");
		
		//down casting
		
	//	Marriage b = new Boy();
		

	}

}
