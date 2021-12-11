package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.testbase.TestBase;

public class DriverUtility extends TestBase{

	WebDriver driver;
	
	public void switchToFrameById (String id){
		driver.switchTo().frame(id);
		
	} 

	
	public void switchToFrameByindex (int index){
		driver.switchTo().frame(index);
		
	}

	
	public void switchToFrameByElement(WebElement element){
		driver.switchTo().frame(element);
		
	}
	
	public void switchToWindow(String id){
		driver.switchTo().window(id);
	
	}
		
}
