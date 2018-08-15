package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=12;
		findPairs_Double_ForLoop(arr, sum);
		
		
	}

	private static void findPairs_Double_ForLoop(int[] arr, int sum) {
		System.out.println("Given array : " + Arrays.toString(arr));
        System.out.println("Integer numbers, whose sum is equal to value : " + sum);
       List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++){
        	for (int j=1;j<arr.length;j++){
        		if((arr[i]+arr[j]==sum)&&!(list.contains(arr[i]))){
        			list.add(arr[i]);
        			list.add(arr[j]);
        			System.out.println("Combination "+arr[i]+" ,"+arr[j]);
        			
        		}
        	}
        }
        
		
	}
}
