package com.test.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.browserstack.SelectBrowser;
import com.test.pages.BaseClass;
import com.test.pages.LoginPage;

public class LoginAction extends BaseClass  {
	
	@Test
	public void test() {
	     //driver = SelectBrowser.browser("chrome");
		//driver.get("https://www.fb.com");
		//LoginPage log = PageFactory.initElements(driver, LoginPage.class);
		LoginPage log = new LoginPage(driver);
		log.set("abcd@com", "123456");
	}
}
