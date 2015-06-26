package com.emmasdiary.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends AbstractPage{

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	
	public void signInUser(String username, String password) {
			try{
				logger.info("Sign in started successfully");
				logger.info("Log in opened successfully");
			driver.findElement(By.id("ContentPlaceHolder3_C003_txtUsername")).sendKeys(username);
				logger.info("Username has been entered");
			driver.findElement(By.id("ContentPlaceHolder3_C003_txtPassword")).sendKeys(password);
				logger.info("Password has been entered");
			driver.findElement(By.id("ContentPlaceHolder3_C003_lkbContactUsSubmit")).click();
				logger.info("Sign in executed successfully");
			}catch(Throwable t){
				logger.error("Error occurred during sign in :" +t);
			}
			
		
	}
		
	

}
