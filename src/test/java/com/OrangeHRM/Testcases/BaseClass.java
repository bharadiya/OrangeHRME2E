package com.OrangeHRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String username = "Admin";
	public static String password = "admin123";
	public static WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(10000);
	}
	
	public void tearDown() {
		driver.close();
	}
}
