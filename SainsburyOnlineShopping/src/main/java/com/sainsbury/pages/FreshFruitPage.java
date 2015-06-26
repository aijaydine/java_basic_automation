package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreshFruitPage extends AbstractPage {

	public FreshFruitPage(WebDriver driver) {
		super(driver);
		
	}

	public void openBananaAndGrapes() {
		try{
			logger.info("The openBananaAndGrapes method started successfully");
			driver.findElement(By.linkText("Bananas & grapes")).click();
			logger.info("The option was clicked successfully");
			logger.info("The openBananaAndGrapes method executed successfully");			
		}catch(Throwable t){
			camera.takeShot("openBananaAndGrapes");
			logger.error("Test was not successful");
		}
		
	}

}
