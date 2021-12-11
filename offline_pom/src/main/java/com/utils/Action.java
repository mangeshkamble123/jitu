package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.testbase.TestBase;

public class Action extends TestBase {

	WebDriver driver;
	public void typeIn(WebElement element, String test){
	
		element.sendKeys(test);
	}
	
	public void click (WebElement element){
	
		element.click();
	}
	

	public void dragAndDrop(WebElement source, WebElement target){
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target);
	}
	
	public void moveToElementAndClick(WebElement element){
		Actions act = new Actions(driver);
        act.moveToElement(element).click().build().perform();
		
	}
	public void moveToElement(WebElement element, WebElement target){
		Actions act = new Actions(driver);
        act.moveToElement(element).click(target);
		
	}
	
	
	//if we use find by to get webelement then no need to write this method
	
	public WebElement getElement(String locType, String locatorValue){
	
		if (locType.equals("xpath"))
			
		return driver.findElement(By.xpath(locatorValue));;
	if (locType.equals("id"))
	return driver.findElement(By.id(locatorValue));
	
	else
		return null;
	}
	
	
}



