package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class WorkSpace_pageobjects {

	
	@FindBy(id = "testing")
	public static WebElement workspace;
	
	/*
	 * public static WebElement workspace(WebDriver driver) { return
	 * driver.findElement(By.id("testing")); }
	 */
	
}
