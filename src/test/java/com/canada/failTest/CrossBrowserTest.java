package com.canada.failTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CrossBrowserTest {
	
static WebDriver driver;
	
@BeforeTest
@Parameters("browser")
	public void setup(String browser) throws Exception{
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("User able to open Chrome Driver");
		
	}
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("User able to open Edge Driver");
		}
		else if (browser.equalsIgnoreCase("opera")) {
		//	WebDriverManager.operadriver().setup();
			System.setProperty("webdriver.opera.driver", "./Drivers/operadriver.exe");
			driver = new OperaDriver();
			System.out.println("User able to open Opera Driver");
	    }
	
		else {System.out.println("Incorrect browser");
		
	         }
	}

@Test
public void testParameterWithXML() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.get("https://www.zoopla.co.uk/");
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")).click();
//	driver.findElement(By.id("userName")).sendKeys("prodhansaif@yahoo.com");
//	driver.findElement(By.id("enterPwd")).sendKeys("saifuL12");
//	driver.findElement(By.xpath("//*[@value='Log in']")).click();
//	//driver.findElement(By.xpath("//*[contains(@class,'kDmApp')])[10]").click();
//	driver.findElement(By.xpath("//*[text()='Sign out']")).click();
//	driver.quit();
}	

@AfterTest
public void TearDown() {
	driver.manage().deleteAllCookies();
}
}
