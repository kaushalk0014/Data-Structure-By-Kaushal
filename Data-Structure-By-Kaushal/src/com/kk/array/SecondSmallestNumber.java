package com.kk.array;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 1, 6, 9 };
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i]<smallest) {
				secondSmallest=smallest;
				smallest=numbers[i];
			}else if(numbers[i]!=smallest&&numbers[i]<secondSmallest) {
				secondSmallest=numbers[i];
			}
		}
		
		System.out.println("First Smallest: "+smallest);
		System.out.println("Second Smallest: "+secondSmallest);
	}
}
