package com.java.datastructure.stack;

public class Test {

	public static void main(String[] args) {
		/*IntStack in=new IntStack();
		
		if (!in.isFull()){
			
			in.push(2);
			in.push(4);
			in.push(6);
			in.push(9);
			
		}
		
		System.out.println(in.pop());
		System.out.println(in.pop());
		System.out.println(in.pop());
		System.out.println(in.pop());*/
		
		
		Person p1=new Person("Alok", "7");
		Person p2=new Person("Sallu", "17");
		PersonStack stack=new PersonStack();
		stack.push(p1);
		stack.push(p2);
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
	}

}
