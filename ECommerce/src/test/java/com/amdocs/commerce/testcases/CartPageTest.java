package com.amdocs.commerce.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.commerce.base.BaseClass;
import com.amdocs.commerce.pageobjects.CartPage;

public class CartPageTest extends BaseClass
{
	@BeforeMethod
	public void launch()
	{
		launchApp();
	}
	
	
	@Test
	public void addToCart()
	{
		SearchPageTest search = new SearchPageTest();
		search.search();
		CartPage cart = new CartPage();
		cart.addProduct();
	}
}
