package com.leetcode.leetcode_problems;

public class No344 {
	//https://leetcode.com/problems/reverse-string/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		for(char si : s) {
			System.out.print(si);
		}
	}
	
    public static void reverseString(char[] s) {
    	
    	char temp;
    	for(int i = 0; i < s.length/2 ; i ++) {
    		temp = s[i];
    		s[i] = s[s.length-1-i];
    		s[s.length-1-i] = temp;
    	}
    	
    }
}
