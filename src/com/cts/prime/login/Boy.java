package com.cts.prime.login;

public class Boy {

	public void boy_Name(String name) {

		System.out.println("Boy name : " + name);

	}

	public static void main(String[] args) {

		Boy b = new Boy();

		// method calling

		b.boy_Name("Smith");

		// up casting
		
		Boy m = new Marriage();
		m.boy_Name("Watson");
		
		
		
	}

}
