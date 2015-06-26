package com.emmasdiary.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends AbstractPage{
	

	public HomePage(WebDriver driver) {
		super(driver);	
	}

	public void verifyUserIsOnHomePage() {
		try{
			logger.info("Verification on home page has started ");
			Assert.assertTrue(driver.getPageSource().contains("Home"));
			logger.info("Verification on home page executed successfully");
		}catch(Throwable t){
			logger.error("Verification of Home Page failed with error : " + t);
		}	
	}
	
	public void signInUser(){
		try{
			logger.info("SignInUser started successfully");
				driver.findElement(By.linkText("Log In")).click();
			logger.info("SignInUser executed successfully");
		}catch(Throwable t){
			logger.error("Error occured during signInUser execution :" +  t);
			
		}
	}

}
