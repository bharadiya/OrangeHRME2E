package com.OrangeHRM.Utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrangeHRM.Testcases.BaseClass;

public class Keywords extends BaseClass {
	/**
	 * This method will open a web browser of user's choice
	 * @param browserName {@code String} to be one of "chrome","firefox","edge"
	 * @return void
	 */
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver", "./src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "./src\\test\\resources\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
	}

	/**
	 * Opens the specified URL in web browser
	 * @param url {@code String}
	 * @return void
	 */
	public static void openURL(String url) {
		driver.get(url);
	}

	/**
	 * Sets Implicit wait
	 * @param time {@code long}
	 * @return void
	 */
	public static void setImplicitlyWaits(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	/**
	 * Sets explicit wait for 60s for the element to be clickable
	 * @param WebElement
	 * @return void
	 */
	public static void setExplicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will maximize the browser
	 * @return void
	 */
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
}
