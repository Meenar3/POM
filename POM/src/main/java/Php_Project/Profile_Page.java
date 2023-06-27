package Php_Project;

//import PageObjects.Login_PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_Objects.Profile_PageObjects;
import Page_Objects.WorkSpace_pageobjects;
import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * POM is used to segregate the page objects and its functionality in separate classes
 * used to reduce the code
 * 
 * two types: with findby 
 *            without findby (if only the webelement has id / name)
 */

public class Profile_Page {

	@Test
	public void loginTC() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, Profile_PageObjects.class); //init method is a static hence static methods can be called without creating objects
		
		Profile_PageObjects.email.sendKeys("mmm@gmail.com"); //pagefactory using name attribute value
		Profile_PageObjects.password.sendKeys("mmm@gmail.com");
		Profile_PageObjects.submit.click();
		
		PageFactory.initElements(driver, WorkSpace_pageobjects.class);
		WorkSpace_pageobjects.workspace.click();
		
//-----------------normal method-------------------------------------------
		//Profile_PageObjects ppo = new Profile_PageObjects();
		/*Profile_PageObjects.Username(driver).sendKeys("mmm@gmail.com");
		Profile_PageObjects.Password(driver).sendKeys("mmm@gmail.com");
		Profile_PageObjects.submit(driver).click();
		
		WorkSpace_pageobjects.workspace(driver).click();	*/	
		
		
		
	}
	
}
