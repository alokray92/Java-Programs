package com.java.object.cloning;

public class DeepCloning {
	public static void main(String[] args) {
		CloneExample ce = new CloneExample();
		ce.setNum(3);
		ce.setStudent(new Student(1,"Alok","MCA"));
		System.out.println("Before cloning");
		System.out.println("ce:" + ce);
		CloneExample ceShallowClone = ce.clone();
		CloneExample cdDeepClone = ce.deepClone();
		System.out.println("\n After cloning, setting ce num to 5");
		ce.setNum(5);
		System.out.println("After cloning, setting ce thing name to Prasad");
		Student student=ce.getStudent();
		student.setName("Prasad");

		System.out.println("ce:" + ce);
		System.out.println("ceShallowClone:" + ceShallowClone);
		System.out.println("cdDeepClone:" + cdDeepClone);

	}
}
