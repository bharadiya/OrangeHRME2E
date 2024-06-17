package com.OrangeHRM.Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.OrangeHRM.Utilities.Keywords;

public class BaseClass {
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String username = "Admin";
	public static String password = "admin123";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeTest
	public void setUp() throws InterruptedException {
		logger = Logger.getLogger("OrangeHRM");
		PropertyConfigurator.configure("log4j.properties");
		Keywords.openBrowser("edge");
		Keywords.maximizeWindow();
		Keywords.openURL(url);
		logger.info("URL is opened");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		logger.info("Browser closed");
	}
}
