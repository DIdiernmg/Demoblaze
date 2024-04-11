package blazeRegisterUser;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParabankSignInParameters {
	
	 
	 
	@Test(priority = 1)
    public void loginPageValidation() throws InterruptedException {
		WebElement loginbtnValidation = ParabankRegistrationParameters.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));

		 boolean loginBthIsDisplayed = loginbtnValidation.isDisplayed();
	      System.out.println(" el boton de register se muestra: " + loginBthIsDisplayed);
	      
	      String logingetText = loginbtnValidation.getText();
	      System.out.println(" el texto de validacion de registro es : " + logingetText );
  
	     
	}
  @Parameters ({"username" , "password" , "repassword" })
	@Test(priority = 2)
	public void loginUser(String username , String password , String repassword )  {
		
    	ParabankRegistrationParameters.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(username);
    	ParabankRegistrationParameters.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys(password);
    	ParabankRegistrationParameters.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
      
		
	}

             	

}
