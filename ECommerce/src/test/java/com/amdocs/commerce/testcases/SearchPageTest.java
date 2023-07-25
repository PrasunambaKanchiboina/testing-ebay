package com.amdocs.commerce.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.commerce.base.BaseClass;
import com.amdocs.commerce.pageobjects.SearchPage;

public class SearchPageTest extends BaseClass
{
	@BeforeMethod
	public void launch()
	{
		launchApp();
	}
	
	@Test
	public void search()
	{
		LoginTest login = new LoginTest();
		login.loginTest();
		SearchPage search = new SearchPage();
		search.search(prop.getProperty("product"));
	}
}
