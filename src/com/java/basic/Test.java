package com.java.basic;


public class Test {
	public static void main(String[] args) {
		String s = "ama Kudia Members";
		char c='a';
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.equals(sb.reverse()));
		//System.out.println(s.substring(5,9));
	String s1=removeChar(s, c);
	System.out.println(s1);
	}

	private static String removeChar(String s, char c) {
		
		if(s==null){
			return s;
		}
		s=s.replaceAll(" ", "");
		s=s.replaceAll(Character.toString(c), "");
		return s.toLowerCase(); 
	}
}
