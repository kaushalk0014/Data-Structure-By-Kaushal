package com.kk.array;

public class FindMinAndMax {
//Find minimum and maximum element in an array

//https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

	public static void main(String[] args) {
		long arr[] = { 3, 2, 57, 56, 99, 600 };
		Pair pair = getMinMax(arr, arr.length);
		System.out.println("Solution 1 = " + pair);

		long arr2[] = { 5, 62, 45, 25, 89, 520 };
		Pair pair2 = getMinMax2(arr2, arr2.length);
		System.out.println("Solution 2 = " + pair2);
	}

	private static Pair getMinMax2(long[] arr, int n) {
		long max = arr[0];
		long min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return new Pair(min, max);
	}

	private static Pair getMinMax(long a[], long n) {
		long max = a[0];
		long min = a[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		return new Pair(min, max);
	}

}

class Pair {
	long min, max;

	public Pair(long min, long max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public String toString() {
		return "Pair [min=" + min + ", max=" + max + "]";
	}

}
