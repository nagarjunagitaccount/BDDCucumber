package managers;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePage;
import pageobjects.SearchPage;

public class PageObjectManager {

	private WebDriver driver;

	private SearchPage search;

	private HomePage home;
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage(){

		return (home == null) ? home = new HomePage(driver) : home;

	}
	public SearchPage getSearchPage(){

		return (search == null) ? search = new SearchPage(driver) : search;

	}

	
	
	
	
	
}
