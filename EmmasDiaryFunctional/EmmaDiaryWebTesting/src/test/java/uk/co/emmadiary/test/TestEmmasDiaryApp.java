package uk.co.emmadiary.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import uk.co.emmadiary.main.AbstractPage;
import uk.co.emmadiary.main.HomePage;
import uk.co.emmadiary.util.LogInPage;
import uk.co.emmadiary.util.LogOutPage;

public class TestEmmasDiaryApp {
	
	public WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private LogInPage logInPage;
	private LogOutPage logOutPage;
	private String validEmail = "dine@yahoo.com";
	private String validPassword = "12345abc";
	
//	public TestEmmasDiaryApp(){
//		
//	}
	
	@Before
	public void preTest(){
		driver = new FirefoxDriver();
		abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		logInPage = new LogInPage(driver);
		logOutPage = new LogOutPage(driver);
		abstractPage.setUp();	
	}
	
	
	@After
	public void postTest(){
		abstractPage.tearDown();
	}
	
	@Test
	public void runTest(){
		homePage.supplyLoginDetails();
		homePage.supplyAboutYouDetails();
		homePage.verifyUser();
		logInPage.setUserDetails(validEmail, validPassword);
		logInPage.signInUserWithValidDetails();
		logOutPage.signOutUser();
	
	}
}
