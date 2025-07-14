package ProgrammeJava;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNg_Practice {
 
	
	WebDriver driver;
	@BeforeMethod
	public void Test() {
		
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		/*String actualUrl="https://www.saucedemo.com/inventory.html";
		String expectedurl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedurl, "Login Failed");*/
		
		
	}
	@Test(priority=0)
	public void VerifyLoginpage() {
		String actualUrl="https://www.saucedemo.com/inventory.html";
		String expectedurl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedurl, "Login Failed");
		
	}
	@Test(priority=1)
	public void Verifytitle() {
		String actualtitle="Swag Labs";
		String Expectedtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, Expectedtitle, "Title Failed");
	}
	
}
