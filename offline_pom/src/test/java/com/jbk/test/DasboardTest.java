package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DashBoardPage;
import com.jbk.pages.LoginPages;
import com.testbase.TestBase;

public class DasboardTest extends TestBase {

	WebDriver driver;
	DashBoardPage dp;
	LoginPages lp;

	@BeforeClass
	public void OpenUrl() {
		driver = initialization();

		//reportInit();
		dp = loadLoginPages().navigateDashBoardPage();
	}

	@Test
	public void verifyuserdata() {
		Assert.assertTrue(dp.userDataTest());
	}

	@Test
	public void verifynavigation() {
		Assert.assertTrue(dp.mainNavigationChoices());

	}

	@Test
	public void verifycource() {
		Assert.assertTrue(dp.coursesName());

	}

	@Test
	public void verifycourcedis() {
		Assert.assertTrue(dp.courseDiscription());
	}

	@Test
	public void verifydash() {
		Assert.assertTrue(dp.dashboardtext());
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}