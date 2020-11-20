package com.leetcode.leetcode_problems;

public class No33 {
	
	//https://leetcode.com/problems/search-in-rotated-sorted-array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1};
		int target = 3;
		System.out.println(search(nums, target));
	}
	
    public static int search(int[] nums, int target) {
        
    	if(target < nums[0]) {
    		int prev = nums[nums.length-1];
    		for(int i = nums.length-1; i >= 0; i--) {
    			if(nums[i] == target) {
    				return i;
    			}
    			if(nums[i] < target) {
    				break;
    			}
    			if(prev < nums[i]) {
    				break;
    			}
    			prev = nums[i];
    		}
    	}else if(target >= nums[0]) {
    		int prev = nums[0];
    		for(int i = 0; i < nums.length; i++) {
    			if(nums[i] == target) {
    				return i;
    			}
    			if(nums[i] > target) {
    				break;
    			}
    			if(prev > nums[i]) {
    				break;
    			}
    			prev = nums[i];
    		}
    	}
    	
    	
    	return -1;
    }

}
