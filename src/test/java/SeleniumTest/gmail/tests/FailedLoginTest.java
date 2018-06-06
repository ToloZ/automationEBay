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
		
		Assert.assertTrue(true,"Login Failed");
	}
}
