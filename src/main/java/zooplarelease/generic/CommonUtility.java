package zooplarelease.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import zooplarelease.baseclass.ZRbasePage;

public class CommonUtility extends ZRbasePage{
	//Action Click
	public static void getMyActionClick(WebElement clicker) {
	Actions click = new Actions(driver);
	click.click(clicker).build().perform();
		}
	//JSClick
		public static void getJSEClick(WebElement clicker) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", clicker);
			
		}
		 public static void getMyResults(String Expected,String Actual) {
			 Assert.assertEquals(Expected, Actual);
			 
			 if(Expected.equals(Actual)) {
				 System.out.println("Expected and Actual Match");
			 }else {
				 System.out.println("Expected and Actual doesnt Match");
				 
			 }
			 
		 }
			
		
	

}
