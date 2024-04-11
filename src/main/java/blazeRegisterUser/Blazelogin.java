package blazeRegisterUser;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Blazelogin {
	
	 
	 
	@Test(priority = 1)
    public void loginPageValidation() throws InterruptedException {
		WebElement loginbtnValidation = BlazeSignin.driver.findElement(By.id("login2"));

		 boolean loginBthIsDisplayed = loginbtnValidation.isDisplayed();
	      System.out.println(" el boton de register se muestra: " + loginBthIsDisplayed);
	      
	      String logingetText = loginbtnValidation.getText();
	      System.out.println(" el texto de validacion de registro es : " + logingetText );    
	}
	
	
  @Parameters ({"username" , "password"})
	@Test(priority = 2)
	public void loginUser(String username , String password  ) throws InterruptedException  {
	  BlazeSignin.driver.findElement(By.id("login2")).click();
	  Thread.sleep(2000);
	  BlazeSignin.driver.findElement(By.id("loginusername")).sendKeys(username);
	  BlazeSignin.driver.findElement(By.id("loginpassword")).sendKeys(password);
	  BlazeSignin.driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	  	
	}

  @Test(priority = 3)
  public void logintestValidation() throws InterruptedException {
	  WebElement welcomeElement = BlazeSignin.driver.findElement(By.id("nameofuser"));
      
      String welcomeText = welcomeElement.getText();
      if (welcomeText.equals("Welcome")) {
          System.out.println("El inicio de sesión fue exitoso. El texto de bienvenida es correcto.");
      } else {
          System.out.println("Error: El texto de bienvenida no es correcto.");
      }
      
  }
  
  
  

}
