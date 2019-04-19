package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	final WebDriver driver;
	 
	 public SearchPage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 @FindBy(how = How.XPATH, using = "//input[@title='Search for products, brands and more']") 
	 private WebElement searchtextbox;
	 
	 @FindBy(how = How.XPATH, using = "//button[@class='vh79eN']") 
	 private WebElement clickonsearch;
	 
	 public void searchinflipkart(String searchTerm)
	 {
		 searchtextbox.isDisplayed();
		 searchtextbox.sendKeys(searchTerm);
		 clickonsearch.click();
		 
		 
	 }
	
}
