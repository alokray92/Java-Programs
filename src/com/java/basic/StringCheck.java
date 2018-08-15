package com.java.basic;

public class StringCheck {
	public static void main(String[] args) {
		String s="java";
		String s2= "JAVA";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		s.toUpperCase();
		s2.toUpperCase();
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		s=s.toUpperCase();
		s2=s2.toUpperCase();
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
	}
}
