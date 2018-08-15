package com.java.datastructure.queue;

public class TestQ {

	public static void main(String[] args) {
	/*	IntQ q=new IntQ();
		q.enqueue(3);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(9);
		q.showAll();*/
		
		PersonQ q=new PersonQ();
		q.enqueue(new Person("Alok","7"));
		q.enqueue(new Person("Sallu","17"));
		q.showAll();
	}

}
