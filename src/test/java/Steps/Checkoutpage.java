package Steps;

import org.openqa.selenium.By;

import Base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Checkoutpage extends BaseClass {
	@And("Click the Checkout button")
	public void click_checkout_button() {
	    driver.findElement(By.id("checkout")).click();
	}
	@And("Enter the Firstname")
	public void enter_firstname() {
	    driver.findElement(By.id("first-name")).sendKeys("suganthi");
	}
	@And("Enter the Lastname")
	public void enter_Lastname() {
	    driver.findElement(By.id("last-name")).sendKeys("C");
	}
	@And("Enter the pincode")
	public void enter_pincode() {
	    driver.findElement(By.id("postal-code")).sendKeys("890890");;
	}
	@And("Click continue")
	public void click_continue() {
	    driver.findElement(By.id("continue")).click();
	}
	@And("Verify the sauce card number and print in the console")
	public void verify() {
	   
	    String saucecard=driver.findElement(By.xpath("(//div[@class='summary_value_label'])[1]")).getText();
		   String[] text= saucecard.split("\n");
		   System.out.println("Sauce Card number is :" +text[0]);
	}
	
}
