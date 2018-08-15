package com.java.scb;

	import java.util.Stack;

public class MovingTotal {
	
	/**
     * Adds/appends list of integers at the end of internal list.
     */
    public void append(int[] arr) {
      for (int i=0;i<arr.length;i++){
    	  stack.add(arr[i]);
      }
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
    	 
    	int sum=0;
    	for (int j=(stack.size()-3);j<stack.size();j++){
    		sum=sum+stack.peek();
    	}
    	if(total==sum){
    		return true;
    	}
		return false;
    
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));

        movingTotal.append(new int[] { 4 });

        System.out.println(movingTotal.contains(9));
    }
    
    Stack<Integer> stack = new Stack<Integer>();
}