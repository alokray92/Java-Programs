package com.java.object;

public class AbstractTest {
	public static void main(String[] args) {
		Polymerphic p=new Role();
		p.method1();
		method(null);
	}

	public static void method(Object object) {
		System.out.println("Object Impl");
		
	}
	public static void method(String s) {
		System.out.println("String impl");
		
	}
	
}
