package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.jbk.objectRepository.DashBoardRepository;
import com.utils.GetData;



public class DashBoardPage extends DashBoardRepository {

	WebDriver driver = null;

	public DashBoardPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public boolean userDataTest() {
		button.click();
		List<WebElement> CoursesName = name;
		List<String> ActCoursesData = new ArrayList<String>();

		for (WebElement Element : CoursesName) {
			ActCoursesData.add(Element.getText());
		}
		System.out.println(ActCoursesData + "act");

		List<String> ExpCoursesData = new ArrayList<String>();
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= 7; j++) {
				ExpCoursesData.add(GetData.getDataFromCell(i, j, "Sheet7"));
			}
		}
		if (ActCoursesData.equals(ExpCoursesData)) {
			System.out.println(" act massage is match");
			return true;
		} else {
			System.out.println(" act massage not match");
			return false;
		}
	}

	public boolean mainNavigationChoices() {
		List<WebElement> NavigationChoices = navigation;
		List<String> ActNavigationChoices = new ArrayList<String>();

		for (WebElement element : NavigationChoices) {
			ActNavigationChoices.add(element.getText());
		}
		System.out.println(ActNavigationChoices + "act");

		List<String> ExpNavigationChoices = new ArrayList<String>();
		for (int i = 0; i <= 5; i++) {
			ExpNavigationChoices.add(GetData.getDataFromCell(i, 9, "Sheet7"));
		}
		System.out.println(ExpNavigationChoices + "exp");
		if (ActNavigationChoices.equals(ExpNavigationChoices)) {
			System.out.println(" act massage is match");
			return true;
		} else {
			System.out.println(" act massage not match");
			return false;
		}

	}

	public boolean coursesName() {
		java.util.List<WebElement> coursesAvailable = course;
		List<String> ActcoursesAvailable = new ArrayList<String>();

		for (WebElement element : coursesAvailable) {
			ActcoursesAvailable.add(element.getText());
		}
		System.out.println(ActcoursesAvailable + "act");

		List<String> ExpcoursesAvailable = new ArrayList<String>();
		for (int i = 0; i <= 3; i++) {
			ExpcoursesAvailable.add(GetData.getDataFromCell(i, 8, "Sheet7"));
		}
		System.out.println(ExpcoursesAvailable + "exp");
		if (ActcoursesAvailable.equals(ExpcoursesAvailable)) {
			System.out.println(" act massage is match");
			return true;
		} else {
			System.out.println(" act massage not match");
			return false;
		}
	}

	public boolean courseDiscription() {

		List<WebElement> coursesDiscription = coursedisc;
		List<String> ActCourseDiscription = new ArrayList<String>();
		for (WebElement element : coursesDiscription) {
			ActCourseDiscription.add(element.getText());

		}
		System.out.println(ActCourseDiscription + "act");

		List<String> EXPCourseDiscription = new ArrayList<String>();

		for (int i = 0; i <= 3; i++) {
			EXPCourseDiscription.add(GetData.getDataFromCell(i, 10, "Sheet7"));
		}

		System.out.println(EXPCourseDiscription + "exp");

		if (ActCourseDiscription.equals(EXPCourseDiscription)) {
			System.out.println(" act massage is match");
			return true;
		} else {
			System.out.println(" act massage not match");
			return false;
		}
	}
	
	public boolean dashboardtext(){
		String act = dashbord.getText();
		String exp = "Dashboard";
		if (act.equals(exp)) {
			System.out.println("test pass");
			return true;
		}
		else {
			System.out.println("test fail");
			return false;
		}
			
	}
	public UserPage navigateUserPage(WebDriver driver){
        button.click();
		return new UserPage(driver);
		
	}

}
