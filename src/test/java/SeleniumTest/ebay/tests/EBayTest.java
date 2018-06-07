package SeleniumTest.ebay.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumTest.CommonTest;
import SeleniumTest.ebay.pages.EBayMainPage;
import SeleniumTest.ebay.pages.ProductPage;
import SeleniumTest.ebay.pages.ResultPage;

public class EBayTest extends CommonTest{
	private EBayMainPage eBayMainPage;
	private ResultPage resultPage;
	private ProductPage productPage;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\eclipse-workspace\\SeleniumTest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
	}
	
	@Test
	public void ebayTest() throws Exception {
		eBayMainPage = new EBayMainPage(driver);
		eBayMainPage.setInputSearch("Electric Guitar");
		
		resultPage = new ResultPage(driver);
		//waitVisible(resultPage.getResultAtIndex(1), driver);
		resultPage.clickElementResultAtIndex(1);
		
		productPage = new ProductPage(driver);
		System.out.println("Price: " + productPage.getProductPrice());
	}
}
