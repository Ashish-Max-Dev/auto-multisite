package com.multisite.PageObject;

import com.multisite.Library.AppLibrary;

public class SignUpScreen {

	AppLibrary appLibrary;

	public static String signUpNow = "xpath://button[@title='Sign Up Now']";

	public static String emailAddress = "id:txtRegEmail";

	public static String regPassword = "id:txtRegPassword";

	public static String regConfPassword = "id:txtConfirmPassword";

	public static String signUpBtn = "id:kc-login";

	public SignUpScreen(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;

	}

	public SignUpScreen signUpFunctionality() throws Exception {

		appLibrary.enterText(emailAddress, "ashishm@yopmail.com");

		appLibrary.enterText(regPassword, "!Qwerty123");

		appLibrary.enterText(regConfPassword, "!Qwerty123");

		return new SignUpScreen(appLibrary);

	}

	public SignUpScreen clickOnSignUpBtn() {

		appLibrary.clickElement(SignUpScreen.signUpBtn);

		return new SignUpScreen(appLibrary);

	}

	public SignUpScreen clickOnSignUpNowBtn() {

		appLibrary.clickElement(SignUpScreen.signUpNow);

		return new SignUpScreen(appLibrary);

	}

}
