package com.kk.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(toBinary(7));
	}

	private static List<Integer> toBinary(int num) {
		List<Integer> list = new ArrayList<Integer>();
		while (num > 0) {
			list.add(num % 2);
			num = num / 2;
			System.out.println(num);
		}
		Collections.reverse(list);
		return list;
	}

	 
}
