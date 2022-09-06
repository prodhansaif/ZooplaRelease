package zooplarelease.elementpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*; //CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import zooplarelease.baseclass.ZRbasePage;

public class ZRloginElementsPage extends ZRbasePage{

	public ZRloginElementsPage() {
		PageFactory.initElements(driver, this);
	}

@FindBy (xpath = "(//*[@class='c-cayTRU'])[1]")   //UserName
@CacheLookup
private WebElement userName;

public WebElement getEnterUserName() {
	return userName;
}
	
@FindBy (xpath = "//*[@name='password']")  //UserPWD
@CacheLookup
private WebElement enterPwd;

public WebElement getEnterPwd() {
	return enterPwd;
}

@FindBy (xpath = "//*[@id=\"__next\"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")  //SignINButton  "(//*[@id="__next"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a)"
@CacheLookup
private WebElement SignBTN;               //(By.linkText("Sign in")).click();

public WebElement getSignBTN() {
	return SignBTN;
}	

public void getUserNameAndPwd(String uName, String pwd) {  //for config properties
	ZRloginElementsPage obj= new ZRloginElementsPage();
	obj.getEnterUserName().sendKeys(uName);
	obj.getEnterPwd().sendKeys(pwd);
}

@FindBy (xpath = "(//*[contains(@class,'klmMZv ')])[4]")  //LoginButton
@CacheLookup
private WebElement LoginBTN;

public WebElement getLoginBTN() {
	return LoginBTN;
}

@FindBy (xpath = "//*[text()='Welcome back to your account']") //getText
@CacheLookup
private WebElement MyTextMessage;

public WebElement getMyTextMessage() {
	return MyTextMessage;

}

@FindBy (xpath ="//*[text()='Sign out']") //signOUT
@CacheLookup
private WebElement MySignOut;

public WebElement getMySignOut() {
	return MySignOut;
}
}
