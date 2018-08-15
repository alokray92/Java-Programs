package com.java.Features.java4n5;

public class Widening {
	public static void main(String[] args) {
		short s = 5;
		int s1 = 6;
		long s3 = 7;
		m1(s, s1);

		m2(s3);
	}

	// widening is allowed only with the primitive data type to its
	// corresponding wrapper class
	static void m2(Long s) {
		System.out.println("Long");

	}

	static void m1(short s, int s1) {
		System.out.println("1st");
	}

	static void m1(Short s, Integer s1) {
		System.out.println("second");
	}

}
