package com.amdocs.commerce.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.commerce.base.BaseClass;
import com.amdocs.commerce.pageobjects.CheckOutPage;

public class CheckOutPageTest extends BaseClass
{
	@BeforeMethod
	public void launch()
	{
		launchApp();
	}
	
	@Test
	public void checkOut()
	{
		CartPageTest test = new CartPageTest();
		test.addToCart();
		CheckOutPage check = new CheckOutPage();
		check.check();
	}
}
