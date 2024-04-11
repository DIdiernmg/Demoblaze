package com.blaze.test;



import org.testng.annotations.Test;

import com.blazdemo.pages.LoginPage;


public class LoginTest extends BaseTest{

	@Test
	public void loginWithValidUserNameAndValidPassword() throws InterruptedException {

		LoginPage loginPage = new LoginPage();

		loginPage.loginToApplication("pageobject23", "pageobject23");

	}

}