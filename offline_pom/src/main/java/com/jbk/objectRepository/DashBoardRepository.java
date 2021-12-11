package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardRepository {

	@FindBy(xpath="//span[text()='Users']")
	public WebElement button;
	
	@FindBy(xpath="//tr/td")
	public List<WebElement> name;
	
	@FindBy(xpath="//li//following::span")
	public List<WebElement> navigation;
	
	@FindBy(xpath="//h3")
	public List<WebElement> course;
	
	@FindBy(xpath="//h3//following::p")
	public List<WebElement> coursedisc;
	
	@FindBy(xpath="/html/body/div/div[1]/section[1]/h1")
	public WebElement dashbord;
	
	
	
	
}
