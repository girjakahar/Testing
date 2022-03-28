package crossbrowseraddtocart;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.CrossBrowserBase;
import pageobject.CartSlider;
import pageobject.Header;
import pageobject.OriginalMattress;
import pageobject.ProductDetails;

//@Test(groups= {"SanityTest","RegressionTest"})

public class DefaultOriginalMattressProductCrossbrowser extends CrossBrowserBase {
	
	//static RemoteWebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(DefaultOriginalMattressProductCrossbrowser.class);

	/*
	 * @BeforeTest public void startingDriver() throws IOException {
	 * driver=initializeChrome(); log.info("Starting driver");
	 * driver.get(prop.getProperty("url")); log.info("Website opened Successfully");
	 * }
	 */
	 
	
    @Test
	public void defaultOriginalMattessAddToCart() throws Exception
	{
    	//driver.get(prop.getProperty("url"));
    	driver.get("https://sleepycat.in/");
    	log.info("Website opened Successfully");
    	
       wait = new WebDriverWait(driver, 10);		    	   
      //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
      ProductDetails productdetail = new ProductDetails(driver);
	  wait.until(ExpectedConditions.visibilityOf(productdetail.crossIconOfoffer()));
      //Thread.sleep(3000);
      productdetail.closeoffer();
      log.info("Closing the offer modal");
	  
	   CartSlider cart = new CartSlider(driver);
      Header websiteheader = new Header(driver);
      websiteheader.originalMattressProduct();
	  log.info("Original mattress product details page is opened");
	  
		/*
		 * Thread.sleep(1000); productdetail.closeoffer();
		 * log.info("Closing the offer modal");
		 */
  	   
	   OriginalMattress originalmattressproduct = new OriginalMattress(driver);
	   originalmattressproduct.addToCart();
	   log.info("Clicked on add to cart button");
	   
		//Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(cart.singleCategoryOriginalMattress72x30x6ProductAddedInCart()));
		boolean productname = cart.singleCategoryOriginalMattress72x30x6ProductAddedInCart().isDisplayed();

		if(productname) 
		{
			log.info("Single category Original mattress Product is added in cart");
		}else
		{
			log.info("Single category Original mattress Product is not added in cart");
		}	
	   
	} 
	
	/*
	 * @AfterTest public void closeDriver() throws IOException { driver.quit();
	 * log.info("Driver is closed");
	 * 
	 * }
	 */

}
