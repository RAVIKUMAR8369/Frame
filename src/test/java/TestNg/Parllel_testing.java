package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Parllel_testing {
@Test
	public static void gettitle(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		String actualtitle=driver.getTitle();
		String expectedtitle="Swag Labs";
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}
@Test
	public static void Method() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
	
}
}
