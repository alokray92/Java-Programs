package com.java.datastructure.doublylinkedlist;

public class DLinkedList {
	private Node head;

	public DLinkedList(int item) {
		head = new Node();
		head.value = item;
		head.next = null;
		head.prev=null;
	}

	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.prev = null;
		head.prev = n;
		n.next = head;
		head = n;
		return true;
	}

	public void printList() {
		Node z = head;
		while (z != null) {
			System.out.println(z.value);
			z = z.next;
		}
	}

	public boolean deleteitem(int item) {
		if (head.next.value == item) {
			head.next = head.next.next;
			return true;
		} else {
			Node x = head;
			Node y = head.next;
			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}
			if (y != null) {
				x.next = y.next;
				return true;
			} else {
				return false;
			}
		}

	}

	class Node {
		private Node prev;
		private int value;
		private Node next;
	}
}
