package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.security.Password;

public class Signup {
	
	@FindBy(id="firstname")
	WebElement Firstnameopt;
	@FindBy(id="lastname")
	WebElement Lastname;
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="password")
	WebElement psswrd;
	@FindBy(id="ppaFormSbtBtn")
	WebElement signup;
	public WebDriver driver;
	
	public Signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Firstnameiption(String name) {
		Firstnameopt.sendKeys(name);
	}
	public void lastname(String Is) {
		Lastname.sendKeys(Is);
	}
	public void email(String ids) {
		Email.sendKeys(ids);
	}
	public void password(String psw) {
		password.sendKeys(psw);
	}
	public void signupbutton() {
		signup.click();
	}
	

}
