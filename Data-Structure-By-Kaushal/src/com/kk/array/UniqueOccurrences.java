package com.kk.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {

	public static void main(String[] args) {
		 int[] example1 = {1, 2, 2, 1, 1, 3};
	        int[] example2 = {1, 2,2};

	        System.out.println("Result: "+uniqueOccurrences(example1)); // Output: true
	        System.out.println("Result: "+uniqueOccurrences(example2)); // Output: false
	}
	 public static boolean uniqueOccurrences(int[] arr) {
		 
	        Map<Integer, Integer> map = new HashMap<>();
	      
	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	            
	        }
	        Set<Integer> occurrencesSet = new HashSet<>(map.values());
	        return occurrencesSet.size() == map.size();
	    }
}
