package com.leetcode.leetcode_problems;

public class No7 {
	//https://leetcode.com/problems/reverse-integer/
	public static void main(String [] arg) {
		int x = 1534236469;
		System.out.println(reverse(x));
	}
	
	public static int reverse(int x) {
		long rs = 0;
		int sign = 1;
		if(x < 0) {
			sign = -1;
			x *= -1;
		}
		int multiplier = (int) Math.pow(10, Math.floor(Math.log10(x)));
		while(x != 0) {
			rs += (long)x%10*multiplier;
			if(rs > Integer.MAX_VALUE)return 0;
			multiplier /= 10;
			x /= 10;
		}
		rs *= sign;
		
		return (int)rs;
	}
}
