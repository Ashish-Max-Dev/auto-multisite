package com.multisite.PageObject;

import org.openqa.selenium.WebDriver;

import com.multisite.Library.AppLibrary;

public class TestSamplePage {

	WebDriver driver;
	AppLibrary appLibrary;

	String xpathSampleLocatorString = "xpath://locator";
	
	public TestSamplePage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	
}
