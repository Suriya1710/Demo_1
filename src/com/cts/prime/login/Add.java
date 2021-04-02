package com.cts.prime.login;

public class Add {

	// parameterized constructor
	public Add(String type) {

		System.out.println("constructor type : "+type);

	}

	public static void main(String[] args) {

		Add a = new Add("Parameterized");

	}

}
