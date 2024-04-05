package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	@Given("Enter the username")
	public void enter_the_username() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@Given("Enter the password")
	public void enter_the_password() {
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("click the login button")
	public void click_login() {
	   driver.findElement(By.id("login-button")).click();
	}

}
