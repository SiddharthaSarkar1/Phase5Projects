package com.simplilearn.automatethewebapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGTestingWebApp {
	WebDriver driver;
	SoftAssert soft;

	@BeforeMethod
	public void beforeMethod() {
		soft = new SoftAssert();
	}

	@AfterMethod
	public void afterMethod() {
		soft = null;
	}

	@Test
	public void launchAma() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement nav = driver.findElement(By.id("nav-link-accountList"));
		nav.click();

		WebElement sub = driver.findElement(By.id("createAccountSubmit"));
		sub.click();

		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Siddhartha");

		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("siddhartha123@gmail.com");

		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("12345678");
		
		WebElement confPass = driver.findElement(By.id("ap_password_check"));
		confPass.sendKeys("12345678");
		

	}

	@Test(dependsOnMethods = { "launchAma" })
	public void testTitle() {
		soft.assertAll();
	}

	@Test(priority = 2)
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("siddhartha123@gmail.com");
		driver.findElement(By.id("continue")).click();

	}

	@Test(priority = 3)
	public void addToCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SID\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple iphone 13");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).submit();
		driver.findElement(By.className("s-image")).click();
		driver.findElement(By.className("a-button-text")).submit();
	}

}