package com.java.collection.iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyCollectionIterator {
	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
		myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println(myList);
       /* Iterator<String> it=myList.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }*/
        
        myList.add(1, "SQL");
        myList.add(2, "Spring");
        System.out.println(myList);
        System.out.println(myList.get(5));
        Collections.sort(myList);
        System.out.println(myList);
	}
}
