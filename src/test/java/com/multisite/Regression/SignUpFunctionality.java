package com.multisite.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.multisite.Library.AppLibrary;
import com.multisite.Library.TestBase;
import com.multisite.PageObject.SignUpScreen;

public class SignUpFunctionality extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {

		appLibrary = new AppLibrary("SignUpFuntionalityTest");

	}

	@Test
	public void SignUpTest() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		new SignUpScreen(appLibrary).clickOnSignUpNowBtn();
		new SignUpScreen(appLibrary).signUpFunctionality();
		new SignUpScreen(appLibrary).clickOnSignUpBtn();
		

	}

}
