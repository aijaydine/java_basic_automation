package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage extends AbstractPage {

	public SignOutPage(WebDriver driver) {
		super(driver);
		
	}

	public void logOutOfAccount() {
		try{
		driver.findElement(By.linkText("Log Out")).click();
		camera.takeShot("logOutOfAccount");
		}catch(Throwable t){
			t.printStackTrace();
		}
	
		
	}

}
