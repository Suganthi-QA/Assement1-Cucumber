package Base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	public static  ChromeDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public void Preconditions()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com");
	}
	@AfterMethod
	public void postconditions()
	{
		driver.close();
	}
	
}

