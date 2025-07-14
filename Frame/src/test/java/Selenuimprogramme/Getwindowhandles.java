package Selenuimprogramme;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		System.out.println(driver.getWindowHandle());
		
		Set<String> allids=driver.getWindowHandles();
		Iterator<String> id=allids.iterator();
		
		String parentid=id.next();
		String childid=id.next();
		
		
		driver.switchTo().window(childid);
		
		driver.findElement(By.xpath("//i[@class='IRFlight']")).click();
		
	}

}
