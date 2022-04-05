package com.simplilearn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookLoginTest {

    private WebDriver driver;

    @Test(groups = "FB")
    public void launchFacebook() {
        driver.get("http://www.facebook.com");
    }

    @Test(groups="FB", dependsOnMethods = "launchFacebook")
    public void login() {
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("siddhartha@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#pass"));
        password.sendKeys("Siddhartha@123");

        WebElement button = driver.findElement(By.name("login"));
        button.click();
    }

    
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterTest
    public void afterTest() {
    	driver = null;
    }
}
