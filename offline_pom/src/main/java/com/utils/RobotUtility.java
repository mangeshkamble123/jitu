package com.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotUtility {

	Robot r = null;
	
	public void presEnter(){
		try {
			 r = new Robot();
		} catch (AWTException e) {
 			e.printStackTrace();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		}
	

	public void pressTabKey(){
		try {
			 r = new Robot();
		} catch (AWTException e) {
 			e.printStackTrace();
		}
		r.keyPress(KeyEvent.VK_TAB);
		}
	






}

