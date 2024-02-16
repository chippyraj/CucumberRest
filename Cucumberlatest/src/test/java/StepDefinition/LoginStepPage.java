package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginStepPage {
	
	private WebDriver driver;
	private LocatorPage locator;
	
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		
	}
	@After
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	
	@Given("I am the OpenCart login page")
	public void i_am_the_open_cart_login_page() {
		driver.get("https://www.opencart.com/index.php?route=account/login");
		locator= new LocatorPage(driver);
	    
	}

	@Given("I have entered valid user name and password")
	public void i_have_entered_valid_user_name_and_password() {
		locator.enterusername("chippyraj523538@gmaui.com");
		locator.enterpassword("Chippy@2023");
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		locator.loginbuttonlink();
	}

	@Then("i can navigate to home page")
	public void i_can_navigate_to_home_page() {
		Assert.assertTrue(locator.checklogoutlink());
	

	/*@Given("I have entered invalid invalid@email.com and errorfactor")
	public void i_have_entered_invalid_invalid_email_com_and_errorfactor() {
	}

	@When("I entered the login button")
	public void i_entered_the_login_button() {
	}

	@Then("I should see an error message indicating Warning:No match with Email address and password")
	public void i_should_see_an_error_message_indicating_warning_no_match_with_email_address_and_password() {
	}

	@Given("I have entered invalid anbdh and errormessage")
	public void i_have_entered_invalid_anbdh_and_errormessage() {
	}

	@Given("I have entered invalid xyzs and cvgt")
	public void i_have_entered_invalid_xyzs_and_cvgt() {
	}

	@When("Click the forgot password link")
	public void click_the_forgot_password_link() {
	}

	@Then("Redirect to the forgot password page")
	public void redirect_to_the_forgot_password_page() {
	}*/



}
