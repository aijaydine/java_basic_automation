package trainingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ArgosWebAppLogin {
	
	WebDriver driver = new FirefoxDriver();
	
	
	public void setUp(){
		driver.manage().window().maximize();
		driver.navigate().to("http://www.argos.co.uk");
		
	}
	
	public void createLogin(){
		
		
		driver.findElement(By.xpath("//*[@id='personal']/div/p[2]/a[1]")).click();
		driver.findElement(By.id("logonId")).sendKeys("aijaydine@gmail.com");
		driver.findElement(By.id("registeruser")).click();
		driver.findElement(By.id("loginSubmit")).click();
		driver.findElement(By.id("repeatLogonId")).sendKeys("aijaydine@gmail.com");
		driver.findElement(By.id("logonPassword")).sendKeys("12345ij");
		driver.findElement(By.id("logonPasswordVerify")).sendKeys("12345ij");
		
		WebElement title = driver.findElement(By.id("personTitle"));
		Select click = new Select(title);
		click.selectByVisibleText("Mr");
//		click.selectByValue("Mrs");
		
		driver.findElement(By.id("firstName")).sendKeys("Aijay");
		driver.findElement(By.id("lastName")).sendKeys("Dine");
		driver.findElement(By.id("phone2")).sendKeys("07556874541");
		driver.findElement(By.id("zipCode")).sendKeys("SR6 1JA");
		driver.findElement(By.id("contextualSubmitContinue")).click();
		
	}
	
	public void verifyCreateLogin(){
		if(driver.getPageSource().contains("We already have an active account for this email")){
		System.out.println("Test was successful");
	}else 
		System.out.println("Test was unsuccessful");
	}	
		
	
	public void verifyValidLogin(){
		if(driver.getPageSource().contains("Aijay")){
		System.out.println("Test was successful");
	}else 
		System.out.println("Test was unsuccessful");
	}	
	
	public void validLogin(){
		driver.findElement(By.xpath("//*[@id='personal']/div/p[2]/a[1]")).click();
		driver.findElement(By.id("logonId")).sendKeys("aijaydine@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345ij");
		driver.findElement(By.id("loginSubmit")).click();
	}

	
	public void tearDown(){
		driver.close();
	}
	
		

}
