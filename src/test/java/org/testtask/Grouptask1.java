package org.testtask;

import java.util.Date;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouptask1 extends Base{
	@BeforeClass
	private void launchBrowser() {
		drivermanager();
		//loadUrl("http://adactinhotelapp.com/");
	}
	@AfterClass
	private void quitBrowser() {
		browserQuit();	
		}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("Start time");
		Date start = new Date();
		System.out.println(start);
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("End time");
		Date end = new Date();
		System.out.println(end);
	}
	
	@Test(groups="Santiy")
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
	@Test(groups="Santiy")
	private void testCase5() {
		System.out.println("Test Case Number 5");
				
	}
	@Test(groups="Santiy")
	private void testCase1() {
		System.out.println("Test Case Number 1: "+Thread.currentThread().getId());
	
	}
}
