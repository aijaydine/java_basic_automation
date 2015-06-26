package com.sainsbury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GrapePage extends AbstractPage {

	public GrapePage(WebDriver driver) {
		super(driver);
		
	}

	public void openSainsburyBlackSeedlessGrape() {
		try{
			logger.info("openSainsburyBlackSeedlessGrape started execution successfully");
			driver.findElement(By.xpath("//*[@id='productLister']/ul/li[1]/div[2]/div[1]/div/h3/a")).click();
			logger.info("SainsburyBlackSeedlessGrapes opened successfully");
		}catch(Throwable t){
			logger.error("Sorry SainsburyBlackSeedlessGrapes was not found");
		}	
		
	}

	public void addSainsburyBlackSeedlessGrape() {
		try{
			logger.info("addSainsburyBlackSeedlessGrape started execution successfully");
			driver.findElement(By.name("Add")).click();
			logger.info("SainsburyBlackSeedlessGrape has been added to trolley successfully");
		}catch(Throwable t){
			logger.error("SainsburyBlackSeedlessGrape weren't added to trolley");
		}
		
	}

}
