package org.testtask;

import java.util.Date;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupTask extends Base{
	
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
	
	@Test(dataProvider="Searchtexts")
	private void testCase2(String items) {
		System.out.println("Test Case Number 2");
		loadUrl("https://www.amazon.in/");
		
		WebElement txtUsername = driver.findElement(By.id("twotabsearchtextbox"));
		txtUsername.sendKeys(items);
		WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
		btnclick(btnLogin);
	}
	@DataProvider(name="Searchtexts")
	public Object[][] search() {
		return new Object[][] {
			{"iPhone 11"},{"Samsung"},{"Laptops"},{"Desktop"},{"Motorola"},{"chairs"},{"Memory Card"},{"Pendrive"}
	};
}
	}
