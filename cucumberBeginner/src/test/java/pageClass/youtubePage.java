package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefs.base;


public class youtubePage extends base
{
	
	WebDriver driver;
	static WebDriverWait wait;
	static boolean b;
	 
	 
	 public youtubePage(WebDriver driver)
	 {
		// TODO Auto-generated constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 wait=new WebDriverWait(driver, 40);

	 }
	 
	
	 
	 @FindBy(xpath="//h1[text()='Home']")
	 WebElement icon_utubeHome;
	 
	 
	@FindBy(xpath="//a[contains(@href,'trending')]")
	WebElement lbl_trendingIcon;
	
	@FindBy(xpath="//a[@aria-label='Trending']")  //aria-selected="true"
	 WebElement icon_trendingIcon;
	
	@FindBy(xpath="//a[@aria-label='Account']")
	 WebElement lbl_accountIcon;
	
	
	@FindBy(xpath="//h1[text()='Account']")
	WebElement icon_accountIcon;
	
	@FindBy(xpath="//button[@aria-label='Settings']")
	 WebElement optionImg;
	
	@FindBy(xpath="//android.widget.Button[@text='Sign In']")
	 WebElement signInOption;
	
	@FindBy(xpath="//android.widget.Button[@text='Help']")
	 WebElement helpOption;
	
	@FindBy(xpath="//android.widget.Button[@text='Desktop']")
	 WebElement desktopOption;
	
	@FindBy(xpath="//android.widget.Button[@text='Cancel']")
	 WebElement canclOption;
	
	public boolean verifyPage(String pageNm)
	{	
		switch (pageNm.toUpperCase()) {
		
		case "YOUTUBE":
			 b=icon_utubeHome.isDisplayed();
			 break;
			 
		case "":
			
			break;

		default:
			return false;
		}
		return b;
	
		
	}

	
	
	 
	 
}
