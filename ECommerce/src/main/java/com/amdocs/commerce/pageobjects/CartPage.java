package com.amdocs.commerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.commerce.actiondriver.Action;
import com.amdocs.commerce.base.BaseClass;

public class CartPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")
	WebElement addToCart;
	
	public CartPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void addProduct()
	{
		Action.click(getDriver(), addToCart);
	}
}
