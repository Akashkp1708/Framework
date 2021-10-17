package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By Userid = By.name("email");
	By pwd = By.name("pass");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void set(String User,String pswd) {
		driver.findElement(Userid).sendKeys(User);
		driver.findElement(pwd).sendKeys(pswd);
		
	}
}
