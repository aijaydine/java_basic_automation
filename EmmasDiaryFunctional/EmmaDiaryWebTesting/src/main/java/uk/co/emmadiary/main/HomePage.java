package uk.co.emmadiary.main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		super (driver);
	}

	public void supplyLoginDetails() {
		String email = "dine@yahoo.com";
		String password = "12345abc";
		
		driver.findElement(By.id("DesktopLogin1_lkbRegister")).click();
		
		
//		WebElement areYouPregnant = driver.findElement(By.id("ddlAreYoupregnant"));
		WebElement areYouPregnant = driver.findElement(By.name("ctl00$ContentPlaceHolder3$C006$ddlAreYoupregnant"));
		System.out.println("####################################################" + areYouPregnant.isEnabled());
	    Select click = new Select(areYouPregnant);
	    click.deselectByValue("No");
		
	    WebElement numberofchildren = driver.findElement(By.id("ddlNumberOfChildren"));
	    Select number = new Select(numberofchildren);
	    number.deselectByValue("1");
	    
	    WebElement dob = driver.findElement(By.id("ContentPlaceHolder3_C006_ddlDobBaby1Day"));
	    Select date = new Select(dob);
	    date.deselectByValue("01");
	    
	    WebElement mob = driver.findElement(By.id("ContentPlaceHolder3_C006_ddlDobBaby1Day"));
	    Select month = new Select(mob);
	    month.deselectByValue("01");
	    
	    WebElement yob = driver.findElement(By.id("ContentPlaceHolder3_C006_ddlDobBaby1Year"));
	    Select year = new Select(yob);
	    year.deselectByValue("1992");
	    
	    driver.findElement(By.id("ContentPlaceHolder3_C006_girl1")).click();
	    driver.findElement(By.id("ContentPlaceHolder3_C006_txtEmail")).sendKeys(email);
	    driver.findElement(By.id("ContentPlaceHolder3_C006_txtPassword")).sendKeys(password);
	    driver.findElement(By.id("ContentPlaceHolder3_C006_chkTandC")).click();
	    driver.findElement(By.id("ContentPlaceHolder3_C006_lkbRegisterNow")).click();
	    
	}

	public void supplyAboutYouDetails(){

		String firstName = "Edith";
		String lastName = "Dine";
		String postcode = "SR6 4GD";
		String address = "28 Newcastle Road";
		
		WebElement yourTitle = driver.findElement(By.id("ContentPlaceHolder3_C006_ddlTitle"));
		Select title = new Select(yourTitle);
		title.deselectByValue("Ms");
		
		driver.findElement(By.id("ContentPlaceHolder3_C006_txtFirstName")).sendKeys(firstName);
		driver.findElement(By.id("ContentPlaceHolder3_C006_txtSurName")).sendKeys(lastName);
		
		WebElement dob = driver.findElement(By.id("ContentPlaceHolder3_C006_ddlDobDate"));
		Select date = new Select (dob);
		date.deselectByValue("1");
		
		WebElement mob = driver.findElement(By.id("ContentPlaceHolder3_C006_ddlDobMM"));
		Select month = new Select (mob);
		month.deselectByValue("01");
		
		WebElement yob = driver.findElement(By.id("ContentPlaceHolder3_C006_ddlDobYear"));
		Select year = new Select (yob);
		year.deselectByValue("1962");
		
		driver.findElement(By.id("ContentPlaceHolder3_C006_txtPostCode")).sendKeys(postcode);
		driver.findElement(By.id("ContentPlaceHolder3_C006_txtAddress1")).sendKeys(address);
		driver.findElement(By.id("ContentPlaceHolder3_C006_lkbRegisterNow")).click();
		
		
	}
	
	public void verifyUser(){
		String message = "Test was not successful";
		Assert.assertTrue(message, driver.getPageSource().contains("dine@yahoo.com is already registered"));
		
	}
}
