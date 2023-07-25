package com.amdocs.commerce.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.commerce.actiondriver.Action;
import com.amdocs.commerce.base.BaseClass;

public class Login extends BaseClass {
	@FindBy(xpath="//*[@id=\"userid\"]")
	WebElement username;
	@FindBy(xpath="//*[@id=\"signin-continue-btn\"]")
	WebElement continuesignin;
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"sgnBt\"]")
	WebElement SignIn;
	
	public Login()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void login( String userName,String passWord)  {
		
		getDriver().manage().timeouts().implicitlyWait
        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
        //PageLoad TimeOuts
//        getDriver().manage().timeouts().pageLoadTimeout
//        (Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
		
		Action.type(username, userName);
		Action.click(getDriver(), continuesignin);
		getDriver().manage().timeouts().implicitlyWait
        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
		Action.type(password, passWord);
		Action.click(getDriver(), SignIn);
		//return new HomePage();
		
	}
}

