package com.kk.array;

public class FindMaxElement {

	// Find the max element in given array
	public static void main(String[] args) {
		int[] arr = { 100, 200, 5, 9, 600, 70 };
		int max = findMaxElement(arr);
		System.out.println("solution 1 Max : " + max);
		
		int[] arr2 = { 100, 200, 55, 69, 400, 70 };
		int max2 = findMaxElement2(arr2);
		System.out.println("solution 2 Max : " + max2);
	}

	//solution 1
	private static int findMaxElement(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	//solution 2
		private static int findMaxElement2(int[] arr) {
			if (arr == null || arr.length == 0) {
				return 0;
			}
			int max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				 max=Math.max(max, arr[i]);
			}
			return max;
		}
	
	
}
