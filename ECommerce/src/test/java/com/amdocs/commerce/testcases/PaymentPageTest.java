package com.amdocs.commerce.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.commerce.base.BaseClass;
import com.amdocs.commerce.pageobjects.PaymentPage;

public class PaymentPageTest extends BaseClass
{
	@BeforeMethod
	public void setUp()
	{
		launchApp();
	}
	
	@Test
	public void paymentTest() throws Throwable
	{
		CheckOutPageTest check = new CheckOutPageTest();
		check.checkOut();
		PaymentPage payment = new PaymentPage();
		payment.payment();
	}
}
