package Selenuimprogramme;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggestion_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenuim");
		Thread.sleep(5000);
	List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("selenium")) {
			list.get(i).click();
			break;
		}
		
	}
	
	
	}

}
