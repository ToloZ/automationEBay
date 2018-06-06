package SeleniumTest.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(css="input[type='email']")
	WebElement inputEmail;
	
	@FindBy(css="#identifierNext")
	WebElement idNext;	
	
	@FindBy(css="input[type='password']")
	WebElement inputPass;
	
	@FindBy(css="#passwordNext")
	WebElement passNext;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickIdNext() {
		idNext.click();
	}
	public void clickPasswordNext() {
		passNext.click();
	}
	
	public void setMail(String text) {
		inputEmail.sendKeys(text);
	}
	
	public void setPassword(String text) {
		inputPass.sendKeys(text);
	}
	
	public WebElement getPasswordElement() {
		return inputPass;
	}
	
	public WebElement getMailElement() {
		return inputEmail;
	}
}
