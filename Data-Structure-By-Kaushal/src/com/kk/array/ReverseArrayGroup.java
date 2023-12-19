package com.kk.array;

import java.util.Arrays;
import java.util.List;

public class ReverseArrayGroup {

	public static void main(String[] args) {
		List<Integer> list=  Arrays.asList(1,2,3,4,5,6,7,8);
		reverseArray(list, list.size(), 3);
		System.out.println(list);
	}
	private static void reverseArray(List<Integer> list,int n,int k) {
		for (int i = 0; i < n; i=i+k) {
			int low=i;
			int high=i+k-1;
			if(high>n-1) {
				high=n-1;
			}
			while(low<high) {
				int temp=list.get(low);
				list.set(low, list.get(high));
				list.set(high, temp);
				low++;high--;
			}
		}
	}
}
