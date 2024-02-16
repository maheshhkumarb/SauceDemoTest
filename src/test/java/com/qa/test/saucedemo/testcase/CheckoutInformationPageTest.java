package com.qa.test.saucedemo.testcase;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.test.saucedemo.base.TestBase;
import com.qa.test.saucedemo.pages.CartPage;
import com.qa.test.saucedemo.pages.CheckoutInformationPage;
import com.qa.test.saucedemo.pages.CheckoutOverviewPage;
import com.qa.test.saucedemo.pages.HomePage;
import com.qa.test.saucedemo.pages.LoginPage;
import com.qa.test.saucedemo.pages.ProductPage;
import com.qa.test.saucedemo.util.TestUtil;

public class CheckoutInformationPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	CartPage cartPage;
	CheckoutInformationPage checkoutinformationPage;
	CheckoutOverviewPage checkoutoverviewPage;
	
	public CheckoutInformationPageTest() {
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
		productPage.addToCart();
		cartPage = productPage.clickCart();
		checkoutinformationPage = cartPage.clickCheckout();
	}
	
	@Test
	public void clickContinue() throws InterruptedException {
		checkoutoverviewPage = checkoutinformationPage.clickContinueButton();
		Assert.assertEquals(checkoutoverviewPage.getCheckoutOverviewTitle(), "Checkout: Overview");
		Thread.sleep(TestUtil.threadSleep);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
