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
public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	//define page locator
	
	By emailId = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	
	//define page Action:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void doLogin(String username,String pwd) {
		doSendKeys(emailId,username);
		doSendKeys(password,pwd);
		doClick(loginButton);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
	}

}
