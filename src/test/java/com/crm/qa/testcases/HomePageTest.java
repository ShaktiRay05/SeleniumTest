package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
public HomePageTest() {
	super();
}
@BeforeMethod
public void setup() {
	initialization();
	loginpage = new LoginPage();
	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}

	@Test(priority =1)
	public void validationTest() {
		String title = homepage.validateHomePage();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	@Test(priority = 2)
	public void verifyUsername() {
		Assert.assertTrue(homepage.correctUserName());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
}
