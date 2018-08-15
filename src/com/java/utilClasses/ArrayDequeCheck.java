package com.java.utilClasses;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayDequeCheck {
	public static void main(String[] args) {
		/*List<String> list=new ArrayList<String>();
		list.add("Alok");*/
		ArrayDeque<String> aq=new ArrayDeque<String> ();
		aq.add("A");
		aq.add("B");
		aq.add("C");
		aq.offerFirst("D");
		aq.offerLast("E");
		
		Iterator<String> itr= aq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
