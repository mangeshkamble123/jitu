package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRepository {

	
	@FindBy(xpath="//tr/th")
	public List<WebElement> head;
	
	@FindBy(xpath="//td[2]")
	public List<WebElement> cols;
	
	@FindBy(xpath="//button[contains(text(),'Add User')]")
	public WebElement user;
	
	@FindBy(id="username")
	public WebElement usern;
	
	@FindBy(id="mobile")
	public WebElement mobile;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='course']")
	public WebElement course;
	
	@FindBy(xpath="//select[@class='form-control']")
	public WebElement select;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(id="submit")
	public WebElement submit;
	
	@FindBy(xpath="//input[@value='Male']")
	public WebElement radiobtn;
	
	
	
	


	
	
}
