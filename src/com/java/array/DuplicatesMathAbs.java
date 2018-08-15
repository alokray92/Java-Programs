package com.java.array;

public class DuplicatesMathAbs {
	public static void main(String[] args) {
		DuplicatesMathAbs dm = new DuplicatesMathAbs();
		int[] arr = new int[] { 1,1, 2, 3, 4, 5, 4, 5, 2, 6, 7, 10, 8, 9, 10 };
		int size=arr.length;
		dm.findDuplicates(arr, size);

	}

	void findDuplicates(int[] arr, int size) {
		 int i;  
	        System.out.println("The repeating elements are : ");
	    
	        for (i = 0; i < size; i++)
	        {
	        	
	        	//it checks for each array value as index to the array which helps in comparing with the elements.
	            if (arr[Math.abs(arr[i])] >= 0)
	                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	            else
	                System.out.print(Math.abs(arr[i]) + " ");
	        }         

	}

}
