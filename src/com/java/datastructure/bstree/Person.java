package com.java.datastructure.bstree;

public class Person {
	private String name;
	private String age;
	public Person(String nm, String a){
		name=nm;
		age=a;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String toString (){
		return "Name: "+this.name+", Age: "+this.age;
	}
}
