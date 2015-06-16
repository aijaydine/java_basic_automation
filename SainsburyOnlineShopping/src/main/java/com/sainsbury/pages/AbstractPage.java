package com.sainsbury.pages;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.sainsbury.util.Screenshot;



public class AbstractPage {
	
	protected WebDriver driver;
	private  String baseUrl = "http://www.sainsburys.co.uk/";
	protected static Screenshot camera;
//	protected static Logger logger = LogManager.getLogger("LogReport");
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
		camera = new Screenshot(driver);
	}

	public void setUp() {
		try{
		driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
        camera.takeShot("setUp");
		}catch(Throwable t){
			t.printStackTrace();
		}
		
	}


	public void tearDown() {
		try{
		driver.close();
		camera.takeShot("TearDown");
        driver = null;
		}catch(Throwable t){
			t.printStackTrace();
		}
	}

}
