package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageClass.allProducts;
import pageClass.checkoutPage;
import pageClass.homePage;
import pageClass.productPage;

public class base 
{
	static WebDriver driver;
	static homePage hp;
	static productPage pp;
	static allProducts ap;
	static checkoutPage cp;
	static WebDriverWait wait;
	
	

	public void waitFor(int sec) throws Exception
	{
		Thread.sleep(sec*1000);
	}
	
	public homePage getHomePage(WebDriver driver)
	{
		return hp=new homePage(driver);
		
		
	}
	
	public productPage getproductPage(WebDriver driver)
	{
		return pp=new productPage(driver);
		
	}
	
	public allProducts getallProduct(WebDriver driver)
	{
		return ap=new allProducts(driver);
		
	}
	

	public checkoutPage getCheckoutPage(WebDriver driver)
	{
		return cp=new checkoutPage(driver);
		
	}
	
	public WebDriver getDriver()
	{
		return  driver;
	}
	
	
	


	
	public void hover(WebElement element,WebDriver driver) throws Exception
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		waitFor(5);
		
	}

	public void click(WebElement element,WebDriver driver)
	{
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public boolean isPresent(WebElement element)
	{
		return element.isDisplayed();
	}
	
}
