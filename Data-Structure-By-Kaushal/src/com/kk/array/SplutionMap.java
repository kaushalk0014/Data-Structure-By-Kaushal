package com.kk.array;

import java.util.HashMap;
import java.util.Map;

public class SplutionMap {

	public static void main(String[] args) {
		
	}
	
	public int lengthOfLongestSubstring(String s) {
        int start=-1;
        int ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                ans=Math.max(i-(start),ans);
            }else{
                map.put(s.charAt(i),i);    
            }
        }
        return ans;
    }
}
