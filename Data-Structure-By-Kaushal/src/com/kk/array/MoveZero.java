package com.kk.array;

import java.util.Arrays;
import java.util.List;

public class MoveZero {

	public static void main(String[] args) {
		List<Integer> list=  Arrays.asList(0,2,0,4,5,0,7,0);
		moveZero(list);
		System.out.println(list);
	}

	private static void moveZero(List<Integer> list) {
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)!=0) {
				list.set(count, list.get(i));
				count++;
			}
		}
		while (count<list.size()) {
			list.set(count, 0);
			count++;
			
		}
		
	}
}
