package com.java.datastructure.doublylinkedlist;

public class TestMain {

	public static void main(String[] args) {
		DLinkedList list = new DLinkedList(2);
		list.insertItem(5);
		list.insertItem(8);
		list.printList();
		System.out.println();
		list.deleteitem(5);
		list.printList();

	}

}
