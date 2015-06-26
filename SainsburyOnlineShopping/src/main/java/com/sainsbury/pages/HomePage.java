package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver){
		super(driver);
	}

	public void openMyAccount() {
		try{
		driver.findElement(By.linkText("My Account")).click();
		logger.info("Home page opened and My Account has been clicked");
		camera.takeShot("openMyAccount");
		}catch(Throwable t){
			logger.error("An error has occurred ");
		}
	}

}
