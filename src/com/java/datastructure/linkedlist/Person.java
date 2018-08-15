package com.java.datastructure.linkedlist;

public class Person {
	private String name;
	private String rollno;
	public Person(String name, String rollno){
		this.name=name;
		this.rollno=rollno;	
	}
	
	public String getName() {
		return name;
	}

	public String toString (){
		return "Name: "+this.name+", Roll No: "+this.rollno;
	}
}
