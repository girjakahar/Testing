package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudPillow {
	static RemoteWebDriver driver;
	
	 public CloudPillow(RemoteWebDriver driver) throws Exception
	   {
      this.driver = driver; 
      PageFactory.initElements(driver, this);
     }
	 
	//Xpath for Cloud pillow Standard,President Category option on product details page
	@FindBy(xpath = "//li[text()='President']")
   private WebElement PresidentCategory;
		
   @FindBy(xpath = "//li[text()='Standard']")
	private WebElement StandardCategory;
		
   // Webelement for Cloud pillow President Category option on product details page
	public WebElement presidentCategory() {
		return PresidentCategory;
	}
		
	public WebElement standardCategory() {
		return StandardCategory;
	}
	
	//Xpath for different Pack size on product details page of Cloud Pillow
	@FindBy(xpath = "//div[@class='attr attr_Pack ']//li[@data-value='pillow-1']")
   private WebElement OnePillowPackSize;
		
   @FindBy(xpath = "//div[@class='attr attr_Pack ']//li[@data-value='pillow-2']")
	private WebElement TwoPillowPackSize;
   
   @FindBy(xpath = "//div[@class='attr attr_Pack ']//li[@data-value='pillow-4']")
   private WebElement FourPillowPackSize;
	
	// Webelement for different Pack size on product details page of Cloud Pillow
	public WebElement onePillowPackSize() {
		return OnePillowPackSize;
	}
	
	public WebElement twoPillowPackSize() {
		return TwoPillowPackSize;
	}
	
	public WebElement fourPillowPackSize() {
		return FourPillowPackSize;
	}
	 
	/*
	 * //Product added in cart XPath
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLPILW-S-27x18']")
	 * private WebElement CloudPillowProductAddedInCart;
	 * 
	 * // Webelement for Product added in cart XPath public WebElement
	 * cloudPillowProductAddedInCart() { return CloudPillowProductAddedInCart; }
	 * 
	 * //Product added in cart XPath
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLPILWSET2-P-32x20']")
	 * private WebElement CloudPillowSetOfTwoProductAddedInCart;
	 * 
	 * // Webelement for Product added in cart XPath public WebElement
	 * cloudPillowSetOfTwoProductAddedInCart() { return
	 * CloudPillowSetOfTwoProductAddedInCart; }
	 */
	 
	public void addToCart() {
			//List<WebElement> add = driver.findElements(By.xpath("(//button[@class='single_add_to_cart_button btn-block alt'])[2]"));
			//WebElement add1 = driver.findElementByXPath("(//button[@class='single_add_to_cart_button btn-block alt'])[2]");
		WebElement add1 = driver.findElementByXPath("//button[@class='single_add_to_cart_button btn-block alt']");
		Actions cart = new Actions(driver);
			cart.moveToElement(add1).click(add1).build().perform();
		}

}
