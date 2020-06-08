/**
 * 
 */
package com.qa.pagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Shree
 *
 */
public class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 15);
		
		driver.manage().window().fullscreen();
		
		driver.get("https://app.hubspot.com/login");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//create the object of page class:Instantiate page class
		
		page = new Page(driver, wait);	
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
