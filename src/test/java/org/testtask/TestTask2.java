package org.testtask;

import java.util.Date;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTask2 extends Base{


	@BeforeClass
	private void launchBrowser() {
		drivermanager();
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

	
	@Test(priority=-444)
	private void testCase2() {
		System.out.println("Test Case Number 2");
		loadUrl("http://adactinhotelapp.com/");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		type(txtUsername, "Kiruptesting");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		type(txtPassword, "abcd#1234");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnclick(btnLogin);
	}
	@Test(priority=44)
	private void testCase3() {
		System.out.println("Test Case Number 3");
		loadUrl("http://adactinhotelapp.com/");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		type(txtUsername, "Kiupatesting");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		type(txtPassword, "abcd#1234");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnclick(btnLogin);
	}
	@Test(priority=99)
	private void testCase4() {
		System.out.println("Test Case Number 4");
		loadUrl("http://adactinhotelapp.com/");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		type(txtUsername, "Kirupatesting");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		type(txtPassword, "abcd#1234");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnclick(btnLogin);
	}
	@Test(priority=-33)
	private void testCase5() {
		System.out.println("Test Case Number 5");
		loadUrl("http://adactinhotelapp.com/");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		type(txtUsername, "Kirupateting");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		type(txtPassword, "abcd#1234");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnclick(btnLogin);
	}
	@Test(priority=-333)
	private void testCase1() {
		System.out.println("Test Case Number 1");
		loadUrl("http://adactinhotelapp.com/");

		WebElement txtUsername = driver.findElement(By.id("username"));
		type(txtUsername, "Kirupatsting");

		WebElement txtPassword = driver.findElement(By.id("password"));
		type(txtPassword, "abcd#1234");

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnclick(btnLogin);
	}
}
