package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		email.sendKeys("SiddharthaS@gmail.com");
		pass.sendKeys("Siddhartha@007");
		
		WebElement login= driver.findElement(By.xpath("//*[@id=\"u_0_d_xm\"]"));
		login.submit();
		
	}

}
