package com.kk.array;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 8, 4, 7 };
		int sum = sumOfArray(arr);
		System.out.println("sum= "+sum);
	}

	private static int sumOfArray(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
