package com.emmasdiary.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WelcomePage extends AbstractPage{

	public WelcomePage(WebDriver driver) {
		super(driver);
		
	}

	public void verifyUserIsOnWelcomePage() {
		try{
			logger.info("verifyUserIsOnWelcomePage started successfully");
				Assert.assertTrue(driver.getPageSource().contains("WELCOME BACK, Edith"));
			logger.info("verifyUserIsOnWelcomePage executed successfully");	
		}catch(Throwable t){
			logger.error("Error occurred during execution :" + t);
		}
		
	}

}
