package com.kk.array;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] numbers = { 5, 23, 8, 1, 6, 9,5 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (largest != numbers[i] && numbers[i] > secondLargest) {
				secondLargest = numbers[i];
			}
		}
		
		System.out.println("First largest: "+largest);
		System.out.println("Second largest: "+secondLargest);
	}
}
