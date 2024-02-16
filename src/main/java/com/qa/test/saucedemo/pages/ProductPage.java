package com.qa.test.saucedemo.pages;



import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.qa.test.saucedemo.base.TestBase;

public class ProductPage extends TestBase {
	
	//Page Factory
	@FindBy(xpath = "//*[contains (text(),'Sauce Labs Bolt T-Shirt')]")
	WebElement product;
	
	@FindBy(xpath = "//*[@class=\"inventory_details_price\"]")
	WebElement price;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@class=\"shopping_cart_badge\"]")
	WebElement cartButton;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String checkProduct() {
		String p = product.getText();	
		return p;
	}
	
	public String checkPrice() {
		String p = price.getText();
		return p;
	}
	
	public void addToCart() {
		addToCartButton.click();
	}
	
	public CartPage clickCart() {
		cartButton.click();
		
		return new CartPage();
	}

}
