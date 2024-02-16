package com.qa.test.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.saucedemo.base.TestBase;

public class CheckoutOverviewPage extends TestBase{
	
	@FindBy(xpath = "//*[@class=\"title\"]")
	WebElement checkoutOverviewTitle;
	
	@FindBy(id = "finish")
	WebElement finishButton;
	
	public CheckoutOverviewPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getCheckoutOverviewTitle() {
		return checkoutOverviewTitle.getText();
		
	}
	
	public CheckoutCompletePage clickFinish() {
		finishButton.click();
		
		return new CheckoutCompletePage();
	}

}
