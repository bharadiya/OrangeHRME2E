package com.OrangeHRM.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@name='password']/../../parent::div/following-sibling::div[1]//button")
	WebElement login;

	public void enterUserName(String u) {
		username.sendKeys(u);
	}

	public void enterPassWord(String p) {
		password.sendKeys(p);
	}

	public void clickLoginButton() {
		login.click();
	}
	
	public WebElement getElementUsername() {
		return username;
	}
}
