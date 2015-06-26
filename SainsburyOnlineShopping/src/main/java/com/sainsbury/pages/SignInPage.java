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
			logger.info("LogIn  was successful with valid details : " + validEmail +"and"+ validPassword);
			camera.takeShot("logInWithValidDetails");
		}catch(Throwable t){
			logger.error("Login was not sucecssful ");
		}
	}

	public void logInWithInvalidPassword(String validEmail, String invalidPassword) {
		try{
			driver.findElement(By.id("username")).sendKeys(validEmail);
			driver.findElement(By.id("password1")).sendKeys(invalidPassword);
			driver.findElement(By.linkText("Log in")).click();
			logger.info("Login was not successful with : " + validEmail +"and" + invalidPassword );
			camera.takeShot("logInWithInvalidPassword");
		}catch(Throwable t){
			logger.error("Login was not successful");
		}
	}

	public void logInWithInvalidEmail(String invalidEmail, String validPassword) {
		try{
			driver.findElement(By.id("username")).sendKeys(invalidEmail);
			driver.findElement(By.id("password1")).sendKeys(validPassword);
			driver.findElement(By.linkText("Log in")).click();
			logger.info("Login was not successful with : " + invalidEmail+ "and" + validPassword  );
			camera.takeShot("logInWithInvalidEmail");
		}catch(Throwable t){
			logger.error("Login was not successful");
		}
	}

	public void logInWithNoDetails(String noDetails1, String noDetails2 ) {
		try{
			driver.findElement(By.id("username")).sendKeys(noDetails1);
			driver.findElement(By.id("password1")).sendKeys(noDetails2);
			driver.findElement(By.linkText("Log in")).click();
			logger.info("Login was not successful as no details was given");
			camera.takeShot("logInWithNoDetails");
		}catch(Throwable t){
			logger.error("Login was not successful");
		}
		
	}

	public void logInWithInvalidDetails(String invalidEmail, String invalidPassword) {
		try{
			driver.findElement(By.id("username")).sendKeys(invalidEmail);
			driver.findElement(By.id("password1")).sendKeys(invalidPassword);
			driver.findElement(By.linkText("Log in")).click();
			logger.info("Login was not successful with" + invalidEmail + "and" + invalidPassword);
			camera.takeShot("logInWithInvalidDetails");
		}catch(Throwable t){
			logger.error("Test was not successful");
		}
	}

}
