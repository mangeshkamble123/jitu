package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.jbk.objectRepository.UserRepository;
import com.utils.GetData;
import com.utils.Radio_checkbox_Costumize_Methode;

public class UserPage extends UserRepository {
	int count = 1;
	WebDriver driver = null;
	Radio_checkbox_Costumize_Methode rb;
	
	

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean heading() {

		List<WebElement> headingrow = head;
		int count = headingrow.size();
		System.out.println(count);
		List<String> Actrow = new ArrayList<String>();

		for (WebElement Element : headingrow) {
			Actrow.add(Element.getText());
		}
		System.out.println("act" + Actrow);
		List<String> Exprow = new ArrayList<String>();
		for (int i = 0; i <= 7; i++) {
			Exprow.add(GetData.getDataFromCell(0, i, "Sheet7"));
		}
		System.out.println("exp" + Exprow);
		if (Actrow.equals(Exprow)) {
			System.out.println("act page match");
			return true;
		} else {
			System.out.println("act page not match");
			return false;
		}

	}


	public boolean columncheck() {

		List<WebElement> col = cols;
		int colsize = col.size();
		System.out.println(colsize);
		List<String> actcol = new ArrayList<String>();
		for (WebElement elemant : col) {
			actcol.add(elemant.getText());
		}
		System.out.println("act" + actcol);
		List<String> expcol = new ArrayList<String>();
		for (int i = 1; i <= 4; i++) {
			expcol.add(GetData.getDataFromCell(i, 1, "Sheet7"));
		}
		System.out.println("exp" + expcol);
		if (actcol.equals(expcol)) {
			System.out.println("act page match");
			return true;
		} else {
			System.out.println("act page not match");
			return false;
		}

	}
	
	public Boolean adduser() throws InterruptedException {
		user.click();
		usern.sendKeys("mangesh");
		mobile.sendKeys("1234567890");
		email.sendKeys("kmangesh123@gmail.com");
		course.sendKeys("java");
		
		radiobtn.click();
		
        
		WebElement selectt = select;
		Select sel = new Select(selectt);
		sel.selectByIndex(3);
		
		pass.sendKeys("12345");
		submit.click();
		Thread.sleep(10000);
		String popup = driver.switchTo().alert().getText();
		System.out.println(popup);
		driver.switchTo().alert().accept();
		return true;

}
}