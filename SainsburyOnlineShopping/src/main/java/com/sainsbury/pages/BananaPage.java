package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BananaPage extends AbstractPage {

	public BananaPage(WebDriver driver) {
		super(driver);
		
	}

	public void openSainsburyFairTradeBananax5() {
		try{
			logger.info("The openSainsburyFairTradeBananax5 started execution successfully");
			driver.findElement(By.xpath("//*[@id='hasCrossSell_143381']/div[1]/div/h3/a")).click();
			logger.info("Banana page opens successfully");
			logger.info("The openSainsburyFairTradeBananax5 executed successfully");
		}catch(Throwable t){
			logger.error("The openSainsburyFairTradeBananax5 encountered and error with error message: "+t);	
		}
		
	}

	public void addSainsburyFairTradeBananax5() {
		try{
			logger.info("The addSainsburyFairTradeBananax5 started successfully");
			driver.findElement(By.name("Add")).click();
			logger.info("SainsburyFairTradeBananax5 has been added to the trolley successfully");
			logger.info("The addSainsburyFairTradeBananax5 executed successfully");
		}catch(Throwable t){
			camera.takeShot("addSainsburyFairTradeBananax5");
			logger.error("Sorry, SainsburyFairTradeBananax5 wasn't added to the trolley");
		}
		
	}

}
