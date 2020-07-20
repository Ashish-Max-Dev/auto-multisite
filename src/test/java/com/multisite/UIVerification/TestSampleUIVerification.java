package com.multisite.UIVerification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.multisite.Library.AppLibrary;
import com.multisite.Library.TestBase;

public class TestSampleUIVerification extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("TestSampleUIVerification");
	}

	@Test
	public void launch() throws Exception {
		appLibrary.getDriverInstance();
		appLibrary.launchApp();
	}
}