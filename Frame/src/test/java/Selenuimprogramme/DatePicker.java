package Selenuimprogramme;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		 String ExpectedYear = "2025";
	        String ExpectedMonth = "August";
	        String ExpectedDay = "1";

	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://jqueryui.com/datepicker/");

	        // Switch to frame
	        driver.switchTo().frame(0);
	        driver.findElement(By.id("datepicker")).click();

	        while (true) {
	            String CalenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	            String CalenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

	            if (CalenderMonth.equals(ExpectedMonth) && CalenderYear.equals(ExpectedYear)) {
	                List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
	                for (WebElement el : daylist) {
	                    String CalenderDay = el.getText();
	                    if (CalenderDay.equals(ExpectedDay)) {
	                        el.click();
	                        break;
	                    }
	                }
	                break;
	            } else {
	                // Click Next only
	                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //for next month
	              //  driver.findElement(By.xpath(" //span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//For prvious month/date
	            }
	        }

	        // Add driver.quit() if needed
	        // driver.quit();
	    }
	}