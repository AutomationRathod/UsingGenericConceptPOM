/**
 * 
 */
package com.qa.pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

/**
 * @author Shree
 *
 */
public class HomePageTest extends BaseTest{
	
	@Test
	public void homePageTitleTest() {
		page.getInstance(LoginPage.class).doLogin("automation069@gmail.com", "Test@#123");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("Home Page of Title--->"+title);
		Assert.assertEquals(title, "Report dashboard");	
	}
	
	@Test
	public void verifyHomePageHeaderTest() {
		page.getInstance(LoginPage.class).doLogin("automation069@gmail.com", "Test@#123");
		String header = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("Home Page Header--->"+header);
		Assert.assertEquals(header, "Thanks for choosing HubSpot");
	}

}
