package com.qa.test.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.saucedemo.base.TestBase;

public class CartPage extends TestBase{
	
	//Page Factory
	@FindBy(id = "checkout")
	WebElement checkoutButton;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CheckoutInformationPage clickCheckout() {
		checkoutButton.click();
		
		return new CheckoutInformationPage();
	}
}
