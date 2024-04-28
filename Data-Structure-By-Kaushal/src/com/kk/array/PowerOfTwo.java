package com.kk.array;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Result : " + isPowerOfTwo(4));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n > 0 && isTrue(n)) {
			return true;
		} else {
			return false;
		}
	}
	private static boolean isTrue(int n) {
		return (n & (n - 1)) == 0?true:false;
	}
}
