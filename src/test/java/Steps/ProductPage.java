package Steps;

import org.openqa.selenium.By;

import Base.BaseClass;
import io.cucumber.java.en.When;

public class ProductPage  extends BaseClass{
	@When("Choose the product item")
	public void click_product() {
		driver.findElement(By.id("item_2_title_link")).click();
	 
	}
	
	@When("click add to cart")
	public void add_to_cart() {
		driver.findElement(By.id("add-to-cart")).click();
	}
}
