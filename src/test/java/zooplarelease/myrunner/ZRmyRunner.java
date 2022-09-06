package zooplarelease.myrunner;

//import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
plugin = {"pretty","json:target/cucumber.json"},
features = "./Features",
glue = {"zooplarelease.stepdefinition"},
//dryRun = false,
// = true,
tags = "@Sanity")

public class ZRmyRunner extends AbstractTestNGCucumberTests{

}
