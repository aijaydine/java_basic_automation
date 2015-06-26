package testOnlineShopping;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sainsbury.pages.AbstractPage;
import com.sainsbury.pages.BananaPage;
import com.sainsbury.pages.FreshFruitPage;
import com.sainsbury.pages.FruitAndVegPage;
import com.sainsbury.pages.GrapePage;
import com.sainsbury.pages.GroceriesPage;
import com.sainsbury.pages.HomePage;
import com.sainsbury.pages.MyAccountPage;
import com.sainsbury.pages.SignInPage;
import com.sainsbury.pages.SignOutPage;
import com.sainsbury.pages.myTrolleyPage;

public class TestSainsburyAddToCart {
	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private SignOutPage signOutPage;
	private GroceriesPage groceriesPage;
	private FruitAndVegPage fruitAndVegPage;
	private FreshFruitPage freshFruitPage;
	private BananaPage bananaPage;
	private GrapePage grapePage;
//	private CheckPostCodePage checkPostCodePage;
//	private myTrolleyPage myTrolleyPage;
	private String validEmail = "dine@yahoo.com";
	private String validPassword = "12345abc";
	
	public TestSainsburyAddToCart(){
//		driver = new FirefoxDriver();
		driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Projects\\Softwares\\IEDriverServer_x64_2.46.0\\IEDriverServer.exe");
    	abstractPage = new AbstractPage(driver);
    	homePage = new HomePage(driver);
    	signInPage = new SignInPage(driver);
    	myAccountPage = new MyAccountPage(driver);
    	signOutPage = new SignOutPage(driver);
    	groceriesPage = new GroceriesPage(driver);
    	fruitAndVegPage = new FruitAndVegPage(driver);
    	freshFruitPage = new FreshFruitPage(driver);
    	bananaPage = new BananaPage(driver);
    	grapePage = new GrapePage(driver);
//    	checkPostCodePage = new CheckPostCodePage(driver);
//    	SR6 1JA
//    	myTrolleyPage = new myTrolleyPage(driver);
    	
	}
	
	@BeforeMethod
	public void setUpTest(){
		abstractPage.setUp();
	}
	
	@AfterMethod
	public void closeAllTest() throws Throwable{
		abstractPage.tearDown();
	}
	
	@Test(enabled = true)
	public void addToBananaCart() throws Throwable{
    	homePage.openMyAccount();
    	signInPage.logInWithValidDetails(validEmail, validPassword);
    	myAccountPage.verifyUserSuccessfulLogIn();
    	groceriesPage.openFruitAndVeg();
    	fruitAndVegPage.openFreshFruit();
    	freshFruitPage.openBananaAndGrapes();
    	bananaPage.openSainsburyFairTradeBananax5();
    	bananaPage.addSainsburyFairTradeBananax5();
    	signOutPage.logOutOfAccount();    	
	}
  
	
    @Test (enabled = false)
    public void addGrapesToCart() throws Throwable{
    	homePage.openMyAccount();
        signInPage.logInWithValidDetails(validEmail, validPassword);
        myAccountPage.verifyUserSuccessfulLogIn();
        groceriesPage.openFruitAndVeg();
        fruitAndVegPage.openFreshFruit();
        freshFruitPage.openBananaAndGrapes();	
    	grapePage.openSainsburyBlackSeedlessGrape();
    	grapePage.addSainsburyBlackSeedlessGrape();
//    	myTrolleyPage.checkItemsInTrolley();
    	signOutPage.logOutOfAccount();
	}

}
