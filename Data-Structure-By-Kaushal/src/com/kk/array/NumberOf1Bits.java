package com.kk.array;

public class NumberOf1Bits {

	/*
	 * leet code 191. Number of 1 Bits
	 */
	public static void main(String[] args) {
		/*
		 * 101=5
		 */
		System.out.println("Result : " + hammingWeight(5));
	}

	public static int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}
}
