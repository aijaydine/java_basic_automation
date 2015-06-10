package uk.co.emmadiary.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uk.co.emmadiary.main.AbstractPage;

public class LogInPage extends AbstractPage{
	private String validEmail;
	private String validPassword;
	private String invalidPassword;
	private String invalidEmail;
//	private WebElement clickLogin = driver.findElement(By.linkText("Log In"));
//	private WebElement textUserName = driver.findElement(By.id("ContentPlaceHolder3_C003_txtUsername"));
//	private WebElement textPassword = driver.findElement(By.id("ContentPlaceHolder3_C003_txtPassword"));
//	private WebElement submit = driver.findElement(By.id("ContentPlaceHolder3_C003_lkbContactUsSubmit"));

	public LogInPage(WebDriver driver) {
		 super(driver);
		 
	}
	
	public void setUserDetails(String validEmail, String validPassword){
		this.validEmail = validEmail;
		this.validPassword = validPassword;
	}

	public void signInUserWithValidDetails(){
		 WebElement clickLogin = driver.findElement(By.linkText("Log In"));
		 WebElement textUserName = driver.findElement(By.id("ContentPlaceHolder3_C003_txtUsername"));
		 WebElement textPassword = driver.findElement(By.id("ContentPlaceHolder3_C003_txtPassword"));
		 WebElement submit = driver.findElement(By.id("ContentPlaceHolder3_C003_lkbContactUsSubmit"));

		clickLogin.click();;
		textUserName.sendKeys(validEmail);
		textPassword.sendKeys(validPassword);
		submit.click();
	}
	
	public void signInUserWithInvalidPassword(){
		 WebElement clickLogin = driver.findElement(By.linkText("Log In"));
		 WebElement textUserName = driver.findElement(By.id("ContentPlaceHolder3_C003_txtUsername"));
		 WebElement textPassword = driver.findElement(By.id("ContentPlaceHolder3_C003_txtPassword"));
		 WebElement submit = driver.findElement(By.id("ContentPlaceHolder3_C003_lkbContactUsSubmit"));

		
		
		
		clickLogin.click();
		textUserName.sendKeys(validEmail);
		textPassword.sendKeys(invalidPassword);
		submit.click();
	}
	
	public void signInUserWithInvalidEmail(){
		
		 WebElement clickLogin = driver.findElement(By.linkText("Log In"));
		 WebElement textUserName = driver.findElement(By.id("ContentPlaceHolder3_C003_txtUsername"));
		 WebElement textPassword = driver.findElement(By.id("ContentPlaceHolder3_C003_txtPassword"));
		 WebElement submit = driver.findElement(By.id("ContentPlaceHolder3_C003_lkbContactUsSubmit"));
         
		 clickLogin.click();
		textUserName.sendKeys(invalidEmail);
		textPassword.sendKeys(validPassword);
		submit.click();
	}
	
	public void signInUserWithInvalidDetails(){
		WebElement clickLogin = driver.findElement(By.linkText("Log In"));
	     WebElement textUserName = driver.findElement(By.id("ContentPlaceHolder3_C003_txtUsername"));
		 WebElement textPassword = driver.findElement(By.id("ContentPlaceHolder3_C003_txtPassword"));
		 WebElement submit = driver.findElement(By.id("ContentPlaceHolder3_C003_lkbContactUsSubmit"));

		
		clickLogin.click();
		textUserName.sendKeys(invalidEmail);
		textPassword.sendKeys(invalidPassword);
		submit.click();
	}
	

}
