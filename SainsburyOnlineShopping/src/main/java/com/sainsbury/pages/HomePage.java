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
		camera.takeShot("openMyAccount");
		}catch(Throwable t){
			t.printStackTrace();
		}
	}

}
