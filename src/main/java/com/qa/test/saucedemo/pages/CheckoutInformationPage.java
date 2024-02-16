package com.qa.test.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.saucedemo.base.TestBase;

public class CheckoutInformationPage extends TestBase{
	
	@FindBy(xpath = "//*[@class=\"title\"]")
	WebElement checkoutInformationTitle;
	
	@FindBy(id = "first-name")
	WebElement firstName;
	
	@FindBy(id = "last-name")
	WebElement lastName;
	
	@FindBy(id = "postal-code")
	WebElement postalCode;
	
	@FindBy(id = "continue")
	WebElement continueButton;
	
	public CheckoutInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getCheckoutInformationTitle() {
		return checkoutInformationTitle.getText();
		
	}
	
	public CheckoutOverviewPage clickContinueButton() {
		firstName.sendKeys("auto");
		lastName.sendKeys("test");
		postalCode.sendKeys("765345");
		
		continueButton.click();
		
		return new CheckoutOverviewPage();
	}

}
