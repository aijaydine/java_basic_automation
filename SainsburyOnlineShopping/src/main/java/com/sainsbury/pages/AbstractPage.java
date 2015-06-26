package com.sainsbury.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.sainsbury.util.Screenshot;



public class AbstractPage {
	
	protected WebDriver driver;
	private  String baseUrl = "http://www.sainsburys.co.uk/";
	protected static Screenshot camera;
	protected static Logger logger = LogManager.getLogger("IjeomaLogger");
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
		logger.info("Browser has been launched successfully!!!");
		camera = new Screenshot(driver);
		logger.info("Screenshot class instance has been created");
	}

	public void setUp() {
		try{
		driver.manage().window().maximize();
		logger.info("Browser has been maximised");
        driver.navigate().to(baseUrl);
        logger.info("The " + baseUrl+ "has been loaded successfully");
        camera.takeShot("setUp");
		}catch(Throwable t){
			logger.error("Unexpected error occoured");
		}
	}


	public void tearDown() throws Exception {
		try{
		driver.close();
		logger.info("Browser has closed successfully");
		camera.takeShot("TearDown");
		logger.info("The last screenshot has been taken");
        driver = null;
		logger.info("The broswer has no value now");
		}catch(Throwable t){
			logger.info("Error occured during the broswer closing method execution");
			throw new Exception("Error occured during the broswer closing method execution");
		}
	}

}
