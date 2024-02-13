package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.Searchpage;


public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	//Each test cases should be separated- independent with each other
	//Before each test case- launch the browser and login
	//after each test case- close the browser
	
	
	@BeforeMethod
	public void setup() throws IOException{
		initialization();
		loginPage=new LoginPage();
		}
	@Test
	public void loginPageValidityTest(){
		String title=loginPage.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "#1 Free CRM App for every business CRM and VCM verifiable credentials management");	
	}
	@Test
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
//	LoginPage loginpage;
//	HomePage homepage;
//	Searchpage searchpage;
//	public LoginPageTest(){
//		super();
//	}
//	
//	@BeforeMethod
//	public void setup(){
//		initialization();
//		loginpage=new LoginPage();
//			
//		}
//	@Test
//	public void validateLoginpageTest(){
//		String title=loginpage.validateLoginPage();
//		assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
//		System.out.println(title);
//	}
//	@Test
//	public void TestPage(){
//		homepage=loginpage.login(prop.getProperty("username2"),prop.getProperty("password2"));
//		searchpage=homepage.homepageTest("searchitem");
//		searchpage.validateSearchPage();
//	
//	}	
//	//@AfterMethod
//	public void teardown(){
//		driver.quit();
//	}
//}
