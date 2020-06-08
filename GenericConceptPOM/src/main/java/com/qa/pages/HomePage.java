/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Shree
 *
 */
public class HomePage extends BasePage{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}

	//page locator
	By header = By.className("private-page__title");
	
	//page actions:
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getHomePageHeader() {
		return doGetText(header);
	}
}
