package com.OrangeHRM.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddUser {

	WebDriver driver;

	public AddUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//label[text()='User Role']/../following-sibling::div")
	WebElement selectUserRole;

	@FindBy(how = How.XPATH, using = "//label[text()='ESS']/../following-sibling::div")
	WebElement selectOptionESS;

	public void clickSelectUserRole() {
		selectUserRole.click();
	}

	public WebElement getWebElementselectUserRole() {
		return selectUserRole;
	}
}
