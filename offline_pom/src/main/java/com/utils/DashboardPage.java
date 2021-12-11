package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DashboardPage {
	WebDriver driver;
	WebElement element;
	String celldata;

	@BeforeSuite
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Hanshu/Desktop/Selenium/Offline%20Website/Offline%20Website/index.html");
		commanValidLogin();

	}

	public void commanValidLogin() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();

	}

	@Test(priority=1)
	public void courseSelenium() throws Exception {
		String act = driver.findElement(By.xpath("//h3[contains(text(),'Selenium')]")).getText();
		Assert.assertEquals(act, ExcelReadCell.readCell(1, 0));

	}

	@Test(priority=2)
	public void courseJavaJ2EE() throws Exception {
		String act = driver.findElement(By.xpath("//h3[contains(text(),'Java / J2EE')]")).getText();
		Assert.assertEquals(act, ExcelReadCell.readCell(2, 0));

	}

	@Test(priority=3)

	public void coursePython() throws Exception {
		String act = driver.findElement(By.xpath("//h3[contains(text(),'Python')]")).getText();
		Assert.assertEquals(act, ExcelReadCell.readCell(3, 0));

	}

	@Test(priority=4)
	public void coursePhp() throws Exception {
		String act = driver.findElement(By.xpath("//h3[contains(text(),'Php')]")).getText();
		Assert.assertEquals(act, ExcelReadCell.readCell(4, 0));

	}

	@Test(priority=5)
	public void userLinkClick() throws Exception {

		driver.findElement(By.xpath("//span[text()='Users']")).click();
		String act = driver.getTitle();
		Assert.assertEquals(act, ExcelReadCell.readCell(1, 1));
		// span[text()='Users']
	}

	@Test(priority=6)
	public void operatorLinkClick() throws Exception {
		driver.findElement(By.xpath("//span[text()='Operators']")).click();
		String act = driver.getTitle();
		Assert.assertEquals(act, ExcelReadCell.readCell(2, 1));

	}

	@Test(priority=7)
	public void usefulLinkClick() throws Exception {
		driver.findElement(By.xpath("//span[text()='     Useful Links']")).click();
		String act = driver.getTitle();
		Assert.assertEquals(act, ExcelReadCell.readCell(3, 1));

	}

	@Test(priority=8)
	public void downloadsLinkClick() throws Exception {
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		String act = driver.getTitle();
		Assert.assertEquals(act, ExcelReadCell.readCell(4, 1));

	}

	@Test(priority=9)
	public void logoutLinkClick() throws Exception {
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		String act = driver.getTitle();
		Assert.assertEquals(act, ExcelReadCell.readCell(5, 1));

	}
}
