package com.amdocs.commerce.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.commerce.base.BaseClass;
import com.amdocs.commerce.pageobjects.AccountCreationPage;
import com.amdocs.commerce.pageobjects.IndexPage;

public class AccountCreationPageTest extends BaseClass {
	IndexPage indexpage;
	AccountCreationPage register;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@Test
	public void registerTest() 
	{
		indexpage = new IndexPage();
		register=indexpage.clickOnRegister();
		register.AccountCreationPage(prop.getProperty("firstName"),prop.getProperty("lastName"),prop.getProperty("eMail"),prop.getProperty("Password"));
	}

	


}
