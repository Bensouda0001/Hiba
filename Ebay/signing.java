package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signing {
	
	@FindBy(linkText="create an account")
	WebElement sign;
	public WebDriver driver;
	
	public signing(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createanacount() {
	

}
}