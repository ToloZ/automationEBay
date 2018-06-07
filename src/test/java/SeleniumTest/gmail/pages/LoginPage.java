package SeleniumTest.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(css="a[data-g-label='Sign in']")
	WebElement signIn;
	
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

	public boolean isAlertaDisplayed() {
		return driver.findElement(By.cssSelector("[data-allow-at-sign] [aria-atomic]")).isDisplayed();
	}
	
	public boolean isSignInDisplayed() {
		return signIn.isDisplayed();
	}
	
	public void clickSignIn() {
		signIn.click();
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
	
	public WebElement getSignIn() { 
		return signIn;
	}

	public WebElement getAlerta() {
		return driver.findElement(By.cssSelector("[data-allow-at-sign] [aria-atomic]"));
	}
}
