package com.OrangeHRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.Pageobjects.LoginPage;
import com.OrangeHRM.Utilities.Keywords;

public class Testcase_001 extends BaseClass {
	@Test
	public void checkLogin() {
		LoginPage lp = new LoginPage(driver);
		Keywords.setExplicitWait(lp.getElementUsername());
		lp.enterUserName(username);
		logger.info("Entered username successfully");
		lp.enterPassWord(password);
		logger.info("Entered password successfully");
		lp.clickLoginButton();
		logger.info("Clicked login button successfully");
	}
}
