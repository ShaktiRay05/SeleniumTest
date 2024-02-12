package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class TestSample extends TestBase{
public TestSample(){
	
}
@BeforeMethod
public void setup() throws IOException{
	initialization();
}
	
	@Test
	public void clickOnTab() throws Exception{
		driver.get("https://uat-web-sid.betalaunch.in/pmkvy-dashboard");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//div[@class='contentContainer']//div[(.)='Candidates']"));
		element.click();
		
	}

}
