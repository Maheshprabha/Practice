package com.atmecs.automation.robotclass;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.atmecs.commonhelpers.CommonHelpers;

public class RobotClass {
		
	    static Robot robot;
		
		public static void mouseOperation() throws Exception {
			robot = new Robot();
			Thread.sleep(2000);
			robot.mouseWheel(5);
		}
		
		public static void clickFile() throws Exception {
			robot = new Robot();
			robot.mouseMove(343, 440);
			Thread.sleep(2000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		}
		
		public static void chooseFile() throws Exception {
			robot = new Robot();
			
			robot.mouseMove(55, 163);
			Thread.sleep(2000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
			robot.mouseMove(220, 287);
			Thread.sleep(2000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
			robot.keyPress(KeyEvent.VK_ENTER);
		}
		
		public static void uploadFile(WebDriver driver,String value) {
			CommonHelpers.clickAction(driver,value);
		
	}

}


