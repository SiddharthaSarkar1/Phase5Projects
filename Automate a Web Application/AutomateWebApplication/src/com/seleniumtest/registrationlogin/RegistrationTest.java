package com.seleniumtest.registrationlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        
        
        WebElement email= driver.findElement(By.id("sView1:r1:0:email::content"));
        email.sendKeys("siddharthas123@mailinator.com");
        
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
        
        WebElement comp = driver.findElement(By.id("sView1:r1:0:companyName::content"));
		comp.sendKeys("XYZ pvt Ltd");
        
        WebElement wPhone= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:workPhone::content\"]"));
        wPhone.sendKeys("9830111111");
        
        WebElement address1= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:address1::content']"));
        address1.sendKeys("Chatterjee International Centre, 4th Floor Flat-14,Jawaharlal Nehru Rd, Park Street area, Kolkata,");
        
        WebElement address2= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:address2::content']"));
        address2.sendKeys("West Bengal, India");
        
        WebElement city= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:city::content']"));
        city.sendKeys("Kolkata, West Bengal, India");
        
        Select state = new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
        state.selectByVisibleText("West Bengal");
        
        WebElement zip= driver.findElement(By.cssSelector("input[id*='sView1:r1:0:postalCode::content']"));
        zip.sendKeys("700104");
        
        WebElement button= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:b1\"]/a"));
		button.submit();
		
//		driver.close();
		
	}

}
