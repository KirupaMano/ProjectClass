package org.parallel;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExceutionTest extends Base {
	
	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void testCase1(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if (browserName.equals("ie")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	driver.get("http://adactinhotelapp.com/");
	}
	

}
	
