package com.kk.array;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]={1,2,5,6,8,9,11};
		System.out.print("[1,2,5,6,8,9,11] \n");
	 
//		int result[]=reverseArray(arr);
//		System.out.println("Using for loop");
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i]+" ");
//		}
		
		
		int result2[]=reverseArray2(arr);
		System.out.println("\nUsing while loop");
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i]+" ");
		}
	}
	
	public static int[] reverseArray(int []arr) {
		int low=0;
		int high=arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;high--;
		}
		return arr;
	}
	public static int[] reverseArray2(int []arr) {
		int low=0;
		int high=arr.length-1;
		while(low<high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;high--;
		}
		return arr;
	}
}
