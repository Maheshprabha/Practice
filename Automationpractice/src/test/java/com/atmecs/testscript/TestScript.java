package com.atmecs.testscript;
import java.util.Properties;
import org.testng.annotations.Test;

import com.atmecs.automation.robotclass.RobotClass;
import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class TestScript extends BaseClass {
	static Properties property;
    ReaderLocation read = new ReaderLocation();
    @Test
	public void action() throws Exception {
		{
		property = ReaderLocation.readLocation(FilePath.locator_path);
		
		Properties path = new Properties();
		CommonHelpers.clickAction(driver, path.getProperty("loc_contactus"));
			RobotClass.mouseOperation();
			CommonHelpers.dropDown(driver, path.getProperty("loc_subject"), "Customer service");
			CommonHelpers.SendkeysAction(driver, path.getProperty("loc_email"), "user12@gmail.com");
			CommonHelpers.SendkeysAction
			(driver, path.getProperty("loc_textarea"), "improve your service");

			RobotClass.clickFile();
			RobotClass.chooseFile();
			RobotClass.uploadFile(driver, path.getProperty("loc_send"));

			
			
			
		
		}
	}
}
