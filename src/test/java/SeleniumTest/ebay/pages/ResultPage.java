package SeleniumTest.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
	WebDriver driver;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickElementResultAtIndex(int i) {
		try {
			driver.findElement(By.cssSelector(".srp-results > li:nth-child("+(i+1)+") .s-item__link")).click();
		} catch (NoSuchElementException e) {
			driver.findElement(By.cssSelector("#ListViewInner > li:nth-child("+i+") .vip")).click();
		}			
	}
}
