package com.canada.failTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	
	@Test
	public void getBroweser1() {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		System.out.println("GetChromeOne Method is running on Thread:"+Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassC.getTest9();
		 
	}
	@Test
	public void getBroweser2() {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		System.out.println("GetChromeOne Method is running on Thread:"+Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassC.getTest7();
		ClassC.getTest8();
		
	}
	@Test
	public void getBroweser3() {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		System.out.println("GetChromeOne Method is running on Thread:"+Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassA.getTest1();
		ClassA.getTest2();
		ClassA.getTest3();
		
		
}
	@Test
	public void getBroweser4() {
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		System.out.println("GetChromeOne Method is running on Thread:"+Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassB.getTest4();
		ClassB.getTest5();
		ClassB.getTest6();
		
		
}
	
}
