package ProgrammeJava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SaucedemoTests {

	public static void main(String[] args) throws IOException{
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Navigate to the URL
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            // 2. Enter username
            WebElement usernameField = driver.findElement(By.id("user-name"));
            usernameField.sendKeys("standard_user");

            // 3. Enter password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            // 4. Click login
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            // 5. Assert that login is successful by checking URL or element
            String expectedUrl = "https://www.saucedemo.com/inventory.html";
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "Login Failed!");

            // 6. Take screenshot after login
          //  TakesScreenshot screenshot = (TakesScreenshot) driver;
           // File src = screenshot.getScreenshotAs(OutputType.FILE);
         /*  Files.copy(src.toPath(), Paths.get("C:\\Jenkins\\ravi.png"));
           // Files.copy(src.toPath(), Paths.get("./screenshot_after_login.png"));
            System.out.println("Screenshot taken: screenshot_after_login.png");*/

            TakesScreenshot screenshot=(TakesScreenshot)driver;
      	  File Sfile=screenshot.getScreenshotAs(OutputType.FILE);
      	  
      	  File dfile=new File("C:\\Jenkins\\ravi.png");
      	  Sfile.renameTo(dfile);
      	  
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7. Close browser
         
        }
    }
}
