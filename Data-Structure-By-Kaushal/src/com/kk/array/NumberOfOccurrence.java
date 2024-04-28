package com.kk.array;

public class NumberOfOccurrence {
	/*
	 * https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1?itm_source=
	 * geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
	 */
	public static void main(String[] args) {
		int arr[]= {1, 1, 2, 2, 2, 2, 3};
		int result=count(arr, arr.length, 2);
		System.out.println("Result : "+result);
	}

	static int  count(int[] arr, int n, int x) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 2) {
				count++;
			}
		}
		return count;
	}
}
