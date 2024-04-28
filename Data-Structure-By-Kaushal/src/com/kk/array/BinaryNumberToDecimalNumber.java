package com.kk.array;

public class BinaryNumberToDecimalNumber {
	public static void main(String[] args) {
		System.out.println("Result : " + binaryToDecimal("10101"));
	}

	public static int binaryToDecimal(String str) {
		int base = 1;
		int ans = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '1') {
				ans = ans + base;
			}
			base *= 2;
		}
		return ans;
	}
}
