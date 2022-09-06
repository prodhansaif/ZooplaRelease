package zooplarelease.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import zooplarelease.baseclass.ZRbasePage;
import zooplarelease.elementpage.ZRloginElementsPage;
import zooplarelease.generic.CommonUtility;

public class LoginTest extends ZRbasePage {
	ZRloginElementsPage pf;
	
	@Given("User able to open any browser")
	public void user_able_to_open_any_browser() {
		logger.info("User able to open any browser");
		ZRbasePage.initializations();
		pf = new ZRloginElementsPage();
	    
	}
	@Given("User able to enter {string} URL")
	public void user_able_to_enter_url(String URL) {
		logger.info("User able to enter {string} URL");
		driver.get(URL);
	   
	}
	@When("User able to click on the Sign-in button")
	public void user_able_to_click_on_the_sign_in_button() {
		logger.info("User able to click on the Sign-in button");
		pf.getSignBTN().click();
	   
	}
	@When("User able to enter userName")
	public void user_able_to_enter_user_name() {
		logger.info("User able to enter userName");
	//	pf.getEnterUserName().sendKeys("prodhansaif@yahoo.com");
		pf.getUserNameAndPwd(prop.getProperty("userName"),prop.getProperty("pwd") );
	   
	}
	@When("User able to enter the password")
	public void user_able_to_enter_the_password() {
		logger.info("User able to enter the password");
	  // pf.getEnterPwd().sendKeys("saifuL12");
	}
	@When("User able to click on Login button")
	public void user_able_to_click_on_login_button() {
		logger.info("User able to click on Login button");
		pf.getLoginBTN().click();
	 
	}
	@Then("User able to verify information as {string} on the grid")
	public void user_able_to_verify_information_as_on_the_grid(String text) {
		logger.info("User able to verify information as {string} on the grid");
		
		CommonUtility.getMyResults(text, pf.getMyTextMessage().getText());
	}
}
