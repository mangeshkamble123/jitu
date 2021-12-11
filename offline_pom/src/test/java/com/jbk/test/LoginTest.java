package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPages;
import com.testbase.TestBase;

public class LoginTest extends TestBase {

	WebDriver driver = null;
	LoginPages lp;

	@BeforeSuite
	
	public void browserSetup() {
		driver = initialization();
		lp = loadLoginPages();
		reportInit();
	}

	
	@Test(priority= 3)
	public void verifyloginpass() {
		Assert.assertTrue(lp.loginpassword());

	}

	@Test(priority= 1)
	public void verifyline() {
		Assert.assertTrue(lp.testtext());
	}

	@Test(priority= 2)
	public void verifyregistertext() {
		Assert.assertTrue(lp.registerpage());
	}

	@Test(priority= 4)
	public void verifyerrorlogin() {
		Assert.assertTrue(lp.login3());
	}
	@Test(priority= 5)
	public void verifyBlankData() {
		Assert.assertTrue(lp.loginBlank());

	}

	@Test(priority= 6)
	public void verifycorrectloginpass() {
		Assert.assertTrue(lp.login(driver));
	}

	@AfterSuite
	
	public void teardown() {
		driver.close();
	}
}