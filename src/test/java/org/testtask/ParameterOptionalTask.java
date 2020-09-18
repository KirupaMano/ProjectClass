package org.testtask;

import java.util.Date;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterOptionalTask extends Base{
	@BeforeClass
	private void launchBrowser() {
		drivermanager();
		loadUrl("http://adactinhotelapp.com/");
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
	@Parameters({"emmail","password"})
	@Test 
	private void testCase1(@Optional("testing") String emailId ,@Optional("1234") String pass) {
		System.out.println("Test Case Number 1");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		type(txtUsername, emailId);
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		type(txtPassword, pass);
		
		WebElement btnLogin = driver.findElement(By.id("login"));
	
		btnclick(btnLogin);
}
}