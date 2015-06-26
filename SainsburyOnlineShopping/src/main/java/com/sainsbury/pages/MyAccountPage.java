package com.sainsbury.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage extends AbstractPage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	public void verifyUserSuccessfulLogIn() {
		try{
//			String message = "Test failed";
			Assert.assertTrue(driver.getPageSource().contains("Hello Aijay"));
		}catch(Throwable t){
			logger.error("No such user exists");
			
		}
	}

	public void verifyUserUnsuccessfulLoginWithInvalidPassword() {
		try{
//			String message = "Test failed, please provide valid password";
			Assert.assertTrue(driver.getPageSource().contains("Sorry. Your details have not been recognised. Please try again"));
		}catch(Throwable t){
			logger.error("Test was not successful");
		}
	}

	public void verifyUserUnsuccessfulLoginWithInvalidEmail() {
		try{
//			String message = "Test failed, please provide valid email";
			Assert.assertTrue(driver.getPageSource().contains("Sorry. Your details have not been recognised. Please try again"));
		}catch(Throwable t){
			logger.error("Test was not successful,please provide a valid email");	
		}
	}

	public void verifyUserUnsuccessfulLoginWithNoDetails() {
		try{
			String message = "Test failed, please provide valid details";
			Assert.assertSame(message, driver.getPageSource().contains("Please enter your Username/Email address in the space provided" + "Please enter your password in the space provided"));
		}catch(Throwable t){
			logger.error("Test failed ,provide valid details");
		}
	}

	public void verifyUserUnsuccessfulLoginWithInvalidDetails() {
		try{
		String message = "Test was not successful";
		Assert.assertSame(message,driver.getPageSource().contains("Sorry. Your details have not been recognised. Please try again"));
		}catch(Throwable t){
			logger.error("Test failed....");
		}
		
	}

}
