package com.amdocs.commerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.commerce.actiondriver.Action;
import com.amdocs.commerce.base.BaseClass;

public class CheckOutPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[3]/div[2]/div/div[1]/button")
	WebElement checkOut;
	
	public CheckOutPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void check()
	{
		Action.click(getDriver(), checkOut);
	}
}
