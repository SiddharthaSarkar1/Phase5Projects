package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	public static void main(String[] args) {
		//set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hackerrank.com/auth/signup");
        
        WebElement name= driver.findElement(By.xpath("//*[@id=\"input-1\"]"));
        name.sendKeys("Siddhartha Sarkar");
        
        WebElement email= driver.findElement(By.xpath("//*[@id=\"input-2\"]"));
        email.sendKeys("siddhartha1234@gmail.com");
        
        WebElement pass= driver.findElement(By.xpath("//*[@id=\"input-3\"]"));
        pass.sendKeys("Siddhartha12345");
        
        WebElement button= driver.findElement(By.xpath("//*[@id=\"tab-1-content-0\"]/div[1]/form/div[4]/button"));
        button.submit();

        
	}
	
}
