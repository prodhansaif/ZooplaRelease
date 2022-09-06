package zooplarelease.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import cucumber.runtime.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ZRbasePage {
	
	public static Logger logger;
	public static Properties prop;
	public static WebDriver driver;
	
	public ZRbasePage() {
		logger = Logger.getLogger("QA Saif Prodhan");
		PropertyConfigurator.configure("Log4j.properties");
		
		try {
		prop = new Properties();
		FileInputStream CP = new FileInputStream(
		System.getProperty("user.dir") + "/src/main/java/configuration/ZRconfig.prop");
		prop.load(CP);
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}}

	
	public static void initializations () {
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		String MyBrowsers = prop.getProperty("browser");
		if(MyBrowsers.equals("chrome")) {
		logger.info("User able to open chrome driver");	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(MyBrowsers.equals("edge"))	{
		logger.info("User able to open edge driver");	
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		}
		else if(MyBrowsers.equals("firefox"))	{ //doesn't work at all
		logger.info("User able to open firefox driver");	
		//WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else if(MyBrowsers.equals("opera"))	{
		logger.info("User able to open opera driver");	
		//WebDriverManager.operadriver().setup(); 
		System.setProperty("webdriver.opera.driver", "./Drivers/operadriver.exe");
		driver = new OperaDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//System.out.println(prop.getProperty("URL"));
	}

}
/*
WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();
WebDriverManager.edgedriver().setup();
WebDriverManager.operadriver().setup();
WebDriverManager.chromiumdriver().setup();*/