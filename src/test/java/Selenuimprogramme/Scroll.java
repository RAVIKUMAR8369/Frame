package Selenuimprogramme;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.get("https://www.saucedemo.com/");

	driver.manage().window().maximize();
    driver.get("https://www.w3schools.com"); // You can use any scrollable website

    // ✅ Scroll down by 1000 pixels
   // JavascriptExecutor  js=(JavascriptExecutor)driver;
    //js.executeScript("window.scrollBy(0,6000);");
    WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Bash']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", element);

    // Wait to observe the scroll
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}

