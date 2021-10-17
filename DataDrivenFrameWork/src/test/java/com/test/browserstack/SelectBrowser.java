package com.test.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBrowser {

	
	static WebDriver driver;
	
	
	public static WebDriver browser(String browerName) {
		if(browerName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browerName=="firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		return driver;
	}
}
