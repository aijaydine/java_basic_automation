package onlineShopping;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by AIJAY on 31/05/2015.
 */
public class ItemShopping {

    private static WebDriver driver;
    private String item;

    public ItemShopping(String item){
        this.item =item;
    }

    public void setUp(){
        String baseUrl = "http://www.sainsburys.co.uk/";
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    public void shopItem(){
        driver.findElement(By.id("search")).sendKeys(item);
        driver.findElement(By.linkText("Go")).click();
        driver.findElement(By.xpath("//*[@id='productLister']/ul/li[1]/div[2]/div[2]/h3/a")).click();

    }

    public void confirmItem(){
        String confirmation = "Item is not confirmed";
        Assert.assertTrue(confirmation,driver.getPageSource().contains("Sainsbury's Buttersoft 500g"));
    }
    public void tearDown(){
        driver.navigate().back();
        driver.quit();
        driver = null;
    }
    }

