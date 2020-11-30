package com.leetcode.leetcode_problems;

import java.util.concurrent.Semaphore;

public class No1114 {

	//https://leetcode.com/problems/print-in-order/
	
	public static void main(String[] args) throws Exception {
		
	}
	static class Foo {

	    Semaphore run1,run2;
	    
	    public Foo() {
	        
	        run1 = new Semaphore(0);
	        run2 = new Semaphore(0);
	    }

	    public void first(Runnable printFirst) throws InterruptedException {
	    	System.out.println("one");
	        
	        // printFirst.run() outputs "first". Do not change or remove this line.
	        printFirst.run();
	        run1.release();
	    }

	    public void second(Runnable printSecond) throws InterruptedException {
	    	System.out.println("two");
	        run1.acquire();
	        // printSecond.run() outputs "second". Do not change or remove this line.
	        printSecond.run();
	        run2.release();
	    }

	    public void third(Runnable printThird) throws InterruptedException {
	    	System.out.println("three");
	        run2.acquire();
	        // printThird.run() outputs "third". Do not change or remove this line.
	        printThird.run();
	    }
	}
}
