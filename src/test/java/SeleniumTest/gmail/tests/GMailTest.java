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
	private void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\eclipse-workspace\\SeleniumTest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
	}
	
	@Test
	public void gmailTest() {
		loginPage= new LoginPage(driver);
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
}
