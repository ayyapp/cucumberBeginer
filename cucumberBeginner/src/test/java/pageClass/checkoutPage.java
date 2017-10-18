package pageClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkoutPage
{
	
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 
	 public checkoutPage(WebDriver driver)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 wait= new WebDriverWait(driver, 40);
	 }
	 
	 @FindBy(xpath="//th[text()='Product:']/ancestor::tr[1]/following-sibling::tr[1]//img[1]")
	 WebElement productNm;
	 
	 
	@FindBy(xpath="//span[text()='Continue']")
	WebElement continue_btn;
	
	@FindBy(xpath="//a[@title='Checkout']")
	 WebElement checkoutLink;
	
	@FindBy(xpath="//h2[text()='Calculate Shipping Price']")
	WebElement shippingPage;
	
	@FindBy(xpath="//input[@title='billingfirstname']")
	WebElement firstNm;
	
	@FindBy(xpath="//input[@title='billinglastname']")
	WebElement lastNm;
	
	@FindBy(xpath="//textarea[@title='billingaddress']")
	WebElement address;
	
	@FindBy(xpath="//input[@title='billingcity']")
	WebElement billingCity;
	
	@FindBy(xpath=".//*[@id='shippingSameBilling']")
	WebElement sameBillingCheckBox;
	
	@FindBy(xpath="//input[@value='Purchase']")
	WebElement purchaseBtn;
	
	
	
	public String getpageDetail(String page)
	{
		String pageNm=null;
		 if(page.equalsIgnoreCase("Checkout"))
			{
				pageNm=shippingPage.getText();
			}
		 return pageNm;
	}
	
	public String itemNm()
	 {
		 return productNm.getAttribute("title");
	 }
	 
	 public void click(String element)
	 {
		 String detail=element;
		 
		 switch (detail) {
		case "Checkout":
			wait.until(ExpectedConditions.visibilityOf(checkoutLink)).click();
			System.out.println("Checkout Link Clicked...");
			break;
			
		case "Continue":
			wait.until(ExpectedConditions.visibilityOf(continue_btn)).click();
			System.out.println("Continue Button Clicked...");
			break;	
		case "same as billing address":
			wait.until(ExpectedConditions.visibilityOf(sameBillingCheckBox)).click();
			System.out.println("Same Billing Address Checkbox clicked...");
			break;
			
		case "purchase":
			wait.until(ExpectedConditions.visibilityOf(purchaseBtn)).click();
			System.out.println("Purchase Button Clicked...");
			break;
			
		default:
			Assert.fail(detail+" is not present...");
			break;
		}
	 }
	 
	 public void enter(String input)
	 {
		 if(input.contains(firstNm.getAttribute("title")))
			{
			 firstNm.sendKeys(input);
			}
		 else  if(input.contains(lastNm.getAttribute("title")))
			{
			 lastNm.sendKeys(input);
			}
		 else  if(input.contains(address.getAttribute("title")))
			{
			 address.sendKeys(input);
			}
		 else  if(input.contains(billingCity.getAttribute("title")))
			{
			 billingCity.sendKeys(input);
			}
		 else 
		 {
			 Assert.fail(input+ "is not present in checkout page");
		 }
	 }

	 public WebElement getElement(String element)
	 {
		 WebElement ele=null;
		 if(element.contains("First Name"))
			{
			 ele=firstNm;
			}
		 else  if(element.contains("Last Name"))
			{
			 ele=lastNm;
			}
		 else  if(element.contains("Address"))
			{
			 ele=address;
			}
		 else  if(element.contains("City"))
			{
			 ele=billingCity;
			}
		 else 
		 {
			 Assert.fail(element+ "is not present in checkout page");
		 }
			 
		 return ele;
	}
	 
	 
}
