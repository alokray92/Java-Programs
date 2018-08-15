package com.alok.java.object.clone;

public class ObjectCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		DummyBean dum = new DummyBean();
		dum.setDummy("foo");
		System.out.println(dum.getDummy()); // prints 'foo'

		DummyBean dumtwo =(DummyBean) dum.clone();
		System.out.println(dumtwo.getDummy()); // prints 'foo'

		dum.setDummy("bar");
		System.out.println(dumtwo.getDummy());
		
	}
}
class DummyBean  implements Cloneable{
	private String Dummy;

	public String getDummy() {
		return Dummy;
	}

	public void setDummy(String dummy) {
		Dummy = dummy;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
}