package com.kk.array;

public class SumTwoNumber {

	public static void main(String[] args) {
		int sum=sumTwoNumber(25, 5);
		System.out.println(sum);
		int arr[]= {25,4,6,9,7,88};
		
		int min=findMinValue(arr);
		System.out.println("Min "+min);
	}
	
	public static int sumTwoNumber(int first,int sec) {
		int sum=0;
		sum=first+sec;
		return sum;
	}
	
	public static int findMinValue(int[] arr) {
		int min=0;
		for (int i = 0; i < arr.length; i++) {
			
		}
		return min;
	}
}
