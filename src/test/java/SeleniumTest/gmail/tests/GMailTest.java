package SeleniumTest.gmail.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumTest.CommonTest;
import SeleniumTest.gmail.pages.LoginPage;
import SeleniumTest.gmail.pages.MainPage;

public class GMailTest extends CommonTest{
	private LoginPage loginPage;
	private MainPage mainPage;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\eclipse-workspace\\SeleniumTest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail");
	}
	
	@Test
	public void gmailAccountTest() {
		loginPage= new LoginPage(driver);
		waitVisible(loginPage.getSignIn(), driver);
		loginPage.clickSignIn();
		waitVisible(loginPage.getMailElement(), driver);
		loginPage.setMail("seleniumpladema");
		loginPage.clickIdNext();
		waitVisible(loginPage.getPasswordElement(), driver);
		loginPage.setPassword("Pladema2018");
		loginPage.clickPasswordNext();		
		
		mainPage = new MainPage(driver);
		waitVisible(mainPage.getEmailIcon(), driver);
		
		Assert.assertTrue(mainPage.loginSuccess(),"Login Failed");
	}
	
	@Test(dependsOnMethods = { "gmailAccountTest" })
	public void failedLoginTest() {
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
