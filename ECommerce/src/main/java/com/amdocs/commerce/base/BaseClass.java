package com.amdocs.commerce.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.amdocs.commerce.actiondriver.Action;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
//	public static WebDriver driver
public static ThreadLocal<RemoteWebDriver>driver = new ThreadLocal<>();

	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			System.out.println("super constructor invoked");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		prop.load(ip);
		System.out.println("driver:"+driver);
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	
	
	public static void launchApp() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		
		if(browserName.contains("Chrome")) {
			driver.set( new ChromeDriver());
			}else if (browserName.contains("FireFox")) {
				driver.set( new FirefoxDriver());
			}
//		Action.implicitWait(getDriver(),10);
//		Action.pageLoadTimeOut(getDriver(),30);
		
		getDriver().manage().deleteAllCookies();
		
		getDriver().manage().timeouts().implicitlyWait
        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
        //PageLoad TimeOuts
        getDriver().manage().timeouts().pageLoadTimeout
        (Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
        
		getDriver().get(prop.getProperty("url"));
		
	}
}

