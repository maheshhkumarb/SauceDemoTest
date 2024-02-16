package com.qa.test.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.saucedemo.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory
	@FindBy(xpath = "//*[contains (text(),'Sauce Labs Bolt T-Shirt')]")
	WebElement product;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ProductPage clickProduct() {
		product.click();
		
		return new ProductPage();
	}

	

}
