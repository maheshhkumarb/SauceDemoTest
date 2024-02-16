package com.qa.test.saucedemo.testcase;

import org.testng.annotations.*;

import com.qa.test.saucedemo.base.TestBase;
import com.qa.test.saucedemo.pages.CartPage;
import com.qa.test.saucedemo.pages.HomePage;
import com.qa.test.saucedemo.pages.LoginPage;
import com.qa.test.saucedemo.pages.ProductPage;

public class ProductPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	CartPage cartPage;
	
	public ProductPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialize();
		loginPage = new LoginPage();
		homePage = new HomePage();
		productPage = new ProductPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		productPage = homePage.clickProduct();
	}
	
	@Test
	public void addToCart() {
		productPage.addToCart();
		cartPage = productPage.clickCart();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
