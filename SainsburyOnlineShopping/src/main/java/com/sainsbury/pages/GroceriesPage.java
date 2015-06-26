package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroceriesPage extends AbstractPage {

	public GroceriesPage(WebDriver driver) {
		super(driver);
		
	}

	public void openFruitAndVeg() {
		try{
			logger.info("The openFruitAndVeg started successfully");
			driver.findElement(By.linkText("Groceries")).click();
			logger.info("The groceries option was selected selected successfully");
			driver.findElement(By.linkText("Fruit & veg")).click();
			logger.info("The fruit & veg option was selected successfully");
		}catch(Throwable t){
			camera.takeShot("openFruitAndVeg");	
			logger.error("There was error in the openFruitAndVeg method with error message as: "+t);
		}
	}

}
