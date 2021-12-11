package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.jbk.objectRepository.LoginObjectRepository;

public class LoginPages extends LoginObjectRepository {

	WebDriver driver;

	public LoginPages(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public Boolean loginBlank() {

		email.sendKeys("");
		pass.sendKeys("");
		button.click();
		String actual = errormsg.getText();
		String expected = "Please enter email.";
		if (actual.equals(expected)) {
			System.out.println("error massage is match");
			return true;
		} else {
			System.out.println("error massage is not match");
			return false;
		}
	}

	public boolean loginpassword() {
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("");
		button.click();
		String actual = errorpass.getText();
		String expected = "Please enter password.";
		if (actual.equals(expected)) {
			System.out.println("error msg is match");
			return true;
		} else {
			System.out.println("error msg is match");
			return false;

		}

	}

	public boolean login(WebDriver driver) {
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		String act = driver.getTitle();
		String exp = "JavaByKiran | Dashboard";
		if (act.equals(exp)) {
			System.out.println(" msg is match");
			return true;
		} else {
			System.out.println(" msg is not match");
			return false;

		}

	}

	public boolean testtext() {
		String act = checkline.getText();
		String exp = "JAVA | SELENIUM | PYTHON";
		if (act.equals(exp)) {
			System.out.println(" msg is match");
			return true;
		} else {
			System.out.println(" msg is not match");
			return false;

		}
	}

	public boolean registerpage() {

		String act = register.getText();
		String exp = "Register a new membership";
		if (act.equals(exp)) {
			System.out.println(" msg is match");
			return true;
		} else {
			System.out.println(" msg is not match");
			return false;

		}
	}

	public boolean login3() {
		email.sendKeys("kamblemangesh@gmail.com");
		pass.sendKeys("123456");
		button.click();
		String act = invalidloginid.getText();
		String exp = "Please enter email as kiran@gmail.com";
		if (act.equals(exp)) {
			System.out.println(" exp msg is match");
			return true;
		} else {
			System.out.println("exp msg is not match");
			return false;
		}
	}
	public DashBoardPage navigateDashBoardPage(){
		login(driver);
		return new DashBoardPage(driver);
		
	}
}
