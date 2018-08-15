package com.java.array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumsCount {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 1, 4, 3, 5, 5, 6, 7, 6, 6, 10, 8, 9, 10 };
		Map<Integer, Integer> map = DuplicateCount(arr);
		System.out.println("Duplicate Numbers Count : ");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " is Present :" + entry.getValue()+" times.");
			}
		}

	}

	private static Map<Integer, Integer> DuplicateCount(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}
}
