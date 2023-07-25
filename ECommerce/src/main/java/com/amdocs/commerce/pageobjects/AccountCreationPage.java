package com.amdocs.commerce.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.commerce.actiondriver.Action;
import com.amdocs.commerce.base.BaseClass;

public class AccountCreationPage extends BaseClass{
	@FindBy(xpath="//*[@id=\"personalaccount-radio\"]")
	WebElement PersonalAccount;
	@FindBy(xpath="//*[@id=\"businessaccount-radio\"]")
	WebElement BusinessAccount;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	WebElement Register;

	public AccountCreationPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	public void AccountCreationPage(String firstName,String lastName,String eMail,String Password)  {
//		getDriver().manage().timeouts().implicitlyWait
//        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
		
		Action.click(getDriver(), PersonalAccount);
		Action.type(firstname, firstName);
		Action.type(lastname, lastName);
		Action.type(email, eMail);
		Action.type(password, Password);
		WebDriverWait wait = new WebDriverWait(getDriver(), 300);
		wait.until(ExpectedConditions.elementToBeClickable(Register));
		Action.click(getDriver(), Register);
//		getDriver().manage().timeouts().implicitlyWait
//		(Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
//		


	}
		
}
