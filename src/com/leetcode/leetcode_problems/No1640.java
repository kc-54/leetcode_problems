package com.leetcode.leetcode_problems;

public class No1640 {
	
	//https://leetcode.com/problems/check-array-formation-through-concatenation/
	//1640. Check Array Formation Through Concatenation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {91,4,64,78};
		int [][]pieces = {{78}, {4,64}, {91}};
		
		System.out.println(canFormArray(arr, pieces));
	}

	//Using stringbuilder
	//runtime 1 ms
    public static boolean canFormArray(int[] arr, int[][] pieces) {
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i : arr) {
    		sb.append(i);
    		sb.append(",");
    	}
    	
    	for(int i = 0; i < pieces.length; i++) {
    		StringBuilder cur = new StringBuilder();
    		
    		for(int j = 0; j < pieces[i].length; j++) {
    			cur.append(pieces[i][j]);
    			cur.append(",");
    		}
    		
    		if(!sb.toString().contains(cur.toString()))return false;
    	}
    	
    	return true;
    }
    
    //using brute force
    //run time 7ms 
    public static boolean canFormArray_1(int[] arr, int[][] pieces) {
        
    	for(int i = 0; i < arr.length; i++) {
    		boolean found = false;
    		for(int j = 0; j < pieces.length; j++) {
				System.out.println("b " + arr[i] + " " + pieces[j][0]);
    			if(arr[i] == pieces[j][0]) {
    				int k = pieces[j].length;
    				int l = 1;
    				while(l < k) {
    					i++;
    					System.out.println("a " + arr[i] + " " + pieces[j][l]);
    					if(arr[i] != pieces[j][l])return false;
    					l++;
    				}
    				found = true;
    			}
    		}
    		System.out.println(i);
    		if(!found)return false;
    	}
    	
    	
    	return true;
    }

}
