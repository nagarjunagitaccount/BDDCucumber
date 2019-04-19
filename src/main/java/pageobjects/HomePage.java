package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	final WebDriver driver;
	 
	 public HomePage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 @FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _29YdH8']") 
	 private WebElement cancel_loginpop;
	
	 
	 	 
	 public void navigateTo_HomePage() {
	  cancel_loginpop.click();
	 }
}
