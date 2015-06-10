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
	private String invalidPassword = "0987asc";
	private String invalidEmail = "asdffg@ana.com";

		

	
	public TestEmmasDiaryApp(){
		driver = new FirefoxDriver();
		abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		logInPage = new LogInPage(driver);
		logOutPage = new LogOutPage(driver);		
	}
	
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
	
//	@Ignore
	@Test
	public void runRegisterUser(){
		homePage.supplyLoginDetails();
		homePage.supplyAboutYouDetails();
		homePage.verifyUser();
		
	}
	
	@Test
	public void runLoginUser(){
		logInPage.setUserDetails(validEmail, validPassword);
		logInPage.signInUserWithValidDetails();
		logInPage.signInUserWithInvalidEmail();
		logInPage.signInUserWithInvalidPassword();
		logInPage.signInUserWithInvalidDetails();
		
	
	}
	
	@Test
	public void runLogOutUser(){
		logOutPage.signOutUser();
	}
	
}
