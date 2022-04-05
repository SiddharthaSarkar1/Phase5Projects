package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {
	public static void main(String[] args) {
		
		//set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.shine.com/registration/parser");
        
        WebElement check= driver.findElement(By.xpath("//*[@id=\"id_privacy\"]"));
        
        if(check.isSelected()) {
        	check.click();
        }
		
	}
}
