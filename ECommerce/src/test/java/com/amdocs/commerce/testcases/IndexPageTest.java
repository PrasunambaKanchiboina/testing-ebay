package com.amdocs.commerce.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.commerce.base.BaseClass;
import com.amdocs.commerce.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass
{
	
	@BeforeMethod
	public void launch()
	{
		launchApp();
	}
	
	@Test
	public void indexTest()
	{
		//launchApp();
//		IndexPage index = new IndexPage();
//		index.clickOnRegister();
	}
}
