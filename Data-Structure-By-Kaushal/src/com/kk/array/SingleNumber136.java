package com.kk.array;

public class SingleNumber136 {

	public static void main(String[] args) {
		int [] arr= {14,5,16,14,16};
		System.out.println("Result :"+singleNumber(arr));
	}
	
	public static int singleNumber(int[] nums) {
        int ans=0;
        
        for(int i=0;i<nums.length;i++)   {
            ans=ans^nums[i];
        }
        return ans;
    }
}
