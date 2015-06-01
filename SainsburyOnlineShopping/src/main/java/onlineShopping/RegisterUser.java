package onlineShopping;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AIJAY on 31/05/2015.
 */
public class RegisterUser {

    private static  String firstname;
    private static  String lastname;
    private static String email;
    private static String password;
    private WebDriver driver;

    public RegisterUser(String firstname, String lastname , String email, String password){
        driver = new FirefoxDriver();
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public void setUp(){
        driver.manage().window().maximize();
        driver.navigate().to("http://www.sainsburys.co.uk");
    }

    public void setUser(){
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/div[2]/div[1]/ul/li[6]/a")).click();

        WebElement title = driver.findElement(By.id("ATR_Title"));
        Select click = new Select(title);
        click.deselectByValue("4");

        driver.findElement(By.id("firstName")).sendKeys("firstname");
        driver.findElement(By.id("lastName")).sendKeys("lastname");
        driver.findElement(By.id("email")).sendKeys("email");
        driver.findElement(By.id("confirmEmail")).sendKeys("email");
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirmPassword")).sendKeys(password);

        WebElement question= driver.findElement(By.id("SecretQuestion"));
        Select secret = new Select(question);
        secret.deselectByValue("What was the name of your first pet");

        driver.findElement(By.id("SecretAnswer")).sendKeys("fatty");
        driver.findElement(By.id("acceptTCs")).click();
        driver.findElement(By.id("deny")).click();

        WebElement advertise = driver.findElement(By.id("chooseAdvertiser"));
        Select advertiser = new Select(advertise);
        advertiser.deselectByValue("1140");
        driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div[1]/div[1]/form/div/div/div[5]/div/div[1]/a/span/span/span")).click();

        public void confirmUser() {
        String registeredUser = "Test was not successful";
        Assert.assertTrue(registeredUser, driver.getPageSource().contains("Welcome to your account"));
    }
    public void tearDown(){
        driver.quit();
        driver = null;
    }


    }









    }
    
}
