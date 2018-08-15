package com.java.Features.java4n5;

/**
 * 
	Automatic conversion of primitive data types into its equivalent wrapper type is Autoboxing and 
	Opposite operation is unboxing. Feature of Java 5
*/
public class AutoboxingUnboxing {

	
	public static void main(String[] args) {
		//Autoboxing
		int a =50;
		Integer a1=new Integer(a);
		Integer a2= 5;
		System.out.println(a1+" Autoboxing "+	a2);
		
		
		//unboxing
		Integer i=new Integer(30);
		int a3=i;
		System.out.println("Unboxing "+a3);
		
		
		
	}
	
}
