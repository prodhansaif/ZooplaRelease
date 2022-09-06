package com.canada.failTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTesting {
	WebDriver driver;
	
	@BeforeMethod
	public void getSetup() {
		WebDriverManager.chromedriver().setup();
		System.out.println("GetChromeOne Method is running on Thread:"+Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		System.out.println("Browser is open");
	}
	@Test 
	public void getFunctionalTestOne() {
		
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("TestOne");
	}
	@Test 
	public void getFunctionalTestTwo() {
		
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("TestTwo");
		
	}
	@Test 
	public void getFunctionalTestThree() {
			
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("TestThree");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Browser is closed");	
	
	
	
}
	
	
}
