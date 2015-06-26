package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FruitAndVegPage extends AbstractPage {

	public FruitAndVegPage(WebDriver driver) {
		super(driver);
		
	}

	public void openFreshFruit() {
		try{
			logger.info("The openFreshFruit method started successfully");
			driver.findElement(By.linkText("Fresh fruit")).click();
			logger.info("Fresh fruit was successfully selected");
			logger.info("The openFreshFruit method executed successfully");
		}catch(Throwable t){
			camera.takeShot("openFreshFruit");
			logger.error("The openFreshFruit encountered an error with error message: "+ t);
		}
		
		
	}

}
