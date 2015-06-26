//package testOnlineShopping;
//
////import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//import com.sainsbury.pages.AbstractPage;
//import com.sainsbury.pages.HomePage;
//import com.sainsbury.pages.MyAccountPage;
//import com.sainsbury.pages.SignInPage;
//import com.sainsbury.pages.SignOutPage;
//
//
//
//public class TestSainsburyUserLogin {
//	protected  WebDriver driver;
//	private AbstractPage abstractPage;
//	private HomePage homePage;
//	private SignInPage signInPage;
//	private MyAccountPage myAccountPage;
//	private SignOutPage signOutPage;
//	private String validEmail = "dine@yahoo.com";
//	private String validPassword = "12345abc";
//	private String invalidEmail ="edith@yahoo.com";
//	private String invalidPassword = "54321cde";
//	private String noDetails1 = "";
//	private String noDetails2 = "";
//	
//    
//    public TestSainsburyUserLogin(){
//    	driver = new FirefoxDriver();
//    	abstractPage = new AbstractPage(driver);
//    	homePage = new HomePage(driver);
//    	signInPage = new SignInPage(driver);
//    	myAccountPage = new MyAccountPage(driver);
//    	signOutPage = new SignOutPage(driver);
//    	
//    	
//    }
//
//    @Test
//    public void testLogInWithValidDetails() throws Throwable{
//    	abstractPage.setUp();
//    	homePage.openMyAccount();
//    	signInPage.logInWithValidDetails(validEmail, validPassword);
//    	myAccountPage.verifyUserSuccessfulLogIn();
//    	signOutPage.logOutOfAccount();
//    	abstractPage.tearDown();
//    
//    }
//    
//    @Test
//    public void testLoginWithInvalidPassword() throws Throwable{
//    	abstractPage.setUp();
//    	homePage.openMyAccount();
//    	signInPage.logInWithInvalidPassword(validEmail, invalidPassword);
//    	myAccountPage.verifyUserUnsuccessfulLoginWithInvalidPassword();
//    	abstractPage.tearDown();	
//    }
//    
//    @Test
//    public void testLoginWithInvalidEmail() throws Throwable{
//    	abstractPage.setUp();
//    	homePage.openMyAccount();
//    	signInPage.logInWithInvalidEmail(invalidEmail, validPassword);
//    	myAccountPage.verifyUserUnsuccessfulLoginWithInvalidEmail();
//    	abstractPage.tearDown();	
//    }
//    
//    @Test
//    public void testLoginWithNoDetails() throws Throwable{
//    	abstractPage.setUp();
//    	homePage.openMyAccount();
//    	signInPage.logInWithNoDetails(noDetails1, noDetails2);
//    	myAccountPage.verifyUserUnsuccessfulLoginWithNoDetails();
//    	abstractPage.tearDown();	
//    }
//    
//    @Test
//    public void testLoginWithInvalidDetails() throws Throwable{
//    	abstractPage.setUp();
//    	homePage.openMyAccount();
//    	signInPage.logInWithInvalidDetails(invalidEmail, invalidPassword);
//    	myAccountPage.verifyUserUnsuccessfulLoginWithInvalidDetails();
//    	abstractPage.tearDown();	
//    }
//    
//    
//    
//    
//}
