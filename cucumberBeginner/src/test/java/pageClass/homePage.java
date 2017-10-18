package pageClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage
{
	
	 WebDriver driver;
	 WebDriverWait wait;
	 static boolean b;
	
	 
	 
	 public homePage(WebDriver driver)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 wait= new WebDriverWait(this.driver, 40);
	 }
	 
	 @FindBy(xpath="//a[@title='home']")
	 WebElement homePage;
	 
	 
	 @FindBy(xpath="//a[text()='Home']")
	 WebElement homeLink;
	 
	 @FindBy(xpath="//a[text()='Product Category']")
	 WebElement productCategory;
	 
	 @FindBy(xpath="//a[text()='All Product']")
	 WebElement allProduct;
	 
	 @FindBy(xpath="//a[@title='Checkout']")
	 WebElement checkoutLink;

	 @FindBy(xpath="//a[@title='My Account']")
	 WebElement checkoutmyAccoutLink;

	 public void waitForVisibilityofElement(WebElement element)
	 {
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }

	 public String checkHomePage()
	 {
		 String home;
		try
		{
			 home=homePage.getAttribute("title");
			System.out.println("User is at "+home);
			
		}
		catch (Exception e) 
		{
			home=null;
			System.out.println(e.getMessage());	
		}
		
		return home;
	 }

	 public boolean isElementPresent(String links)
	 {
		 
		 if(links.equalsIgnoreCase(homeLink.getText())||links.equalsIgnoreCase(productCategory.getText())
				 ||links.equalsIgnoreCase(allProduct.getText())
				 ||links.equalsIgnoreCase(checkoutLink.getText())
			 	 ||links.equalsIgnoreCase(checkoutmyAccoutLink.getText()))
			 	 {
			 		 b=true;
			 	 }
			 	 else
			 	 {
			 		 b=false;
			 	 }
		return b;
		 
	 }

	 



}
