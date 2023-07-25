package com.amdocs.commerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.commerce.actiondriver.Action;
import com.amdocs.commerce.base.BaseClass;

public class SearchPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"gh-ac\"]")
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"gh-btn\"]")
	WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"item1aee9d893f\"]/div/div[2]")
	WebElement selectProduct;
	
	@FindBy(xpath="//*[@id=\"x-msku__select-box-1000\"]")
	WebElement color;
	
	@FindBy(xpath="//*[@id=\"x-msku__select-box-1001\"]")
	WebElement Networks;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")
	WebElement AddToCart;
	
	public SearchPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public static Select getSelect(WebElement element)
	{
		Select select=new Select(element);
		return select;
	}
	
	public void search(String product)
	{
		Action.type(search, product);
		Action.click(getDriver(), searchButton);
		Action.click(getDriver(), selectProduct);
		Action.click(getDriver(), color);
		Action.click(getDriver(), Networks);
		Action.click(getDriver(), AddToCart);
		Action.launchNewWindow(getDriver());
	}
}
