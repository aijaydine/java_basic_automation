package com.sainsbury.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	private File scrFile;
	private WebDriver driver;
	
	public Screenshot(WebDriver driver){
		this.driver = driver;
	}
    
    public void takeShot(String screenName){
	 scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
    	try {
    		FileUtils.copyFile(scrFile, new File("C:\\Projects\\JavaProjects\\java_basic_automation\\SainsburyOnlineShopping\\src\\main\\java\\com\\sainsbury\\util\\SavedShots" + screenName + ".jpeg"));
    	}catch (IOException e1) {
    		e1.printStackTrace();
    	} 
    }

}
