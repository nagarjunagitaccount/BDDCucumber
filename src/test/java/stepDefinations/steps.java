package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataprovider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageobjects.HomePage;
import pageobjects.SearchPage;


public class steps {
	HomePage home;
	SearchPage search;
	static WebDriver driver;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
	WebDriverManager webDriverManager;
	
@Given("^user is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
	
	webDriverManager = new WebDriverManager();
	driver = webDriverManager.getDriver();
    driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    pageObjectManager = new PageObjectManager(driver);
    home = pageObjectManager.getHomePage();
    home.navigateTo_HomePage();
 
  }

@Then("^user eneters SearchTerm as \"([^\"]*)\"$")
public void user_searhes_for(String searchterm) throws Throwable {
	  pageObjectManager = new PageObjectManager(driver);
	  search = pageObjectManager.getSearchPage();
	  search.searchinflipkart(searchterm);
	  webDriverManager.closeDriver();
}


}
