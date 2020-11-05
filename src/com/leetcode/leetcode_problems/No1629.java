package com.leetcode.leetcode_problems;

public class No1629 {
	
	//https://leetcode.com/problems/slowest-key/
	//1629. Slowest Key
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] releaseTimes = {12,23,36,46,62};
		String keysPressed = "spuda";
		
		System.out.println(slowestKey(releaseTimes, keysPressed));
	}
	
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        
    	int [] times = new int[26];
    	char c = keysPressed.charAt(0);
    	
    	times[keysPressed.charAt(0)-97] = releaseTimes[0];
    	
    	for(int i = 1; i < releaseTimes.length; i++) {
    		int temp = releaseTimes[i] - releaseTimes[i-1];
    		int pos = keysPressed.charAt(i)-97;
        	times[pos] = times[pos]>temp?times[pos]:temp;
    	}
    	
    	int max = 0;
    	for(int i = 0; i < 26; i++) {
    		if(times[i] >= max) {
    			max = times[i];
    			c = (char)(97+i);
    		}
    	}
    	
    	return c;
    }

}
