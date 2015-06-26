package com.emmasdiary.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.emmasdiary.pages.AbstractPage;
import com.emmasdiary.pages.HomePage;
import com.emmasdiary.pages.LogInPage;
import com.emmasdiary.pages.WelcomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	protected static WebDriver driver;
	
	private AbstractPage abstractPage;
	private HomePage homePage;
	private LogInPage logInPage;
	private WelcomePage welcomePage;

	
	public LoginStepDefinition(){
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Projects\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Projects\\Softwares\\IEDriverServer_x64_2.46.0\\IEDriverServer.exe");
		abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		logInPage = new LogInPage(driver);
		welcomePage = new WelcomePage(driver);
	}
	
	@Before
	public void startLoginTest(){
		abstractPage.setUpBrowser();
	}
	
	@After
	public void closeLoginTest(){
		abstractPage.tearDownBrowser();
	}
	
	@Given("^that user is on home page$")
	public void that_user_is_on_home_page() throws Throwable {
		homePage.verifyUserIsOnHomePage();
		homePage.signInUser();
	}

	
	@When("^I login with username \"(.*?)\" and password \"(.*?)\"$")
	public void i_login_with_username_and_password(String username, String password) throws Throwable {
		logInPage.signInUser(username, password); 
	}

	@Then("^I should see \"(.*?)\" message$")
	public void i_should_see_message(String arg1) throws Throwable {
		 welcomePage.verifyUserIsOnWelcomePage();
	}
	


}
