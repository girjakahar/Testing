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
import pageobject.CloudPillow;
import pageobject.Header;
import pageobject.ProductDetails;

public class DefaultCloudPillowProduct extends CrossBrowserBase {
	
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(DefaultCloudPillowProduct.class);
	
	    @Test
		public void defaultCloudPillowAddToCart() throws Exception
		{
		    driver.get(prop.getProperty("url"));
	    	//driver.get("https://sleepycat.in/");
	    	log.info("Website opened Successfully");
				  
		   wait = new WebDriverWait(driver, 10);		    	   
	       //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	       ProductDetails productdetail = new ProductDetails(driver);
		   wait.until(ExpectedConditions.visibilityOf(productdetail.crossIconOfoffer()));
	       //Thread.sleep(3000);
		   productdetail.closeoffer();
		   log.info("Closing the offer modal");
           
		   Thread.sleep(2000);
		   CartSlider cart = new CartSlider(driver);
		   Header websiteheader = new Header(driver);   
		   websiteheader.cloudPillowProduct();
		   log.info("Cloud Pillow Product details page is opened");
		   
			/*
			 * Thread.sleep(1000); productdetail.closeoffer();
			 * log.info("Closing the offer modal");
			 */
		   //wait.until(ExpectedConditions.visibilityOf(productdetail.crossIconOfoffer()));
		   productdetail.closeoffer();
		   log.info("Closing the offer modal");
		   
	       Thread.sleep(2000);
		   CloudPillow cloudPillowproduct = new CloudPillow(driver);
		   //productdetail.defaultAddToCart();
		   //log.info("Clicked on add to cart button");
		   
		   //Thread.sleep(2000);
		   //wait.until(ExpectedConditions.visibilityOf(cart.standardCategoryCloudPillowPackOfOneProductAddedInCart()));
		   boolean productname = cart.standardCategoryCloudPillowPackOfOneProductAddedInCart().isDisplayed();
		   		
			if(productname) 
			{
				log.info("Standard category Cloud pillow pack of one product is added in cart");
			}else
			{
				log.info("Standard category Cloud pillow pack of one product is Not added in cart");
			}	
		}
	 
		/*
		 * @AfterTest public void closeDriver() throws IOException { driver.quit();
		 * log.info("Driver is closed"); }
		 */

}
