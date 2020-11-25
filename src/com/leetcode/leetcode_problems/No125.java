package com.leetcode.leetcode_problems;

public class No125 {
	//https://leetcode.com/problems/valid-palindrome/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
        
		if(s.isEmpty())return true;
        
		s = s.trim().toLowerCase().replace(" " , "");

		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			if(!(s.charAt(left) >= 97 && s.charAt(left) <=122) && !(s.charAt(left) >= 48 && s.charAt(left) <=57 )) {
				left++;
			}else if(!(s.charAt(right) >= 97 && s.charAt(right) <=122) && !(s.charAt(right) >= 48 && s.charAt(right) <=57 )) {
				right--;
			}else {
				if(s.charAt(left)!=s.charAt(right)) {
					return false;
				}
				left++;
				right--;
			}

			
		}
		
		return true;
    }
}
