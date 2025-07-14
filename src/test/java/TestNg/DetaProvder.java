package TestNg;

import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DetaProvder {
	
@DataProvider(name="data")
	public Object[][] searchdata(){
		Object[][] searchkeyword=new Object[3][2];
		searchkeyword[0][0]="Indai";
		searchkeyword[0][1]="Rammandir";
		searchkeyword[1][0]="Delhi";
		searchkeyword[1][1]="Canught place";
		searchkeyword[2][0]="haryana";
		searchkeyword[2][1]="gurugram";
		
		return searchkeyword;
		
		
	}
	
	@Test(dataProvider="data")
	public void Data(String country,String place) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	   WebElement searchelement= driver.findElement(By.id("APjFqb"));
	   
	   searchelement.sendKeys(country+" "+place);
	   
	   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		
		
	}

}
