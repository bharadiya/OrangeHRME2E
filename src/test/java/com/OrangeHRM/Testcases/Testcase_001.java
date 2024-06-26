package com.OrangeHRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.Pageobjects.AddUser;
import com.OrangeHRM.Pageobjects.Home;
import com.OrangeHRM.Utilities.Keywords;

public class Testcase_001 extends BaseClass {
	@Test
	public void addEmployee() {
		Home h = new Home(driver);
		Keywords.setExplicitWait(h.getWebElementAdmin());
		h.clickAdminButton();
		Keywords.setExplicitWait(h.getWebElementAddButton());
		h.clickAddButton();

		AddUser a = new AddUser(driver);
		Keywords.setExplicitWait(a.getWebElementselectUserRole());
		a.clickSelectUserRole();
	}

	@Test
	public void assertTitle() {
		Assert.assertEquals(Keywords.getPageTitle(), "OrangeHRM");
	}
}
