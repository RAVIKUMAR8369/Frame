package Selenuimprogramme;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over_Actions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//Mouse over action
	//	WebElement mouse=driver.findElement(By.xpath("//button[@class='dropbtn']"));
	//	WebElement moveto=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		Actions action =new Actions(driver);
	//	action.moveToElement(mouse).moveToElement(moveto).click().build().perform();

	//ContextClickmethod is right click
		
		//Double click
	/*	WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		box1.clear();
		box1.sendKeys("Welcome");
	WebElement DubleClick=	driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		action.doubleClick(DubleClick).perform(); */
		
		//Drag and Drop
		WebElement element1=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement element2=driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
		action.dragAndDrop(element1, element2).build().perform();
		
	}

}
