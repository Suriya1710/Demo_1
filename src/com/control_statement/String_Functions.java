package com.control_statement;

public class String_Functions {

	public static void main(String[] args) {
		
		String s = "Welcome To Java";
		
		// index
		
		int index = s.length()-1;
		
		System.out.println("index : "+index);
		
		// equals
		
		boolean equals = s.equals("Welcome To java");
		
		System.out.println("Equals Or not : "+equals);
	
		// equalsIgnoreCase
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("WelCOME TO JAVA");
		
		System.out.println("Equals Ignore Case : "+equalsIgnoreCase);
		
		// upper case
		
		String upperCase = s.toUpperCase();
		System.out.println("Uppercase : "+upperCase);
		
		// lower case
		
		String lowerCase = s.toLowerCase();
		
		System.out.println("Lowercase : "+lowerCase);
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
