package blazeRegisterUser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParabankRegistrationParameters {
	
	 public static ChromeDriver driver;
	 
	@Test(priority = 1)
    public void Registerbtntest() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        Thread.sleep(3000);

      WebElement Registerbtn =  driver.findElement(By.xpath("//a[normalize-space()='Register']"));
      
      boolean RegisterIsDisplayed = Registerbtn.isDisplayed();
      System.out.println(" el boton de register se muestra: " + RegisterIsDisplayed );
      
      Registerbtn.click();
	}
      
	@Parameters ({"firstName", "lastName", "street", "city", "state", "zipCode", "phoneNumber", "ssn", "username", "password", "repeatedPassword"})
	@Test(priority = 2)
	public void registerUser(String firstName, String lastName, String street, String city, String state, String zipCode, String phoneNumber, String ssn, String username, String password, String repeatedPassword) {

	    driver.findElement(By.id("customer.firstName")).sendKeys(firstName);
	    driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
	    driver.findElement(By.id("customer.address.street")).sendKeys(street);
	    driver.findElement(By.id("customer.address.city")).sendKeys(city);
	    driver.findElement(By.id("customer.address.state")).sendKeys(state);
	    driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
	    driver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
	    driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
	    driver.findElement(By.id("customer.username")).sendKeys(username);
	    driver.findElement(By.id("customer.password")).sendKeys(password);
	    driver.findElement(By.id("repeatedPassword")).sendKeys(repeatedPassword);
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	}


	
	@Test(priority = 3)
	public void registerUserValidation()  {
		

	      WebElement Registervalidation =  driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));
	      
	      boolean RegisterIsDisplayed = Registervalidation.isDisplayed();
	      System.out.println(" el boton de register se muestra: " + RegisterIsDisplayed );
	      
	      String registrationgetText = Registervalidation.getText();
	      System.out.println(" el texto de validacion de registro es : " + registrationgetText);
	      
	      
		
	}
	
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
