package com.qa.test.saucedemo.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.test.saucedemo.base.TestBase;
import com.qa.test.saucedemo.pages.HomePage;
import com.qa.test.saucedemo.pages.LoginPage;
import com.qa.test.saucedemo.pages.ProductPage;
import com.qa.test.saucedemo.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialize();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void clickOneProduct() throws InterruptedException {
		productPage = homePage.clickProduct();
		Assert.assertEquals("Sauce Labs Bolt T-Shirt", productPage.checkProduct());
		Assert.assertEquals(productPage.checkPrice(),"$15.99");
		Thread.sleep(TestUtil.threadSleep);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
