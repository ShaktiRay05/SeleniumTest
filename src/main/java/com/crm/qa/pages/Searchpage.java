package com.crm.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;



public class Searchpage extends TestBase {
	public String validateSearchPage(){
		WebElement actual=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[1]/div/div/span/span/.."));
		String expected=actual.getText();
		assertEquals(actual, expected);
		return validateSearchPage();
	}
	@FindBy(xpath="//div[.='APPLE iPhone 12 (Black, 256 GB)']")
	WebElement item;
	
	public void initialisation(){
		PageFactory.initElements(driver, this);
	}
	public void searchPage(){
		item.click();
	}
	}

