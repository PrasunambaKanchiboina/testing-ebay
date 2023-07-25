package com.amdocs.commerce.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.commerce.base.BaseClass;
import com.amdocs.commerce.pageobjects.IndexPage;
import com.amdocs.commerce.pageobjects.Login;

public class LoginTest extends BaseClass {
	IndexPage indexPage;
	Login login;
	
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@Test
	public void loginTest() {
		indexPage = new IndexPage();
		login=indexPage.clickOnSignIn();
		
//		getDriver().manage().timeouts().implicitlyWait
//        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
//        //PageLoad TimeOuts
//        getDriver().manage().timeouts().pageLoadTimeout
//        (Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
		
		login.login(prop.getProperty("userName"), prop.getProperty("passWord"));
		
	}
	
	
	

}
