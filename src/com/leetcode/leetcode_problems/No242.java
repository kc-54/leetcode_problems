package com.leetcode.leetcode_problems;

public class No242 {

	//https://leetcode.com/problems/valid-anagram/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nl";
		String t = "cx";
		System.out.println(isAnagram(s, t));
	}
    public static boolean isAnagram(String s, String t) {
        
    	int[] s1 = new int[26];
    	int[] s2 = new int[26];
    	
    	if(s.length()!=t.length())return false;
    	for(int i = 0; i < s.length(); i++) {
    		s1[(int)s.charAt(i)-97]++;
    		s2[(int)t.charAt(i)-97]++;
    	}

    	for(int i = 0; i < s1.length; i++) {
    		if(s1[i] != s2[i])return false;
    	}
    	return true;
    	
    }
}
