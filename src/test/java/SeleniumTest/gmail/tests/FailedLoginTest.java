package SeleniumTest.gmail.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumTest.CommonTest;
import SeleniumTest.gmail.pages.LoginPage;

public class FailedLoginTest extends CommonTest{
	private LoginPage loginPage;
	
	@BeforeMethod
	private void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\eclipse-workspace\\SeleniumTest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail");
	}

	@Test
	public void gmailTest() {
		loginPage= new LoginPage(driver);
		waitVisible(loginPage.getSignIn(), driver);
		loginPage.clickSignIn();
		waitVisible(loginPage.getMailElement(), driver);
		loginPage.setMail("seleniumplademaaaaaaa");
		loginPage.clickIdNext();
		waitVisible(loginPage.getAlerta(), driver);
		Assert.assertFalse(loginPage.isAlertaDisplayed(),"Login Failed");
	}
}
