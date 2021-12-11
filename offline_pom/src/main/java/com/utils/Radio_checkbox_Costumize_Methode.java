package com.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radio_checkbox_Costumize_Methode {

	WebDriver driver;

	public void radio() {

		List<WebElement> Radios = driver.findElements(By.xpath("//input[@name='gender']"));
		selectRadio("Male", Radios);
	}

	public void selectRadio(String Text, List<WebElement> Radios) {

		for (WebElement radio : Radios) {
			if (radio.getAttribute("value").equals(Text)) {
				radio.click();
				break;
			}
		}

	}
	public void checkboxes(){
		List<WebElement>checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<String> value = new ArrayList<String>();
		value.add("valuename");
		value.add("second value name");
		selectcheckbox(value,checkBoxes);
		
	}

	public void selectcheckbox(List<String> values, List<WebElement>checkBoxes  ) {

		for (WebElement checkbox : checkBoxes) {
			if (checkbox.getAttribute("value").equals(values)) {
				checkbox.click();
				break;
			}
		}
		
	}

}