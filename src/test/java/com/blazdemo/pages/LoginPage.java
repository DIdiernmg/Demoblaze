package com.blazdemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.blaze.test.BaseTest;

import blazeRegisterUser.BlazeSignin;



public class LoginPage {
	
	// loginLocator
		@FindBy(id = "login2")
		WebElement loginLocatorBtn;

	// username
	@FindBy(id = "loginusername")
	WebElement userNameTextBox;

	// password
	@FindBy(id = "loginpassword")
	WebElement passwordTextBox;

	// login button
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement loginBTn;
	
	// constructor 
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	//methods
	
	public void loginToApplication(String userName , String password) throws InterruptedException {
		
		loginLocatorBtn.click();
		Thread.sleep(2000);
		userNameTextBox.sendKeys(userName);
		passwordTextBox.sendKeys(password);
		Thread.sleep(2000);
		loginBTn.click();
		
	}
	
	

	
}
