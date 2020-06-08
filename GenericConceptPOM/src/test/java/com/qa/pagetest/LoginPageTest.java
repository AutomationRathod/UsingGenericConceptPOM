/**
 * 
 */
package com.qa.pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;

/**
 * @author Shree
 *
 */
public class LoginPageTest extends BaseTest{
	
	
	@Test
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test
	public void loginTest() {
		page.getInstance(LoginPage.class).doLogin("automation069@gmail.com", "Test@#123");
	}

}
