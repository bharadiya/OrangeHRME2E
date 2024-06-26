package com.OrangeHRM.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Admin']/parent::a")
	WebElement admin;
	
	@FindBy(how = How.XPATH, using = "//div[@class='orangehrm-header-container']/button")
	WebElement addButton;
	
	public void clickAdminButton() {
		admin.click();
	}

	public void clickAddButton() {
		addButton.click();
	}
	
	public WebElement getWebElementAdmin() {
		return admin;
	}
	
	public WebElement getWebElementAddButton() {
		return addButton;
	}
}
