package uk.co.emmadiary.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.co.emmadiary.main.AbstractPage;

public class LogOutPage extends AbstractPage {

	public LogOutPage(WebDriver driver) {
		 super(driver);
	}

	public void signOutUser() {
		driver.findElement(By.id("DesktopLogin1_btnlogin")).click();
		
	}

}
