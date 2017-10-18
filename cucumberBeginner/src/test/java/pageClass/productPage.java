package pageClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;
import stepDefs.base;


public class productPage extends base
{
	
	WebDriver driver;
	static WebDriverWait wait;
	static boolean b;
	 
	 
	 public productPage(WebDriver driver)
	 {
		// TODO Auto-generated constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 wait=new WebDriverWait(driver, 40);

	 }
	 
	
	 
	 @FindBy(xpath="//a[text()='Product Category']")
	 WebElement productCat;
	 
	 
	@FindBy(xpath="//a[text()='Accessories']")
	WebElement accesories;
	
	@FindBy(xpath="//a[text()='iMacs']")
	 WebElement iMacs;
	
	@FindBy(xpath="//a[text()='iPads']")
	 WebElement iPads;
	
	
	@FindBy(xpath="//h1[text()='Accessories']")
	WebElement accesoriesDetail;
	
	@FindBy(xpath="//h1[text()='iMacs']")
	 WebElement iMacsDetail;
	
	@FindBy(xpath="//h1[text()='iPads']")
	 WebElement iPadsDetail;
	
	
	public boolean isDetailDisplayed(String element)
	{
		String detail=element;
		switch (detail)
		{
		
		case "Accessories":
			 if(element.equalsIgnoreCase(accesoriesDetail.getText()))
		 	 {	 b=true;
		 		 System.out.println("loop 1");
		 	 }
			break;
			
		case "iMacs":
			 if(element.equalsIgnoreCase(iMacsDetail.getText()))
		 	 {	 b=true;
		 		 System.out.println("loop 2");
		 	 }
			break;
			
		case "iPads":
			 if(element.equalsIgnoreCase(iPadsDetail.getText()))
		 	 {	 b=true;
		 		 System.out.println("loop 3");
		 	 }
			break;	

		default:
			b=false;
			break;
		}
		
			
		 
		
		 
		 return b;
				
	}
	
	public void hover(String element) throws Exception
	{
		System.out.println("Inside Hover "+productCat.getText());
		hover(productCat, driver);
		/*if(element.equalsIgnoreCase(productCat.getText()))
		{
			hover(productCat);
		}*/
	}

	public void click(String item)
	{
		if(item.equalsIgnoreCase(accesories.getText()))
		{	
			click(accesories,driver);
		}
		else if(item.equalsIgnoreCase(iMacs.getText()))
		{
			click(iMacs,driver);
		}
		else if(item.equalsIgnoreCase(iPads.getText()))
		{
			click(iPads,driver);
		}
		
		else
		{
			Assert.fail("Link not present to click");
		}
		
	}

	
	
	 
	 
}
