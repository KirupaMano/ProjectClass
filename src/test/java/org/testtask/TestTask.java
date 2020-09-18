package org.testtask;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTask {

	@BeforeClass
	private void launchBrowser() {
		System.out.println("Launch");
	}
	@AfterClass
	private void quitBrowser() {
		System.out.println("Quit");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("Start");
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("End");
	}
	@Test
	private void testCase12() {
		System.out.println("Test Case Number 12");
	}
	@Test
	private void testCase13() {
		System.out.println("Test Case Number 13");
	}
	@Test
	private void testCase11() {
System.out.println("Test Case Number 11");
	}
}
