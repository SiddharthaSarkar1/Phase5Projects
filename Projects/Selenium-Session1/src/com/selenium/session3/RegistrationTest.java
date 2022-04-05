package com.selenium.session3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        
        
        WebElement email= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:email::content\"]"));
        email.sendKeys("siddhartha1234@gmail.com");
        
        WebElement password= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:password::content\"]"));
        password.sendKeys("Siddhartha@123");
        
        WebElement rePassword= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:retypePassword::content\"]"));
        rePassword.sendKeys("Siddhartha@123");
        
        WebElement fname= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:firstName::content']"));
        fname.sendKeys("Siddhartha");
        
        WebElement lname= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:lastName::content']"));
        lname.sendKeys("Sarkar");
        
        WebElement jtitle= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:jobTitle::content']"));
        jtitle.sendKeys("Computer Work");
        
        WebElement wPhone= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:workPhone::content\"]"));
        wPhone.sendKeys("9830111111");
        
        WebElement address1= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:address1::content']"));
        address1.sendKeys("Chatterjee International Centre, 4th Floor Flat-14,Jawaharlal Nehru Rd, Park Street area, Kolkata,");
        
        WebElement address2= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:address2::content']"));
        address2.sendKeys("West Bengal, India");
        
        WebElement city= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:city::content']"));
        city.sendKeys("Kolkata, West Bengal, India");
        
        WebElement zip= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:postalCode::content']"));
        zip.sendKeys("700104");
        
	}
}
