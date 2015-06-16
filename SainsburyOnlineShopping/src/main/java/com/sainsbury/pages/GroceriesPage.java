package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroceriesPage extends AbstractPage {

	public GroceriesPage(WebDriver driver) {
		super(driver);
		
	}

	public void openFruitAndVeg() {
		try{
			driver.findElement(By.linkText("menu2")).click();
			driver.findElement(By.linkText("Fruit & veg")).click();
			camera.takeShot("openFruitAndVeg");	
		}catch(Throwable t){
			t.printStackTrace();
		}
	}

}
