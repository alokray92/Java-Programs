package com.java.datastructure.linkedlist;


public class PersonLinkedList {
	private Node head;

	public PersonLinkedList(Person person) {
		head = new Node();
		head.person = person;
		head.link = null;
	}

	public boolean insertItem(Person person) {
		Node n = new Node();
		// n.value = item;
		// n.link = head;
		// head = n;
		// return true;

		Node new_node = new Node();
		new_node = head;
		while (new_node.link != null) {
			new_node = new_node.link;
		}
		n.person = person;
		n.link = null;
		new_node.link = n;
		return true;
	}

	public void printList() {
		Node z = head;
		while (z != null) {
			System.out.println(z.person.toString());
			z = z.link;
		}
	}

	public boolean deleteitem(String name) {
		if (name.equals(head.person.getName())) {
			head = head.link;
			return true;
		} else {
			Node x = head;
			Node y = head.link;
			while (y != null && (y.person.getName().equals(name))) {
				x=y;
				y=y.link;
				
			}
			if (y != null) {
				x.link = y.link;
				return true;
			} else {
				return false;
			}
		}

	}

	

	class Node {
		private Person person;
		private Node link;
	}
}
