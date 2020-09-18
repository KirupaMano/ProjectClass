package org.parallel;

import org.testng.annotations.Test;

public class ClassA{
	
	@Test
	private void testCase12() {
		System.out.println("Test Case Number 12: "+Thread.currentThread().getId());
	}
	@Test
	private void testCase13() {
		System.out.println("Test Case Number 13: "+Thread.currentThread().getId());
	}
	@Test
	private void testCase14() {
System.out.println("Test Case Number 14: "+Thread.currentThread().getId());
	}
	
	@Test
	private void testCase15() {
		System.out.println("Test Case Number 15: "+Thread.currentThread().getId());
	}
	@Test
	private void testCase16() {
		System.out.println("Test Case Number 16: "+Thread.currentThread().getId());
	}
	@Test
	private void testCase11() {
System.out.println("Test Case Number 11: "+Thread.currentThread().getId());
	}
}