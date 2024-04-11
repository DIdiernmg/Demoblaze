package com.blaze.test;

import org.testng.annotations.Test;

import com.blazdemo.pages.AddToCartPage;
import com.blazdemo.pages.SignInPage;

public class AddToCartTest extends BaseTest {

	@Test
	public void ShoppingCart() throws InterruptedException {

		AddToCartPage addToCartPage = new AddToCartPage();

		addToCartPage.addToCart();
		addToCartPage.acceptAlert(driver);
		
		String name = "John Doe";
        String country = "USA";
        String city = "New York";
        String card = "1234567812345678";
        String month = "12";
        String year = "2025";

        // Llenar el formulario y realizar la compra
        addToCartPage.fillFormAndPurchase(name, country, city, card, month, year);
    }

	
	
	
	

}

