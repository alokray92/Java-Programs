package com.java.interfaces.nested;

class Example {
	void method() {
		System.out.println("Inside the Example Class");
	}

	interface interfaceB {
		default void method1() {
			System.out.println("Inside Default Method of InterfaceB");
		}
	}
}
public class NestedInterfaceInClass extends Example implements Example.interfaceB{

	
	public static void main(String[] args) {
		Example.interfaceB obj=new NestedInterfaceInClass();
		obj.method1();
		Example obj1=new NestedInterfaceInClass();
		obj.method1();
	}
}
