package com.java.datastructure.bstree;

public class TestBST {
	public static void main(String[] args) {
		
		Person p1=new Person("Alok", "25");
		Person p2=new Person("Sallu", "22");
		Person p3=new Person("Ram", "27");
		Person p4=new Person("Mahesh", "21");
		Person p5=new Person("Suresh", "30");
		BST bst=new BST();
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);
		bst.showAll(bst.findNode("Alok"));
		
		Person p=bst.getData(bst.findParent("Mahesh"));
		System.out.println(p.toString());
	}
}
