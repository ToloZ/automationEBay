package SeleniumTest.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	WebDriver driver;

	@FindBy(css="a[href*='SignOut']")
	WebElement emailIcon;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean loginSuccess() {
		return (emailIcon.isDisplayed());
	}
	
	public WebElement getEmailIcon() {
		return emailIcon;
	}
	
}
