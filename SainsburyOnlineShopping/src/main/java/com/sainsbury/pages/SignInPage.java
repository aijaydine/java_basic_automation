package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage {

	public SignInPage(WebDriver driver) {
		super(driver);
		
	}

	public void logInWithValidDetails(String validEmail, String validPassword) {
		try{
		driver.findElement(By.id("username")).sendKeys(validEmail);
		driver.findElement(By.id("password1")).sendKeys(validPassword);
		driver.findElement(By.linkText("Log in")).click();
		camera.takeShot("logInWithValidDetails");
		}catch(Throwable t){
			t.printStackTrace();
		}
	}

	public void logInWithInvalidPassword(String validEmail, String invalidPassword) {
		try{
		driver.findElement(By.id("username")).sendKeys(validEmail);
		driver.findElement(By.id("password1")).sendKeys(invalidPassword);
		driver.findElement(By.linkText("Log in")).click();
		camera.takeShot("logInWithInvalidPassword");
		}catch(Throwable t){
			t.printStackTrace();
		}
	}

	public void logInWithInvalidEmail(String invalidEmail, String validPassword) {
		try{
		driver.findElement(By.id("username")).sendKeys(invalidEmail);
		driver.findElement(By.id("password1")).sendKeys(validPassword);
		driver.findElement(By.linkText("Log in")).click();
		camera.takeShot("logInWithInvalidEmail");
		}catch(Throwable t){
			t.printStackTrace();
		}
	}

	public void logInWithNoDetails(String noDetails1, String noDetails2 ) {
		try{
		driver.findElement(By.id("username")).sendKeys(noDetails1);
		driver.findElement(By.id("password1")).sendKeys(noDetails2);
		driver.findElement(By.linkText("Log in")).click();
		camera.takeShot("logInWithNoDetails");
		}catch(Throwable t){
			t.printStackTrace();
		}
		
	}

	public void logInWithInvalidDetails(String invalidEmail, String invalidPassword) {
		try{
		driver.findElement(By.id("username")).sendKeys(invalidEmail);
		driver.findElement(By.id("password1")).sendKeys(invalidPassword);
		driver.findElement(By.linkText("Log in")).click();
		camera.takeShot("logInWithInvalidDetails");
		}catch(Throwable t){
			t.printStackTrace();
		}
	}

}
