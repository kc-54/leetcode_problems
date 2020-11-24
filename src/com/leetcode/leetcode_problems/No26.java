package com.leetcode.leetcode_problems;

public class No26 {

	//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}
	
	
    public static int removeDuplicates(int[] nums) {
    	
    	int rs = 0;
    	int pos = 0;
    	for(int i = 0; i < nums.length; i++) {
    		int k = nums[i];
    		rs++;
    		while(i<nums.length && nums[i]==k) {
    			i++;
    		}
    		i--;
        	nums[pos] = k;
        	pos++;
    	}
    	
    	return rs;
    }
}
