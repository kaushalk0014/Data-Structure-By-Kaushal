package com.kk.array;

public class FindSmallestAndSndsmallest {

	public static void main(String[] args) {
		//int arr[] = { 5, 56, 45, 25, 89, 520 };
//		int arr[] = { 2,2,2,2,6 };
		int arr[]= {5, 11, 1, 6, 6, 8, 11, 5, 12, 11 ,6, 1, 7};
		int result[] = findSmallestAndSndSmallest(arr, arr.length);
		System.out.println("Smallest value is: " + result[0]);
		System.out.println("Second smallest value is: " + result[1]);
	}

	public static int[] findSmallestAndSndSmallest(int[] arr, int n) {
		int[] ans = new int[2];
		int smallest = Integer.MAX_VALUE;
		int secSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
				if(arr[i]<smallest) {
					secSmallest=smallest;
					smallest=arr[i];
				}else if(arr[i]<secSmallest&&arr[i]!=smallest) {
					secSmallest=arr[i];
				} 
		}
		ans[0]=smallest;
		ans[1]=secSmallest;
		return ans;
	}
}
