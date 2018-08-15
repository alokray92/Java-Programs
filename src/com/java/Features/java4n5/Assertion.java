package com.java.Features.java4n5;

import java.util.Scanner;

/**
 *
 * 	Assertion is a statement in java. 
	used to test your assumptions about the program.
	If it fails,JVM will throw an error named AssertionError
	used for testing purpose.
	Effective way to detect and correct programming errors.

*/
public class Assertion {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("Please enter your age : ");
		int age =s.nextInt();
		
		assert age>=18:"Not valid";
		System.out.println("Age is "+age);
		
		//assertion should not be used to check arguments in the public methods 
		//because it should result in appropriate runtime exception e.g. IllegalArgumentException, NullPointerException etc.
	}

}
