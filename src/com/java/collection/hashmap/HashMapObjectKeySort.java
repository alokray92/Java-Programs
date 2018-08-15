package com.java.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapObjectKeySort {
	public static void main(String[] args) {
		 MySort sort = new MySort();
		Employee e1 = new Employee(4, "Mahesh", "MSc");
		Employee e2 = new Employee(3, "Rupesh", "BCA");
		Employee e3 = new Employee(1, "Akash", "BTech");
		Employee e4 = new Employee(7, "Abdul", "BTech");
		Employee e5 = new Employee(2, "Salman", "Cricket");
		Employee e6 = new Employee(5, "Md Saif", "BioTech");
		Map<Employee, Integer> unsortMap = new HashMap<>();
		unsortMap.put(e1, 10);
		unsortMap.put(e2, 5);
		unsortMap.put(e3, 6);
		unsortMap.put(e4, 20);
		unsortMap.put(e5, 1);
		unsortMap.put(e6, 7);

		System.out.println(unsortMap);

		Map<Employee, Integer> treeMap = new TreeMap<Employee, Integer>(sort);
		 treeMap.putAll(unsortMap);
		 System.out.println(treeMap);

	}
}
