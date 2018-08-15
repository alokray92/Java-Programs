package com.java.eight.functional;

public class MyDataImplStatic implements MyData  {
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImplStatic obj = new MyDataImplStatic();
		obj.print("");
		obj.isNull("abc");
	}
}
