package Selenuimprogramme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameiframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Frame1 
		WebElement Frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(Frame1);  //Switch frame using webelement
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent(); //this method go to the page 
		
		//Farme2                       //if the name and id in xpath= using frame("id") frame("name")
		WebElement Frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(Frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenuim");
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement Frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(Frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Auto");
		//frame under iframe using index because only one iframe in frame 
		driver.switchTo().frame(0);
		
       WebElement radio1= driver.findElement(By.xpath("//div[@id='i9']//div[@class='rseUEf nQOrEb']"));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", radio1);
       
        driver.switchTo().defaultContent();
	}

}
