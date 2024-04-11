package com.blazdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;


import com.blaze.test.BaseTest;

public class SignInPage {
	
	
    // signIn locator
	@FindBy(id = "signin2")
	WebElement SingInLocator;
	
	
	   // username
	
		@FindBy(id = "sign-username")
		WebElement userNameTextBox;

		// password
		@FindBy(id = "sign-password")
		WebElement passwordTextBox;

		// login button
		@FindBy(xpath = "//button[normalize-space()='Sign up']")
		WebElement SignInBTn;
		
		//switch.to.alert
		
		// constructor 
		public SignInPage() {
			PageFactory.initElements(BaseTest.driver, this);
		}
		
		
		//methods
		
		public void SignInToApplication(String userName , String password) throws InterruptedException {
			SingInLocator.click();
			userNameTextBox.sendKeys(userName);
			passwordTextBox.sendKeys(password);
			Thread.sleep(1000);
			SignInBTn.click();
			Thread.sleep(2000);
			
		}
		
		 public void acceptAlert(WebDriver driver) {
		        Alert alert = driver.switchTo().alert();
		        String alertText = alert.getText();
		        System.out.println("Alert text is: " + alertText);
		        alert.accept();
		    }
		
			
}
