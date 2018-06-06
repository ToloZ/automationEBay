package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class CommonTest {
	
	protected WebDriver driver;
	
	protected void waitVisible(WebElement element , WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	protected void waitInvisible(WebElement element , WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	@AfterMethod()
	public void destroy() {
		if (driver != null) {
			driver.quit();
		}
	}

}
