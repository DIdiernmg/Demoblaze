package com.blazdemo.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.blaze.test.BaseTest;

public class AddToCartPage extends BaseTest {
    
    // categorylocator
    @FindBy(xpath = "//a[@id='cat']")
    WebElement categoryLocatorBtn;

    // phone locator
    @FindBy(xpath = "(//a[normalize-space()='Phones'])[1]")
    WebElement phoneLocator;

    // laptop locator
    @FindBy(xpath = "(//a[normalize-space()='Laptops'])[1]")
    WebElement laptopLocator;

    // monitor locator
    @FindBy(xpath = "(//a[normalize-space()='Monitors'])[1]")
    WebElement monitorLocator;
    
    //phoneProduct
    
    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    WebElement SamsungLocator;
    
    @FindBy(xpath = "//a[normalize-space()='Nokia lumia 1520']")
    WebElement NokiaLocator;
  
    @FindBy(xpath = "//a[normalize-space()='Sony xperia z5']")
    WebElement sonyLocator;
  
    @FindBy(xpath = "//a[normalize-space()='Add to cart']")
    WebElement addToCartBtn;
    
  
  
    
    //monitorproduct
    
    @FindBy(xpath = "//a[normalize-space()='Apple monitor 24']")
    WebElement monitorappleLocator;
    
  
    
    //laptopproduct
    
    @FindBy(xpath = "//a[normalize-space()='Sony vaio i5']")
    WebElement laptopSonyLocator;
    
    @FindBy(xpath = "//a[normalize-space()='MacBook air']")
    WebElement mackbookeLocator;
    
    //cart
    
    @FindBy(css = "#cartur")
    WebElement cartLocator;
    
    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    WebElement placeOrderBtn;
    
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement okBtn;
  
    
    // formsLocators
    
    

     @FindBy(id = "name")
     WebElement nameInput;

     @FindBy(id = "country")
     WebElement countryInput;

     @FindBy(id = "city")
     WebElement cityInput;

     @FindBy(id = "card")
     WebElement cardInput;

     @FindBy(id = "month")
     WebElement monthInput;

     @FindBy(id = "year")
     WebElement yearInput;

     @FindBy(xpath = "//button[normalize-space()='Purchase']")
     WebElement purchaseBtn;
  
  
    // constructor 
    
	public AddToCartPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
    
    //methods
	

	public void addToCart() throws InterruptedException  {
	    categoryLocatorBtn.click();
	    Thread.sleep(2000);
	    phoneLocator.click();
	    Thread.sleep(2000);
	    SamsungLocator.click();
	    addToCartBtn.click();
	    Thread.sleep(2000);
	    
	}

	
	public void acceptAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);
        alert.accept();
    }
	
	
	public void fillFormAndPurchase(String name, String country, String city, String card, String month, String year) throws InterruptedException {
	    cartLocator.click();
	    Thread.sleep(2000);
	    placeOrderBtn.click();
	    nameInput.sendKeys(name);
	    countryInput.sendKeys(country);
	    cityInput.sendKeys(city);
	    cardInput.sendKeys(card);
	    monthInput.sendKeys(month);
	    yearInput.sendKeys(year);
	    purchaseBtn.click();
	    Thread.sleep(2000);
	    okBtn.click();
	}
	
	

	
	

	
	
}
