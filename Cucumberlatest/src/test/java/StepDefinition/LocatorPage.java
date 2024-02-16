package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorPage {
	
	private WebDriver driver;
	
	private By emailInputLocator = By.name("email");
	private By passwordInputLocator = By.name("password");
	private By loginbutton = By.xpath("//input[@type='submit']");
	private By forgotlocator = By.className("btn-link");
	private By logoutbutton = By.className("btn btn-black navbar-btn");
	
	public LocatorPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void enterusername(String username) {
		WebElement inputusername = driver.findElement(emailInputLocator);
		inputusername.sendKeys(username);
		
		
	}
	public void enterpassword(String password) {
		WebElement inputpassword = driver.findElement(passwordInputLocator);
		inputpassword.sendKeys(password);
		
	}	
	
	public void loginbuttonlink() {
		WebElement clickloginbutton = driver.findElement(loginbutton);
		clickloginbutton.click();
	}
	
	public boolean checklogoutlink() {
		 return driver.findElement(logoutbutton).isDisplayed();
	}
	
	
	
			
}		
			
			
			
			
			
			
			


