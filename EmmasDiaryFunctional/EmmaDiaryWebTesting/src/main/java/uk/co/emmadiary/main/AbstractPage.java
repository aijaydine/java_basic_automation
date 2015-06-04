package uk.co.emmadiary.main;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	public String baseUrl = "http://www.emmasdiary.co.uk/";

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUp() {
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		System.out.println("This is the setup");
		
	}

	public void tearDown() {
		driver.close();
		System.out.println("This is the tear down");
		driver= null;
		
	}

}
