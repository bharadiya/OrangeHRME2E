package com.OrangeHRM.Testcases;

import org.testng.annotations.Test;

import com.OrangeHRM.Pageobjects.LoginPage;

public class Testcase_001 extends BaseClass {
	@Test
	public void checkLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(username);
		lp.enterPassWord(password);
		lp.clickLoginButton();
	}
}
