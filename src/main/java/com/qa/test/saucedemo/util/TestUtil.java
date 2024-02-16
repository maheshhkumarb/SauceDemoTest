package com.qa.test.saucedemo.util;

import com.qa.test.saucedemo.base.TestBase;

public class TestUtil extends TestBase{
	public static long pageLoadTimeout = 10000;
	public static long implicitWait = 5000;
	public static long explicitWait = 5000;
	public static long threadSleep = 5000;
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(threadSleep);
	}
}
