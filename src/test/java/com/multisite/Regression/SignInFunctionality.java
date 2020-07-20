package com.multisite.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.multisite.Library.AppLibrary;
import com.multisite.Library.TestBase;
import com.multisite.PageObject.SignInScreen;

public class SignInFunctionality extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {

		appLibrary = new AppLibrary("SignInFuntionalityTest");

	}

	@Test
	public void SignInTest() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		new SignInScreen(appLibrary).signInFunctionality();
		new SignInScreen(appLibrary).clickOnSignInBtn();

	}

}
