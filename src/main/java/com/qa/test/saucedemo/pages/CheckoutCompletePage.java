package com.qa.test.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.saucedemo.base.TestBase;

public class CheckoutCompletePage extends TestBase{
	
	@FindBy(xpath = "//*[@class=\"title\"]")
	WebElement checkoutCompleteTitle;
	
	@FindBy(xpath = "//*[contains (text(),'Thank you for your order!')]")
	WebElement thanksNote;
	
	@FindBy(id = "back-to-products")
	WebElement backHomeButton;
	
	public CheckoutCompletePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getCheckoutCompleteTitle() {
		return checkoutCompleteTitle.getText();
	}
	
	public String getThanksnoteText() {
		return thanksNote.getText();
	}
	
	public HomePage clickBackHome() {
		backHomeButton.click();
		return new HomePage();
	}

}
