package com.java.object;

class RestrictObjectCreation {
	private static RestrictObjectCreation object;
	public static int objCount;

	private RestrictObjectCreation() {
		System.out.println("Singleton(): Private constructor invoked");
		objCount++;
	}

	public static RestrictObjectCreation getInstance() {
		if (objCount < 3) {
			object = new RestrictObjectCreation();
		}
		return object;
	}
}

public class RestrictObjectCreationTest {
	public static void main(String[] args) {
		RestrictObjectCreation obj1 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj2 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj3 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj4 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj5 = RestrictObjectCreation.getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
	}
}