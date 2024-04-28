package com.kk.array;

public class FindPivotIndex {

	public static void main(String[] args) {
		int arr2[]= {1,2,9,2,1};//15
		int arr[]= {-1,-1,0,0,-1,-1};//15
		int result1=pivotIndex(arr);
		System.out.println("Result 1 : "+result1);
		System.out.println("Result 2 : "+pivotIndex(arr2));
	}

	public static int pivotIndex(int[] nums) {
		int lsum = 0, rsum = 0;
		for (int i = 0; i < nums.length; i++) {
			rsum = rsum + nums[i];
		}
		for (int j = 0; j<nums.length; j++) {
			rsum = rsum - nums[j];
			if (rsum == lsum) {
				return j;
			}
			lsum = lsum + nums[j];
		}
		return -1;
	}
}
