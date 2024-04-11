package blazeRegisterUser;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BlazeSignin {
	
	 public static ChromeDriver driver;
	 
	@Test(priority = 1)
    public void Registerbtntest() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(3000);

      WebElement Registerbtn =  driver.findElement(By.id("signin2"));
      
      boolean RegisterIsDisplayed = Registerbtn.isDisplayed();
      System.out.println(" el boton de register se muestra: " + RegisterIsDisplayed );
      
      Registerbtn.click();
	}
     

	@Parameters ({"username", "password"})
	@Test(priority = 2)
	
	
	public void registerUser(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.id("sign-username")).sendKeys(username);
	    driver.findElement(By.id("sign-password")).sendKeys(password);
	    driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
	    Thread.sleep(3000);
	    
	 // switch focus from normal window to alert
	    Alert al = driver.switchTo().alert();

	    // get the text of alert
	    String alertText = al.getText();
	    System.out.println("Alert text is: " + alertText);

	    // click on OK, Accept
	    al.accept(); // click on OK button of alert

	}


	
	@Test(priority = 3)
	public void validateCategoriesElement() {
	    try {
	        WebElement categoriesElement = driver.findElement(By.xpath("//a[normalize-space()='CATEGORIES'][1]"));
	        boolean isDisplayed = categoriesElement.isDisplayed();
	        System.out.println("¿El elemento CATEGORIES se muestra en la página?: " + isDisplayed);
	        
	        if (isDisplayed) {
	            String text = categoriesElement.getText();
	            System.out.println("Texto del elemento CATEGORIES: " + text);
	        }
	    } catch (NoSuchElementException e) {
	        System.out.println("El elemento CATEGORIES no está presente en la página.");
	    }
	}

	@Ignore
	@Test(priority = 4)
	public void logout()  {
		
       
     WebElement logoutbtnValidation = driver.findElement(By.linkText("Log Out"));
     
     boolean RegisterIsDisplayed = logoutbtnValidation .isDisplayed();
     System.out.println(" el boton de log out: " + RegisterIsDisplayed );
     
     String registrationgetText = logoutbtnValidation .getText();
     System.out.println(" el texto de validacion de log out  es : " + registrationgetText);
     
     logoutbtnValidation.click();
     
		
	}
	
}
