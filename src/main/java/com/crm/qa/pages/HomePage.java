package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;



public class HomePage extends TestBase {
	
	
	@FindBy(xpath ="//div[@class='right menu']/span")
	WebElement usernamevalue;
	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/a/span")
	WebElement contacts;
	
	public void initialisation(){
		PageFactory.initElements(driver, this);
	}

	public String validateHomePage(){
		return driver.getTitle();
		
	}
	
	public boolean correctUserName() {
     return usernamevalue.isDisplayed();
		
	}
	
	public ContactsPage HomePageTest() {
		contacts.click();
		String contactlabel = contacts.getText();
		System.out.println(contactlabel);
		
		return new ContactsPage();
	}

}
