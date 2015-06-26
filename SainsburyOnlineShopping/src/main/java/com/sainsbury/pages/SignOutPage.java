package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage extends AbstractPage {

	public SignOutPage(WebDriver driver) {
		super(driver);
		
	}

	public void logOutOfAccount() {
		try{
			logger.info("The logOutOfAccount started successfully");
			driver.findElement(By.linkText("Log Out")).click();
			logger.info("Log out was successful");
			logger.info("The logOutOfAccount executed successfully");
		}catch(Throwable t){
			camera.takeShot("logOutOfAccount");
			logger.error("The logOutOfAccount encountered an error with the following message: "+t);
		}
	
		
	}

}
