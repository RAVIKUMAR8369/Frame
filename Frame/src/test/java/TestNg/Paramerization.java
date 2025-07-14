package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramerization {
	WebDriver driver;
	
@BeforeMethod
@Parameters("broswer")
	public void setup(String broswer) {
		if(broswer.equals("chrome")) {
			driver=new ChromeDriver();
		}else if
		(broswer.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		
	}

@Test
	public void test() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
