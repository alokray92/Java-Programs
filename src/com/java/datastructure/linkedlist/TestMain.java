package com.java.datastructure.linkedlist;

public class TestMain {

	public static void main(String[] args) {
	/*	IntLinkedlist list=new IntLinkedlist();
		list.insertItem(2);
		list.insertItem(5);
		list.insertItem(8);
		list.insertItem(3);
		list.printList();

		list.sortList();
		list.printList();*/
		
		Person p1=new Person("Alok", "7");
		Person p2=new Person("Sallu", "17");
		
		PersonLinkedList list=new PersonLinkedList(p1);
		
		list.insertItem(p2);
		list.printList();
		
	}

}
