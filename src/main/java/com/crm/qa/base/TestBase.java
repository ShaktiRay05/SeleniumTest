package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.util.Utility;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public TestBase()
	{
		try{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/shaktiray/Desktop/Selenium/freecrmtest/src/main/java/com/crm/qa/config/config.properties");
		prop.load(fis);
		}
		catch(NoSuchFileException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
			
	}
	public static void initialization(){
		String browserName=prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver","/Users/shaktiray/Downloads/chromedriver_mac_arm64/chromedriver");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		 //driver.get(prop.getProperty("url"));
		 //driver.get("https://uat-web-sid.betalaunch.in/pmkvy-dashboard");
	}
}
