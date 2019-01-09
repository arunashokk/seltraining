package com.app.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterAnnotations {
	
	@Test
	public void login(){	
	System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	}
	
}
