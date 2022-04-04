package com.seleniumtest.registrationlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://login.oracle.com/mysso/signon.jsp?request_id=007");


        WebElement username=driver.findElement(By.id("sso_username"));
        username.sendKeys("siddharthas123@mailinator.com");

        WebElement pass =driver.findElement(By.id("ssopassword"));
        pass.sendKeys("Siddhartha@123");

        WebElement button= driver.findElement(By.id("signin_button"));
        button.submit();

		
	}
}
