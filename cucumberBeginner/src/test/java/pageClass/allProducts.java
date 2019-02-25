package pageClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.utilityMethods;

public class allProducts
{
	
	 WebDriver driver;
	  WebDriverWait wait;
	 
	 public allProducts(WebDriver driver)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 wait= new WebDriverWait(driver, 40);
	 }
	 
	 @FindBy(xpath="//a[text()='All Product']")
	 WebElement allProduct;
	 
	 
	@FindBy(xpath="(//input[@value='Add To Cart'])[1]")
	WebElement add2Kart_btn;
	
	@FindBy(xpath="//a[@title='Checkout']")
	 WebElement checkoutLink;
	
	
	public void click(String item) throws Exception
	{
		
		String detail=item;
		 
		 switch (detail) {
		case "All Products":
			wait.until(ExpectedConditions.visibilityOf(allProduct)).click();
			System.out.println("All Product Link Clicked..");
			break;
			
		case "Add to cart":
			wait.until(ExpectedConditions.visibilityOf(add2Kart_btn)).click();
			System.out.println("Add to Kart button Clicked..");
			utilityMethods.waitFor(10);
			break;
		case "Checkout":
			wait.until(ExpectedConditions.visibilityOf(checkoutLink)).click();
			System.out.println("CheckOut Link Clicked..");
			utilityMethods.waitFor(10);
			break;
			
			
		default:
			Assert.fail(detail+" is not present...");
			break;
		
		
		 }		
	
	}
	
	
	 
}
