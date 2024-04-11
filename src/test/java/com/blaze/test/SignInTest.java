package com.blaze.test;

import org.testng.annotations.Test;

import com.blazdemo.pages.LoginPage;
import com.blazdemo.pages.SignInPage;

public class SignInTest extends BaseTest {

	@Test
	public void SignInWithValidUserNameAndValidPassword() throws InterruptedException {

		SignInPage SignInPage = new SignInPage();

		 SignInPage.SignInToApplication("pageobject23", "pageobject23");
	     SignInPage.acceptAlert(driver);
	     
	     

	}
	
}


