package com.java.jvm.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class StackForLoops {
	static List <Integer> reverseRecursive(List<Integer> list){
		if (list.size()<=1){
			return list;
		}
		else{
		List<Integer> reversed =new ArrayList<Integer>();
		reversed.add(list.get(list.size()-1));
		reversed.addAll(reverseRecursive(list.subList(0, list.size()-1)));
		return reversed;
		}		
	}
	
	 static List <Integer> reverseIterative(List<Integer> list){
		 long start = System.currentTimeMillis();
		for(int i=0;i<list.size()/2;i++){
			final int temp=list.get(i);
			list.set(i, list.get(list.size()-i-1));
			list.set(list.size()-i-1, temp);
		}
		long end = System.currentTimeMillis();
        System.out.println("reverseIterative takes " +
                                    (end - start) + "ms");
		return list;
		
	}
}
