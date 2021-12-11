package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.UserPage;
import com.testbase.TestBase;

public class UserTest extends TestBase {

	WebDriver driver = null;
	UserPage up = null;

	@BeforeClass

	public void logineuser() {
		driver = initialization();

		//reportInit();

		up = loadLoginPages().navigateDashBoardPage().navigateUserPage(driver);
		// up = new UserPage(driver);
	}

	@Test
	public void varifyheading() {
		Assert.assertTrue(up.heading());
	}

	@Test
	public void varifycol() {
		Assert.assertTrue(up.columncheck());
	}

	@Test
	public void varifadduser() throws InterruptedException {
		Assert.assertTrue(up.adduser());

	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}