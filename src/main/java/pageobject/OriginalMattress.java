package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OriginalMattress {
	
	static RemoteWebDriver driver;
	
	 public OriginalMattress(RemoteWebDriver driver) throws Exception
	   {
        this.driver = driver; 
        PageFactory.initElements(driver, this);
     }
	
	    // Original mattress size section on product details page
		// Xpath for Dropdown option in original mattress when category is single
	    @FindBy(xpath = "//ul[@class='original']//li[@data-sku='SC-ORIG-S-72x30x6']")
	    private WebElement SingleOriginal72x30x6;
		
		@FindBy(xpath = "//ul[@class='original']//li[@data-sku='SC-ORIG-S-72x36x6']")
	    private WebElement SingleOriginal72x36x6;
		
		@FindBy(xpath = "//ul[@class='original']//li[@data-sku='SC-ORIG-S-75x36x6']")
	    private WebElement SingleOriginal75x36x6;
		
		@FindBy(xpath = "//ul[@class='original']//li[@data-sku='SC-ORIG-S-78x36x6']")
	    private WebElement SingleOriginal78x36x6;

		// Webelement for Dropdown option in original mattress when category is single
		public WebElement singleOriginal75x36x6() {
			return SingleOriginal75x36x6;
		}

		public WebElement singleOriginal78x36x6() {
			return SingleOriginal78x36x6;
		}
		
		// Original mattress size section on product details page when Double category is selected
	    // Drop down option when Inch,cm or feet is selected in original mattress for double category
		@FindBy(xpath = "//ul[@class='original']//li[@data-sku='SC-ORIG-D-75x48x6']")
	    private WebElement DoubleOriginal75x48x6;
		//Above Xpath can also be used when cm or feet is selected as dimension for 190 x 121 x 15 cm and 6.25' x 4' x 0.5' feet
		
		@FindBy(xpath = "//ul[@class='original']//li[@data-sku='SC-ORIG-D-78x48x6']")
	    private WebElement DoubleOriginal78x48x6;
		//Above xpath can also be used when cm or feet is selected as dimension for 198 x 121 x 15 cm and 6.5' x 4' x 0.5' feet

		// Webelement for Drop down option when Inch,cm or feet is selected in original mattress for double category
		public WebElement doubleOriginal75x48x6() {
			return DoubleOriginal75x48x6;
		}

		public WebElement doubleOriginal78x48x6() {
			return DoubleOriginal78x48x6;
		}
		
		/*
		 * //Product added in cart XPath
		 * 
		 * @FindBy(xpath =
		 * "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-S-72x30x6']")
		 * private WebElement ProductAddedInCart;
		 * 
		 * // Webelement for Product added in cart XPath public WebElement
		 * productAddedInCart() { return ProductAddedInCart; }
		 */
		
		/*
		 * //Product added in cart XPath
		 * 
		 * @FindBy(xpath =
		 * "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-S-78x36x6']")
		 * private WebElement SingleCategory78x36x6ProductAddedInCart;
		 * 
		 * // Webelement for Product added in cart XPath public WebElement
		 * singleCategory78x36x6ProductAddedInCart() { return
		 * SingleCategory78x36x6ProductAddedInCart; }
		 */
		
		//Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-Q-75x60x6']")
	    private WebElement CustomCategoryProductAddedInCart;

		// Webelement for Product added in cart XPath
		public WebElement customCategoryProductAddedInCart() {
			return CustomCategoryProductAddedInCart;
		}
		
		
		public void addToCart() {
	        //WebElement add1 = driver.findElementByXPath("(//button[@class='single_add_to_cart_button btn-block alt'])[2]");
			WebElement add1 = driver.findElementByXPath("//button[@class='single_add_to_cart_button btn-block alt']");
	        Actions cart = new Actions(driver);
			cart.moveToElement(add1).click(add1).build().perform();
		}

}
