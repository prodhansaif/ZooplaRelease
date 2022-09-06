package zooplarelease.generic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import zooplarelease.baseclass.ZRbasePage;

public class WaitHelper extends ZRbasePage {
	public static void explicitWaitStatement(WebElement Waiter) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Waiter));
	}
	
	public static void waitForMeThenClick (WebElement element, WebDriver driver) {
		Wait<WebDriver>fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}

}



