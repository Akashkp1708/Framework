package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.test.browserstack.SelectBrowser;
import com.test.testcases.Proper;

public class BaseClass {
	public WebDriver driver;
	public Proper abc;
	@BeforeSuite
	public void setupsuite() {
		 abc = new Proper();
		
	}
	
	
	@BeforeClass
	public void setup() {
		driver = SelectBrowser.browser(abc.bro());
		driver.get("https://www.fb.com");
	}
	@AfterClass
	public void quit() {
		//driver.close();
	}
}
