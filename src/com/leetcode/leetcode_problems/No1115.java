package com.leetcode.leetcode_problems;

import java.util.concurrent.Semaphore;

public class No1115 {
	//https://leetcode.com/problems/print-foobar-alternately/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class FooBar {
	    private int n;

	    Semaphore run1,run2;
	    public FooBar(int n) {
	        this.n = n;
	        run1 = new Semaphore(1);
	        run2 = new Semaphore(0);
	    }
	    
	    public void foo(Runnable printFoo) throws InterruptedException {

	        for (int i = 0; i < n; i++) {
	            run1.acquire();
	        	// printFoo.run() outputs "foo". Do not change or remove this line.
	        	printFoo.run();
	            run2.release();
	        }
	    }

	    public void bar(Runnable printBar) throws InterruptedException {
	    	
	        for (int i = 0; i < n; i++) {
	            run2.acquire();
	            // printBar.run() outputs "bar". Do not change or remove this line.
	        	printBar.run();
	            run1.release();
	        }
	    }
	}
}
