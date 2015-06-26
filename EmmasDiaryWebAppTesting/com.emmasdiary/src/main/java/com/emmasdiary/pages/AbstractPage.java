package com.emmasdiary.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.emmasdiary.util.Screenshot;

public class AbstractPage {
	protected WebDriver driver;
	protected static Screenshot camera;
	protected static Logger logger = LogManager.getLogger("IjeomaLogger");
	private String baseUrl = "http//:www.emmasdiary.co.uk";
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}

	public void setUpBrowser() {
		try{
			logger.info("Browser started successfully");
			driver.manage().window().maximize();
			logger.info("Browser maximized successfully");
			driver.navigate().to(baseUrl);
			logger.info("Browser navigated to " + baseUrl);
		}catch(Throwable t){
			logger.error("Browser wasn't set up properly" + t);
		}
		
	}

	public void tearDownBrowser() {
		try{
		driver.close();
		logger.info("Browser closed successfully");
		driver = null;
		}catch(Throwable t){
			logger.error("Browser wasn't closed properly" + t);
		}
	}

}
