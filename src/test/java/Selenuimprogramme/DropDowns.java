package Selenuimprogramme;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.xpath("//select[@id='country']"));
		Select select =new Select(element);
	//	select.selectByIndex(2);
	//	select.deselectByValue("japan");
	//	select.selectByVisibleText("France");
		
		
	List<WebElement> alloption=	select.getOptions();      //getoptions method return all dropdown as webelement
		for(WebElement el:alloption) {
			System.out.println(el.getText());
		}
	
	
		
		
		
		
		
	}

}
