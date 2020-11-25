package com.leetcode.leetcode_problems;

public class No387 {
	
	//https://leetcode.com/problems/first-unique-character-in-a-string/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(firstUniqChar(s));

	}
    public static int firstUniqChar(String s) {
        
    	int rs = s.length()+1;
    	int[] chars = new int[26];
    	
    	for(int i = 0; i < chars.length; i++) {
    		chars[i] = -2;
    	}
    	
    	for(int i = 0; i < s.length(); i++) {
    		int pos = (int)s.charAt(i)-97;
    		if(chars[pos] == -2) {
    			chars[pos] = i;
    		}else if(chars[pos] >= 0) {
    			chars[pos] = -1;
    		}
    	}
    	
    	boolean found = false;
    	for(int i = 0; i < chars.length; i++) {
    		if(chars[i] >= 0) {
    			rs = Math.min(rs, chars[i]);
    			found = true;
    		}
    	}
    	
    	
    	return found?rs:-1;
    }
}
