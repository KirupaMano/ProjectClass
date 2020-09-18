	package org.baseclass;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.concurrent.TimeUnit;
	
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class Base {
		public static WebDriver driver; 
		
		public static void drivermanager() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		public static void iedrivermanager() {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		public static WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			return driver;
		}
		
		public static void browserQuit() {
		driver.quit();	
		}
			public static void loadUrl(String data) {
				driver.get(data);
				driver.manage().window().maximize();
			}
		public static void type(WebElement element, String data) {
			element.sendKeys(data);		
		}
		public static void btnclick(WebElement element) {
			element.click();
		}
		public static void selectVisibleText(WebElement element, String data) {
			Select s =new Select(element);
			s.selectByVisibleText(data);
		}
			
		public static String getData(int rowNum, int cellNum) throws Exception {
				String data = null;
	
				File excelloc =new File(System.getProperty("user.dir") + "\\Excel\\datadriven.xlsx");
				FileInputStream stream =new FileInputStream(excelloc);
				Workbook workBook =new XSSFWorkbook(stream);
				Sheet sheet = workBook.getSheet("Sheet1");
				Row r = sheet.getRow(rowNum);
				Cell c = r.getCell(cellNum); 
				int cellType = c.getCellType();
				if (cellType == 1) {
					data = c.getStringCellValue();
					
				}
				
				if (cellType == 0) {
					if (DateUtil.isCellDateFormatted(c)) {
						data = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
						
					} else {
						data = String.valueOf((long) c.getNumericCellValue());
					}			
				}
				
				return data;
			}
	
				public static void setData(WebElement element, int rowNo, int cellNo, String data) throws IOException {
					File excelloc =new File(System.getProperty("user.dir") +"\\Excel\\datadriven.xlsx");
					FileInputStream stream =new FileInputStream(excelloc);
					Workbook workBook =new XSSFWorkbook(stream);
					Sheet sheet = workBook.getSheet("Sheet1");
					Row r = sheet.getRow(rowNo);
					Cell c = r.createCell(cellNo);
					c.setCellValue(element.getAttribute(data));				
					FileOutputStream o =new FileOutputStream(excelloc);
					workBook.write(o);
					}
				
			public static  void attributeValue(WebElement element, String data) {
			 String attri = element.getAttribute(data);
			 System.out.println(attri);
		}
	}
	
	
