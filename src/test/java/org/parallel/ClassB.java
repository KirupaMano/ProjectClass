package org.parallel;

import org.testng.annotations.Test;

public class ClassB {
	@Test 
	private void testCase2() {
		System.out.println("Test Case Number 2: "+Thread.currentThread().getId());
	}
	@Test 
	private void testCase3() {
		System.out.println("Test Case Number 3: "+Thread.currentThread().getId());
	}
	@Test
	private void testCase4() {
System.out.println("Test Case Number 4: "+Thread.currentThread().getId());
	}
	
	@Test 
	private void testCase5() {
		System.out.println("Test Case Number 5: "+Thread.currentThread().getId());
	}
	@Test 
	private void testCase6() {
		System.out.println("Test Case Number 6: "+Thread.currentThread().getId());
	}
	@Test 
	private void testCase7() {
		System.out.println("Test Case Number 7: "+Thread.currentThread().getId());
	}
	@Test 
	
	private void testCase1() {
System.out.println("Test Case Number 1: "+Thread.currentThread().getId());
	}
}
