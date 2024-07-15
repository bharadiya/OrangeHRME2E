package com.OrangeHRM.Utilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

	/*
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
	
//	----------------***********Select***********----------------
	
	public static void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectOptionBy(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);		
	}
	
	public static List<WebElement> selectDropDownOptionsList(WebElement element) {
		Select select = new Select(element);
		return select.getOptions();
	}

	public static List<String> getDropDownOptionsTextList(WebElement element) {
		
		List<WebElement> optionsList = selectDropDownOptionsList(element);
		List<String> optionsTextList = new ArrayList<String>();
		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	public static void selectDropDownValue(WebElement element, String expValue) {
		List<WebElement> optionsList = selectDropDownOptionsList(element);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}
	
//	----------------***********Send Keys - Actions***********----------------
	
	public static void doSendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public static void doActionsSendKeys(WebElement element, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(element, value).build().perform();
	}

	public static void doClick(WebElement element) {
		element.click();
	}
	
	public static void doActionsCick(WebElement element) {
		Actions act = new Actions(driver);
		act.click().build().perform();
	}

	public static String doElementGetText(WebElement element) {
		return element.getText();
	}

	public static String getElementAttribute(WebElement element, String attrName) {
		return element.getAttribute(attrName);
	}
	
	
	
}
