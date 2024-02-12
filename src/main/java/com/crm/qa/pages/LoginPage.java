package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.crm.qa.base.TestBase;


public class LoginPage extends TestBase{
	//pagefactory -OR
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")
	WebElement loginbutton;
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
	//intitalising page objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();		
	}
	public HomePage login(String un,String pwd){
		loginbutton.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage(); 
	}
	/*@FindBy(linkText="Login")
	WebElement login;*/
//	@FindBy(xpath="(//input[@type='text'])[2]")
//	WebElement username;
//	@FindBy(xpath="//input[@type='password']")
//	WebElement password;
//	@FindBy(xpath="(//button[@type='submit'])[2]")
//	WebElement submit;
//	
//	
//	public void initialisation(){
//		PageFactory.initElements(driver, this);
//	}
//	public String validateLoginPage(){
//		return driver.getTitle();
//	}
//     public HomePage login(String un,String pwd){
//    	// login.click();
//    	 username.sendKeys(un);
//    	 password.sendKeys(pwd);
//    	 submit.click();
//    	 return new HomePage();
//    	 
//     }
	
	
	

}
