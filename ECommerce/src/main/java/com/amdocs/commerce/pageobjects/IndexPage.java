package com.amdocs.commerce.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.commerce.actiondriver.Action;
import com.amdocs.commerce.base.BaseClass;

public class IndexPage extends  BaseClass{
	@FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
	WebElement SignInBtn;
	@FindBy(xpath="//*[@id=\"gh-ug-flex\"]/a")
	WebElement RegisterBtn;
//	@FindBy(xpath = "//*[@id=\"gh-logo\"]")
//	WebElement myStoreLogo;
//	@FindBy(xpath= "//*[@id=\"gh-ac-box\"]")
//	WebElement searchProductBox;
//	@FindBy(xpath="//*[@id=\"gh-btn\"]")
//	WebElement searchButton;

	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public Login clickOnSignIn() {
		Action.click(getDriver(), SignInBtn);
		return new Login();
		
	}
//	public boolean validateLogo() throws Throwable{
//	return Action.isDisplayed(getDriver(), myStoreLogo);
//	}
	public AccountCreationPage clickOnRegister() {
		Action.click(getDriver(), RegisterBtn);
		return new AccountCreationPage();
	}
	
}
