package com.java.object;

 abstract class Polymerphic {
	 static int i;
	Polymerphic(){
		System.out.println("Polymerphic constructor");
		i=16;
	}
	abstract void method1();
}

 class Role extends Polymerphic {

	 Role(){
			System.out.println("Role Constructor");
		}
	void method1() {
		System.out.println("Role ");
		System.out.println(i);
	}

	
}