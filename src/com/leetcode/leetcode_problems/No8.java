package com.leetcode.leetcode_problems;

public class No8 {

	//https://leetcode.com/problems/string-to-integer-atoi/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   +0 123";
		System.out.println(myAtoi(str));
	}
	
    public static int myAtoi(String str) {
        long num = 0;
        int multiplier = 0;
        boolean number=false;
        str = str.trim();
        
        for(int i = 0; i < str.length(); i++) {
        	if((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57) {
        		number = true;
        		num = num*10 + (int)str.charAt(i)-48;
                if(num > Integer.MAX_VALUE)break;
        	}else if(str.charAt(i) == '-') {
        		if(multiplier != 0 || number) {
        			break;
        		}
        		multiplier = -1;
        	}else if(str.charAt(i) == '+') {
        		if(multiplier != 0 || number) {
        			break;
        		}
        		multiplier = 1;
        	}else {
        	
        		break;
        	}
        	
        }

        if(multiplier == 0)multiplier =1;
        if(num*multiplier > Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(num*multiplier < Integer.MIN_VALUE)return Integer.MIN_VALUE;
        
        return (int)num*multiplier;
    }
}
