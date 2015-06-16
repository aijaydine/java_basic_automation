package testOnlineShopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sainsbury.pages.AbstractPage;
import com.sainsbury.pages.BananaAndGrapePage;
import com.sainsbury.pages.FreshFruitPage;
import com.sainsbury.pages.FruitAndVegPage;
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
	private BananaAndGrapePage bananaAndGrapePage;
	private myTrolleyPage myTrolleyPage;
	private String validEmail = "dine@yahoo.com";
	private String validPassword = "12345abc";
	
	public TestSainsburyAddToCart(){
		driver = new FirefoxDriver();
    	abstractPage = new AbstractPage(driver);
    	homePage = new HomePage(driver);
    	signInPage = new SignInPage(driver);
    	myAccountPage = new MyAccountPage(driver);
    	signOutPage = new SignOutPage(driver);
    	groceriesPage = new GroceriesPage(driver);
    	fruitAndVegPage = new FruitAndVegPage(driver);
    	freshFruitPage = new FreshFruitPage(driver);
    	bananaAndGrapePage = new BananaAndGrapePage(driver);
    	myTrolleyPage = new myTrolleyPage(driver);
    	
	}
	
	@Test
	public void addToCart(){
		abstractPage.setUp();
    	homePage.openMyAccount();
    	signInPage.logInWithValidDetails(validEmail, validPassword);
    	myAccountPage.verifyUserSuccessfulLogIn();
    	groceriesPage.openFruitAndVeg();
    	fruitAndVegPage.openFreshFruit();
    	freshFruitPage.openBananaAndGrapes();
    	bananaAndGrapePage.openSainsburyFairTradeBananax5();
    	bananaAndGrapePage.addSainsburyFairTradeBananax5();
    	bananaAndGrapePage.openSainsburyBlackSeedlessGrape();
    	bananaAndGrapePage.addSainsburyBlackSeedlessGrape();
    	myTrolleyPage.checkItemsInTrolley();
    	signOutPage.logOutOfAccount();
    	abstractPage.tearDown();
	}

}
