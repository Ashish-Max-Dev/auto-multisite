package com.multisite.PageObject;

import com.multisite.Library.AppLibrary;

public class SignInScreen {

	AppLibrary appLibrary;

	public static String emailText = "id:txtEmail";

	public static String password = "id:txtPassword";

	public static String signBtn = "id:kc-login";

	public SignInScreen(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;

	}

	public SignInScreen signInFunctionality() throws Exception {

		appLibrary.enterText(emailText, "ashishm@yopmail.com");

		appLibrary.enterText(password, "!Qwerty123");

		return new SignInScreen(appLibrary);

	}

	public SignInScreen clickOnSignInBtn() {

		// appLibrary.clickElement(SignUpScreen.signUpBtn);
		appLibrary.clickElement(SignInScreen.signBtn);

		return new SignInScreen(appLibrary);
	}

}
