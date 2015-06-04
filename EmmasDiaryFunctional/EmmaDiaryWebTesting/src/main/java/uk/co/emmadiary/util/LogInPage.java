package uk.co.emmadiary.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.co.emmadiary.main.AbstractPage;

public class LogInPage extends AbstractPage{
	private String validEmail;
	private String validPassword;

	public LogInPage(WebDriver driver) {
		 super(driver);
		 
	}
	
	public void setUserDetails(String validEmail, String validPassword){
		this.validEmail = validEmail;
		this.validPassword = validPassword;
	}

	public void signInUserWithValidDetails() {
		driver.findElement(By.id("DesktopLogin1_btnlogin")).click();
		driver.findElement(By.id("ContentPlaceHolder3_C003_txtUsername")).sendKeys(validEmail);
		driver.findElement(By.id("ContentPlaceHolder3_C003_txtPassword")).sendKeys(validPassword);
		
		
	}

}
