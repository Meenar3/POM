package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Profile_PageObjects {
	
	public static WebElement email; //without findby this is applicable only when the objects has id/name
	//@FindBy (how = How.NAME, using = "email") //method1
	//public static WebElement username
	
	@FindBy (name = "password")  //method2
	public static WebElement password;
	
	@FindBy (xpath = "/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")
	public static WebElement submit;
	
	
	
	
//----------------normal method----------------------------------	
	/*
	 * public static WebElement Username(WebDriver driver) { return
	 * driver.findElement(By.name("email")); }
	 * 
	 * public static WebElement Password(WebDriver driver) { return
	 * driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")); }
	 */
	
}
