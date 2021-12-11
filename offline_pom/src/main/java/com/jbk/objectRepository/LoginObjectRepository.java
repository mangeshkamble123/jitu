package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjectRepository {

	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(xpath="//button")
	public WebElement button ;
	
	@FindBy(id="email_error")
	public WebElement errormsg;
	
	@FindBy(id="password_error")
	public WebElement errorpass;
	
	@FindBy(xpath="/html/body/div/div[1]/a/h4")
	public WebElement checkline;
	
	@FindBy(xpath="/html/body/div/div[2]/a")
	public WebElement register;
	
	@FindBy(xpath="/html/body/div/div[2]/form/div[1]/div")
	public WebElement invalidloginid;
	
	
}
