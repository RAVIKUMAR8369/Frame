package Selenuimprogramme;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handle_statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//Static table
		//find total no of rows in table " findelements"
	     int rows  = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		//find total no of column
		 int col  = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println(col);
			
			//find data in table bookname
			String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td[1]")).getText();
			System.out.println(bookname);
			//Print the all header
			String Header=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]")).getText();
			System.out.println(Header);
			
			//Print book name whose auther name "mukesh"
			for(int r=2;r<=rows;r++) {
				String authername=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				
				if(authername.equals("Mukesh")) {
					String Mbookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(Mbookname +"\t"+authername);
				}
			}
	}

}
