package com.java.interfaces.nested;

interface InterfaceA {
	void display();

	interface InterfaceB {
		void method1();
	}
}

public class NestedInterfaceDemo1 implements InterfaceA.InterfaceB {
	
	@Override
	public void method1() {
		System.out.println("Implemented the nested interface and override it");

	}

	public static void main(String[] args) {
			InterfaceA.InterfaceB obj=new NestedInterfaceDemo1();
			obj.method1();
	}

}
