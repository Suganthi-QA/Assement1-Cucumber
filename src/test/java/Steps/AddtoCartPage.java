package Steps;

import org.openqa.selenium.By;

import Base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class AddtoCartPage extends BaseClass {
	@And("Click cart icon")
	public void click_cart() {
	    driver.findElement(By.className("shopping_cart_link")).click();
	}
}
