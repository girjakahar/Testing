package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSlider {

	static RemoteWebDriver driver;

	   // Cross selling products image link xpath in cart slider
	   @FindBy(xpath = "//a[@href='https://sleepycat.in/product/comforter/']//img[@class='img-responsive alsoBuy-image']")
    private WebElement CrossSellingComforterImage;
	   
	   @FindBy(xpath = "//a[@href='https://sleepycat.in/product/pillow-memory-foam-pillow/']//img[@class='img-responsive alsoBuy-image']")
    private WebElement CrossSellingMemoryPillowImage;
	   
	   @FindBy(xpath = "//a[@href='https://sleepycat.in/product/mattress-protector/']//img[@class='img-responsive alsoBuy-image']")
    private WebElement CrossSellingProtectorImage;
	   
	   @FindBy(xpath = "//a[@href='https://sleepycat.in/product/cloud-pillow/']//img[@class='img-responsive alsoBuy-image']")
    private WebElement CrossSellingCloudPillowImage;
	   
	   @FindBy(xpath = "//a[@href='https://sleepycat.in/product/weighted-blanket/']//img[@class='img-responsive alsoBuy-image']")
    private WebElement CrossSellingWeightedBlanketImage;
	   
	   @FindBy(xpath = "//a[@href='https://sleepycat.in/product/pillow-pregnancy-body-pillow/']//img[@class='img-responsive alsoBuy-image']")
    private WebElement CrossSellingCuddlePillowImage;
	   
	   @FindBy(xpath = "//a[@href='https://sleepycat.in/product/pillow-case/']//img[@class='img-responsive alsoBuy-image']")
    private WebElement CrossSellingPillowCaseImage;
		
	    //Web element for Cross selling products image link in cart slider
		public WebElement crossSellingComforterImage() {
			return CrossSellingComforterImage;
		}
		
		public WebElement crossSellingMemoryPillowImage() {
			return CrossSellingMemoryPillowImage;
		}
		
		public WebElement crossSellingProtectorImage() {
			return CrossSellingProtectorImage;
		}
		
		public WebElement crossSellingCloudPillowImage() {
			return CrossSellingCloudPillowImage;
		}
		
		public WebElement crossSellingWeightedBlanketImage() {
			return CrossSellingWeightedBlanketImage;
		}
		
		public WebElement crossSellingCuddlePillowImage() {
			return CrossSellingCuddlePillowImage;
		}
		
		public WebElement crossSellingPillowCaseImage() {
			return CrossSellingPillowCaseImage;
		}
		
		//next and previous icon xpath in cart slider
		 @FindBy(xpath = "//div[@class='cart-cross-sell-section-wrap cross-selling-section']//a[@class='lSNext']")
	     private WebElement NextCrossProduct;
		 
		 @FindBy(xpath = "//div[@class='cart-cross-sell-section-wrap cross-selling-section']//a[@class='lSPrev']")
	     private WebElement PreviousCrossProduct;
    
     
		//next and previous icon webelement in cart slider
     public WebElement nextCrossProduct() {
			return NextCrossProduct;
		}
     
     public WebElement previousCrossProduct() {
			return PreviousCrossProduct;
		}

		//Default Add to cart button xpath for Cross selling products in cart slider
     @FindBy(xpath = "//span[@data-sku='SC-COMF-S-90x60']")
     private WebElement DefaultAddtoCartSingleComforter;
     
     @FindBy(xpath = "//span[@data-sku='SC-PILLOW-S-26x16x4']")
     private WebElement DefaultAddtoCartStandardSetOffOneMemoryFoamPillow;
     
     @FindBy(xpath = "//span[@data-sku='SC-PROT-S-75x36']")
     private WebElement DefaultAddtoCartSingleProtector75x36;
     
     @FindBy(xpath = "//span[@data-sku='SC-CLPILW-S-27x18']")
     private WebElement DefaultAddtoCartStandardPackOfOneCloudPillow;
     
     @FindBy(xpath = "//span[@data-sku='SC-CLWTBLANKET-S-75x50']")
     private WebElement DefaultAddtoCartGreyColorWeightedBlanket;
     
     @FindBy(xpath = "//span[@data-sku='SC-GRBDPILWSET-S-50x19']")
     private WebElement DefaultAddtoCartCuddlePillow;
     
     @FindBy(xpath = "//span[@data-sku='SC-GRPILWCS-P-33x21']")
     private WebElement DefaultAddtoCartCloudPillowCasePackofTwo;
		
		// Webelement for different Add to cart button for products
		public WebElement defaultAddtoCartSingleComforter() {
			return DefaultAddtoCartSingleComforter;
		}
		
		public WebElement defaultAddtoCartStandardSetOffOneMemoryFoamPillow() {
			return DefaultAddtoCartStandardSetOffOneMemoryFoamPillow;
		}
		
		public WebElement defaultAddtoCartSingleProtector75x36() {
			return DefaultAddtoCartSingleProtector75x36;
		}
		
		public WebElement defaultAddtoCartStandardPackOfOneCloudPillow() {
			return DefaultAddtoCartStandardPackOfOneCloudPillow;
		}
		
		public WebElement defaultAddtoCartGreyColorWeightedBlanket() {
			return DefaultAddtoCartGreyColorWeightedBlanket;
		}
		
		public WebElement defaultAddtoCartCuddlePillow() {
			return DefaultAddtoCartCuddlePillow;
		}
		
		public WebElement defaultAddtoCartCloudPillowCasePackofTwo() {
			return DefaultAddtoCartCloudPillowCasePackofTwo;
		}
		       
	
		
		//Xpath for different component after adding any products to cart
		@FindBy(xpath = "//button[@class='close_slider']")
     private WebElement ClosecartSlider;
     
     @FindBy(xpath = "//div[@class='quantity checkout_page_box']//input[@class='plus']")
     private WebElement IncrementQuantity;
     
     @FindBy(xpath = "//div[@class='quantity checkout_page_box']//input[@class='minus']")
     private WebElement DecreseQuantity;
     
     @FindBy(xpath = "//button[@class='product-remove']//i[@class='far fa-trash-alt']")
     private WebElement RemoveProduct;

		// Webelement for different component after adding any products to cart
		public WebElement closecartSlider() {
			return ClosecartSlider;
		}
    
		public WebElement incrementQuantity() {
			return IncrementQuantity;
		}
		
		public WebElement decreseQuantity() {
			return DecreseQuantity;
		}
		
		public WebElement removeProduct() {
			return RemoveProduct;
		}
		
		//Securecheckout button xpath in cart slider 
		@FindBy(xpath = "//button[@id='secure_checkout']")
     private WebElement SecureCheckout;
				
		//Securecheckout button webelement in cart slider 
	    public WebElement secureCheckout() {
			return SecureCheckout;
		}
	    
	  //Xpath for helpguide text link in cart slider 
	  @FindBy(xpath = "//span[@class='sizeChart']")
	  private WebElement MattressHelpGuideLinkText;
	  				
	  //Webelement for helpguide text link in cart slider 
	  public WebElement mattressHelpGuideLinkText() {
	  	    return MattressHelpGuideLinkText;
	  }
	  
	 //Xpath for Mattress helpguide in image 
	  @FindBy(xpath = "//*[@id='measureMattress']//*[contains(@class, 'modal-content')]/img")
	  private WebElement MattressGuideImage;
	  				
	  //Webelement for Mattress helpguide in image 
	  public WebElement mattressGuideImage() {
	  	    return MattressGuideImage;
	  }
	    
	    //Cross selling section for Comforter in cart slider
		//Xpath for category Type field of comforter cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell comforter lslide active']//div[@data-value='Single']")
	    private WebElement CrossSellCartComforterCategoryField;
		
		// Webelement option for category Type field of comforter cross selling product section
		public WebElement crossSellCartComforterCategoryField() {
			return CrossSellCartComforterCategoryField;
		}
			
		//Xpath for Double category of comforter cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell comforter lslide active']//span[text()='Double']")
	    private WebElement CrossSellCartDoubleCategoryComforter;
			
		// Webelement option for Double category of comforter cross selling product section
		public WebElement crossSellCartDoubleCategoryComforter() {
			return CrossSellCartDoubleCategoryComforter;
		}
		
		//Xpath for Color options of Comforter on cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell comforter lslide active']//li[@data-value='coffee']")
	    private WebElement CrossSellCartComforterCoffeeColor;
		
		@FindBy(xpath = "//div[@class='container_cross_sell comforter lslide active']//li[@data-value='pink']")
	    private WebElement CrossSellCartComforterPinkColor;
		
		// Webelement for Color options of Comforter on cross selling product section
		public WebElement crossSellCartComforterCoffeeColor() {
			return CrossSellCartComforterCoffeeColor;
		}
				
		public WebElement crossSellCartComforterPinkColor() {
			return CrossSellCartComforterPinkColor;
		}
		
		//Xpath for Add to cart of Double category pink color comforter cross selling product 
		@FindBy(xpath = "//div[@class='container_cross_sell comforter lslide active']//span[@data-sku='SC-PKCOMF-D-90x100']")
	    private WebElement CrossSellCartDoubleCategoryPinkComforter;
					
		// Webelement option for Add to cart of Double category pink color comforter cross selling product 
		public WebElement crossSellCartDoubleCategoryPinkComforter() {
			return CrossSellCartDoubleCategoryPinkComforter;
		}
		
		//Xpath for Add to cart of Double category Coffee color comforter cross selling product 
		@FindBy(xpath = "//div[@class='container_cross_sell comforter lslide active']//span[@data-sku='SC-CFCOMF-D-90x100']")
	    private WebElement CrossSellCartDoubleCategoryCoffeeComforter;
						
		// Webelement option for Add to cart of Double category Coffee color comforter cross selling product 
		public WebElement crossSellCartDoubleCategoryCoffeeComforter() {
			return CrossSellCartDoubleCategoryCoffeeComforter;
		}
		
		//Memory foam pillow product in cross selling product section in cart slider
		//Xpath for category field for Memory foam pillow
		@FindBy(xpath = "//div[@class='container_cross_sell pillow lslide']//div[@data-value='Standard']")
		private WebElement CrossSellCartMemoryPillowCategoryField;
			
	    // Webelement for category field for Original mattress
		public WebElement crossSellCartMemoryPillowCategoryField() {
			return CrossSellCartMemoryPillowCategoryField;
		}
			
		//Xpath for category options for Memory foam pillow 
		@FindBy(xpath = "//div[@class='container_cross_sell pillow lslide']//li[@data-value='President']")
		private WebElement CrossSellCartMemoryPillowPresidentCategory;
			
	    // Webelement for category options for Memory foam pillow
		public WebElement crossSellCartMemoryPillowPresidentCategory() {
			return CrossSellCartMemoryPillowPresidentCategory;
		}
				
		//Xpath for Pack field for Memory foam pillow 
	    @FindBy(xpath = "//div[@class='container_cross_sell pillow lslide']//div[@data-name='pack']")
		private WebElement CrossSellCartMemoryPillowPackField;
			
	    // Webelement for Pack field for Memory foam pillow
		public WebElement crossSellCartMemoryPillowPackField() {
			return CrossSellCartMemoryPillowPackField;
		}
			
		//Xpath for different Pack options for Memory pillow when President category is selected
	    @FindBy(xpath = "//div[@class='container_cross_sell pillow lslide']//li[@value='pillow-2']")
		private WebElement CrossSellCartMemoryPillowPackOfTwo;
	    
	    @FindBy(xpath = "//div[@class='container_cross_sell pillow lslide']//li[@value='pillow-4']")
		private WebElement CrossSellCartMemoryPillowPackOfFour;
			
	    // Webelement for different Pack options for Memory pillow when President category is selected
		public WebElement crossSellCartMemoryPillowPackOfTwo() {
			return CrossSellCartMemoryPillowPackOfTwo;
		}
		
		public WebElement crossSellCartMemoryPillowPackOfFour() {
			return CrossSellCartMemoryPillowPackOfFour;
		}
		
		//Xpath for Add to cart button for Memory foam when standard category is selected and Pack is four
		@FindBy(xpath = "//span[@data-sku='SC-MFPILWSET4-S-26x16x4']")
 	private WebElement CrossSellCartAddToCartStandardMemoryPillowPackOfFour;
					
     // Webelement for Add to cart button for Memory foam when President category is selected and Pack is two
		public WebElement crossSellCartAddToCartStandardMemoryPillowPackOfFour() {
	    	return CrossSellCartAddToCartStandardMemoryPillowPackOfFour;
		}
			
		//Xpath for Add to cart button for Memory foam when President category is selected and Pack is two
		@FindBy(xpath = "//span[@data-sku='SC-MFPILWSET2-P-28x18']")
		private WebElement CrossSellCartAddToCartPresidentMemoryPillowPackTwo;
			
	    // Webelement for Add to cart button for Memory foam when President category is selected and Pack is two
		public WebElement crossSellCartAddToCartPresidentMemoryPillowPackTwo() {
	    	return CrossSellCartAddToCartPresidentMemoryPillowPackTwo;
		}
		
		//Pillow cases product added in cart slider
		//MemoryFoam pillow case Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRPILWCSSET2-P-33x21']")
	    private WebElement MemoryFoamPillowCase33x21PackOfFourProductAddedInCart;

		// Webelement for MemoryFoam pillow case Product added in cart XPath
		public WebElement memoryFoamPillowCase33x21PackOfFourProductAddedInCart() {
			return MemoryFoamPillowCase33x21PackOfFourProductAddedInCart;
		}
		
		//Cloud pillow case Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRPILWCS-S-28x18']")
	    private WebElement CloudPillowCasePackOfTwo28x18ProductAddedInCart;

		// Webelement for Cloud pillow case Product added in cart XPath
		public WebElement cloudPillowCasePackOfTwo28x18ProductAddedInCart() {
			return CloudPillowCasePackOfTwo28x18ProductAddedInCart;
		}
		
		
		//Cross selling section for Protector in cart slider
		//Xpath for category Type field of comforter cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//div[@data-value='Single']")
	    private WebElement CrossSellCartProtectorCategoryField;

		// Webelement option for category Type field of comforter cross selling product section
		public WebElement crossSellCartProtectorCategoryField() {
			return CrossSellCartProtectorCategoryField;
		}
				
		//Xpath for different category field of comforter cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//span[text()='Single']")
	    private WebElement CrossSellCartSingleCategoryProtector;
		
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//span[text()='Double']")
	    private WebElement CrossSellCartDoubleCategoryProtector;
		
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//span[text()='King']")
	    private WebElement CrossSellCartKingCategoryProtector;
		
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//span[text()='Queen']")
	    private WebElement CrossSellCartQueenCategoryProtector;
		
		// Webelement option for Double category of comforter cross selling product section
		public WebElement crossSellCartSingleCategoryProtector() {
			return CrossSellCartSingleCategoryProtector;
		}
		
		public WebElement crossSellCartDoubleCategoryProtector() {
			return CrossSellCartDoubleCategoryProtector;
		}
		
		public WebElement crossSellCartKingCategoryProtector() {
			return CrossSellCartKingCategoryProtector;
		}
		
		public WebElement crossSellCartQueenCategoryProtector() {
			return CrossSellCartQueenCategoryProtector;
		}
		
		//Xpath for Size field of Protector cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//div[@name='variations protector']")
	    private WebElement CrossSellCartProtectorSizeField;
		
		// Webelement option for category Type field of comforter cross selling product section
		public WebElement crossSellCartProtectorSizeField() {
			return CrossSellCartProtectorSizeField;
		}
		
		//Xpath for Different Size dropdown field of Protector in cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//li[@data-sku='SC-PROT-D-75x48']")
	    private WebElement CrossSellCartDoubleProtector75x48;
		
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//li[@data-sku='SC-PROT-D-78x48']")
	    private WebElement CrossSellCartDoubleProtector78x48;
		
		// Webelement for Different Size dropdown field of Protector in cross selling product section
		public WebElement crossSellCartDoubleProtector75x48() {
			return CrossSellCartDoubleProtector75x48;
		}
		
		public WebElement crossSellCartDoubleProtector78x48() {
			return CrossSellCartDoubleProtector78x48;
		}
		
		//Xpath for Different Size dropdown field of Protector in cross selling product section
		@FindBy(xpath = "//span[@data-sku='SC-PROT-D-75x48']")
	    private WebElement CrossSellCartAddToCartDoubleProtector75x48;
		
		@FindBy(xpath = "//span[@data-sku='SC-PROT-D-78x48']")
	    private WebElement CrossSellCartAddToCartDoubleProtector78x48;

		// Webelement for Different Size dropdown field of Protector in cross selling product section
		public WebElement crossSellCartAddToCartDoubleProtector75x48() {
			return CrossSellCartAddToCartDoubleProtector75x48;
		}
			
		public WebElement crossSellCartAddToCartDoubleProtector78x48() {
			return CrossSellCartAddToCartDoubleProtector78x48;
		}
		
		//Xpath for Different Size dropdown field of Protector in cross selling product section when category is queen
		@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale lslide']//li[@data-sku='SC-PROT-Q-78x60']")
		private WebElement CrossSellCartQueenProtector78x60;
			
	    // Webelement for Different Size dropdown field of Protector in cross selling product section
		public WebElement crossSellCartQueenProtector78x60() {
			return CrossSellCartQueenProtector78x60;
		}
			
		//Xpath for Add to cart button when Protector in cross selling product section
	    @FindBy(xpath = "//span[@data-sku='SC-PROT-Q-78x60']")
		private WebElement CrossSellCartAddToCartQueenProtector78x60;
		
	    // Webelement for Add to cart button when Protector Protector in cross selling product section
		public WebElement crossSellCartAddToCartQueenProtector78x60() {
			return CrossSellCartAddToCartQueenProtector78x60;
		}
		
		//Xpath for Defaut Add to cart button when Single Protector in cross selling product section
	    @FindBy(xpath = "//span[@data-sku='SC-PROT-S-78x36']")
		private WebElement CrossSellCartAddToCartSingleProtector78x36;
		
	    // Webelement for Add to cart button when Protector Protector in cross selling product section
		public WebElement crossSellCartAddToCartSingleProtector78x36() {
			return CrossSellCartAddToCartSingleProtector78x36;
		}
	    
		//Cross selling cloud pillow section in cart slider
		//Xpath for category field of cloud pillow cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow lslide']//div[@data-value='Standard']")
	    private WebElement CrossSellCartCloudPillowCategoryField;

		// Webelement for category field of cloud pillow cross selling product section
		public WebElement crossSellCartCloudPillowCategoryField() {
			return CrossSellCartCloudPillowCategoryField;
		}
		
		//Xpath for President category of cloud pillow cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow lslide']//span[text()='President']")
	    private WebElement CrossSellCartPresidentCategoryCloudPillow;
		
		// Webelement option for President category of cloud pillow cross selling product section
		public WebElement crossSellCartPresidentCategoryCloudPillow() {
			return CrossSellCartPresidentCategoryCloudPillow;
		}
		
		
		//Xpath for pack field of cloud pillow in cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow lslide']//div[@data-name='pack']")
	    private WebElement CrossSellCartPackFieldOfCloudPillow;
		
		// Webelement option for pack field of cloud pillow in cross selling product section
		public WebElement crossSellCartPackFieldOfCloudPillow() {
			return CrossSellCartPackFieldOfCloudPillow;
		}
		
		
		//Xpath for pack field of cloud pillow in cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow lslide']//li[text()='Pack of 2']")
	    private WebElement CrossSellCartPackTwoOfCloudPillow;
		
		@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow lslide']//li[text()='Pack of 4']")
	    private WebElement CrossSellCartPackFourOfCloudPillow;
		
		// Webelement option for pack field of cloud pillow in cross selling product section
		public WebElement crossSellCartPackTwoOfCloudPillow() {
			return CrossSellCartPackTwoOfCloudPillow;
		}
		
		public WebElement crossSellCartPackFourOfCloudPillow() {
			return CrossSellCartPackFourOfCloudPillow;
		}
		
		
		//Xpath for Add to cart button of cloud pillow in cross selling product section of cart slider when category is President
		@FindBy(xpath = "//span[@data-sku='SC-CLPILWSET4-P-32x20']")
	    private WebElement CrossSellCartAddToCartPresidentPackOfFourCloudPillow;
						
	    // Webelement option for pack field of cloud pillow in cross selling product section
	    public WebElement crossSellCartAddToCartPresidentPackOfFourCloudPillow() {
			return CrossSellCartAddToCartPresidentPackOfFourCloudPillow;
		}
	
		
		//Xpath for increment and decrement product quantity icon of cloud pillow in cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow lslide']//input[@class='plus']")
	    private WebElement CrossSellCartCloudPillowIncrementQuantity;
		
		@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow lslide']//input[@class='minus']")
	    private WebElement CrossSellCartCloudPillowDecreaseQuantity;
		
		// Webelement option for increment and decrement product quantity icon of cloud pillow in cross selling product section
		public WebElement crossSellCartCloudPillowIncrementQuantity() {
			return CrossSellCartCloudPillowIncrementQuantity;
		}
		
		public WebElement crossSellCartCloudPillowDecreaseQuantity() {
			return CrossSellCartCloudPillowDecreaseQuantity;
		}
		
		//Cross sell Weighted Blanket product in cart slider
		//Xpath for pack field of cloud pillow in cross selling product section
		@FindBy(xpath = "//div[@class='container_cross_sell weighted_blanket lslide']//li[@data-value='wbpink']")
	    private WebElement CrossSellCartWeightedBlanketPinkColor;
		
		@FindBy(xpath = "//div[@class='container_cross_sell weighted_blanket lslide']//li[@data-value='wbgrey']")
	    private WebElement CrossSellCartWeightedBlanketGreyColor;
				
		// Webelement option for pack field of weighted blanket in cross selling product section
		public WebElement crossSellCartWeightedBlanketPinkColor() {
			return CrossSellCartWeightedBlanketPinkColor;
		}
		
		public WebElement crossSellCartWeightedBlanketGreyColor() {
			return CrossSellCartWeightedBlanketGreyColor;
		}
		
		//Xpath for Add to cart button for weighted blanket in cross selling product section in cart slider when color is pink
	    @FindBy(xpath = "//span[@data-sku='SC-BNWTBLANKET-S-75x50']")
	    private WebElement CrossSellCartAddToCartWeightedBlanketPinkColor;
		
		// Webelement option for pack field of weighted blanket in cross selling product section
		public WebElement crossSellCartAddToCartWeightedBlanketPinkColor() {
			return CrossSellCartAddToCartWeightedBlanketPinkColor;
		}

		
		
		//Pillow Case product in cross selling product section in cart slider
		//Xpath for Type field for pillow case product
		@FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//div[@data-value='Cloud Pillow Case']")
		private WebElement CrossSellCartPillowCaseTypeField;
				
	    // Webelement for Type field for pillow case product
		public WebElement crossSellCartPillowCaseTypeField() {
			return CrossSellCartPillowCaseTypeField;
		}
				
		//Xpath for Different Type options for pillow cases
		@FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//li[@data-value='Memory Foam Pillow Case']")
		private WebElement CrossSellCartMemoryCaseTypeForPillowCases;
		
		@FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//li[@data-value='Cuddle Pillow Case']")
		private WebElement CrossSellCartCuddleCaseTypeForPillowCases;
				
	    // Webelement for Different Type options for pillow cases
		public WebElement crossSellCartMemoryCaseTypeForPillowCases() {
			return CrossSellCartMemoryCaseTypeForPillowCases;
		}
		
		public WebElement crossSellCartCuddleCaseTypeForPillowCases() {
			return CrossSellCartCuddleCaseTypeForPillowCases;
		}
					
		//Xpath for Pack field for Pillow cases
	    @FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//div[@data-value='case-2']")
		private WebElement CrossSellCartPillowCasesPackField;
				
	    // Webelement for Pack field for Pillow cases
		public WebElement crossSellCartPillowCasesPackField() {
			return CrossSellCartPillowCasesPackField;
		}
				
		//Xpath for different Pack options for pillow cases 
	    @FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//li[text()='Pack of 4']")
		private WebElement CrossSellCartPillowCasePackOfFour;
		    
	    @FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//li[text()='Pack of 8']")
		private WebElement CrossSellCartPillowCasePackOfEight;
				
	    // Webelement for different Pack options for Memory pillow when President category is selected
		public WebElement crossSellCartPillowCasePackOfFour() {
			return CrossSellCartPillowCasePackOfFour;
		}
			
		public WebElement crossSellCartPillowCasePackOfEight() {
			return CrossSellCartPillowCasePackOfEight;
		}
				
		//Xpath for size field for Pillow case cross selling product
		@FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//div[@class='customDropdown variations pillow_case']")
		private WebElement CrossSellCartPillowCaseSizeField;
				
	    // Webelement for size field for Pillow case cross selling product
		public WebElement crossSellCartPillowCaseSizeField() {
	    	return CrossSellCartPillowCaseSizeField;
		}
		
		//Xpath for different size dropdown for pillow cases when Type is memory foam and Pack is four
		@FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//li[@data-sku='SC-GRPILWCSSET2-S-28x18']")
		private WebElement CrossSellCartMemoryPillowTypePillowcasePackFour28x18;
		
		@FindBy(xpath = "//div[@class='container_cross_sell pillow_case lslide']//li[@data-sku='SC-GRPILWCSSET2-P-33x21']")
		private WebElement CrossSellCartMemoryPillowTypePillowcasePackFour33x21;
					
	    // Webelement for different size dropdown for pillow cases when Type is memmory foam and Pack is four
		public WebElement crossSellCartMemoryPillowTypePillowcasePackFour28x18() {
	    	return CrossSellCartMemoryPillowTypePillowcasePackFour28x18;
		}
		
		public WebElement crossSellCartMemoryPillowTypePillowcasePackFour33x21() {
	    	return CrossSellCartMemoryPillowTypePillowcasePackFour33x21;
		}
		
	    //Xpath for Add to cart button for pillow case when type is memory Foam and and Pack is four
		@FindBy(xpath = "//span[@data-sku='SC-GRPILWCSSET2-S-28x18']")
		private WebElement CrossSellCartAddToCartMemoryPillowTypePillowcasePackOfFour;
					
	    // Webelement for Add to cart button for pillow case when type is memory Foam and and Pack is four
		public WebElement crossSellCartAddToCartMemoryPillowTypePillowcasePackOfFour() {
	    	return CrossSellCartAddToCartMemoryPillowTypePillowcasePackOfFour;
		} 
		
				
	   //Cloud Pillow products added in cart 
	  //Cross selling president category cloud pillow Product added in cart XPath
	  @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLPILWSET4-P-32x20']")
	  private WebElement PresidentCategoryCloudPillowPackOfFourProductAddedInCart;

	  // Webelement for Cross selling president category cloud pillow Product added in cart XPath
	  public WebElement presidentCategoryCloudPillowPackOfFourProductAddedInCart() {
	  		return PresidentCategoryCloudPillowPackOfFourProductAddedInCart;
	  }
	  
	  //President category Cloud Pillow Pack of Two Product added in Cart 
	    @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLPILWSET2-P-32x20']")
		 private WebElement PresidentCategoryCloudPillowPackOfTwoProductAddedInCart;

	    // Webelement for President category Cloud Pillow Pack of Two Product added in Cart 
	    public WebElement presidentCategoryCloudPillowPackOfTwoProductAddedInCart() {
	    		return PresidentCategoryCloudPillowPackOfTwoProductAddedInCart;
	    }
	    
	    //Standard category Cloud Pillow Pack of Two Product added in Cart 
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLPILW-S-27x18']")
	    private WebElement StandardCategoryCloudPillowPackOfOneProductAddedInCart;

		// Webelement for Standard category Cloud Pillow Pack of Two added in cart XPath
		public WebElement standardCategoryCloudPillowPackOfOneProductAddedInCart() {
			return StandardCategoryCloudPillowPackOfOneProductAddedInCart;
		}
		
		 //Protector product added in cart slider
		//Single category protector Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PROT-S-72x36']")
	    private WebElement SingleCategoryProtector72x36ProductAddedInCart;

		// Webelement for Single category protector Product added in cart
		public WebElement singleCategoryProtector72x36ProductAddedInCart() {
			return SingleCategoryProtector72x36ProductAddedInCart;
		}
		
		//Double category protector Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PROT-D-75x48']")
		private WebElement DoubleCategoryProtector75x48ProductAddedInCart;

		// Webelement for Double category protector Product added in cart
		public WebElement doubleCategoryProtector75x48ProductAddedInCart() {
			return DoubleCategoryProtector75x48ProductAddedInCart;
		}
	    
	  //Comforter product added in cart slider
	 //Cross selling Double category coffee color Comforter Product added in cart XPath
	  @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-CFCOMF-D-90x100']")
	  private WebElement DoubleCategoryCoffeColorComforterProductAddedInCart;

	  // Webelement for Cross selling Double category coffee color Comforter Product added in cart XPath
	  public WebElement doubleCategoryCoffeColorComforterProductAddedInCart() {
	  		return DoubleCategoryCoffeColorComforterProductAddedInCart;
	  }
	  
	 //Cross selling Single category white color Comforter Product added in cart XPath
	  @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-COMF-S-90x60']")
	  private WebElement SingleCategoryWhiteColorComforterProductAddedInCart;

	  // Webelement for Cross selling Single category white color Comforter Product added in cart XPath
	  public WebElement singleCategoryWhiteColorComforterProductAddedInCart() {
	  		return SingleCategoryWhiteColorComforterProductAddedInCart;
	  }
		
	  
	  //Plus mattress products added in cart slider
	 //King category plus mattress Product added in cart XPath
	 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PLUS-K-75x72x10']")
	 private WebElement PlusMattressKingCategory75x72x10ProductAddedInCart;

	  // Webelement for King category plus mattress Product added in cart
	  public WebElement plusMattressKingCategory75x72x10ProductAddedInCart() {
	  		return PlusMattressKingCategory75x72x10ProductAddedInCart;
	  }
	  
		//Single category plus mattress Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PLUS-S-72x30x8']")
	    private WebElement SingleCategoryPlusMattress72x30x8ProductAddedInCart;

		// Webelement for Single category plus mattress Product added in cart
		public WebElement singleCategoryPlusMattress72x30x8ProductAddedInCart() {
			return SingleCategoryPlusMattress72x30x8ProductAddedInCart;
		}
		
	  

 //Pillow cases product added in cart
 //Cross selling President category Memory pillow pack of Two Product added in cart XPath
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-MFPILWSET2-P-28x18']")
	 private WebElement PresidentCategoryMemoryPillowPackOfTwoProductAddedInCart;

 // Webelement for Cross selling Single category white color Comforter Product added in cart XPath
 public WebElement presidentCategoryMemoryPillowPackOfTwoProductAddedInCart() {
 		return PresidentCategoryMemoryPillowPackOfTwoProductAddedInCart;
 }
	    
 //Cross selling Cart slider Memory Pillow Type pack of four product added in cart
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRPILWCSSET2-S-28x18']")
	 private WebElement CrossSellCartMemoryPillowTypePillowcasePackOfFourProductAddedInCart;

 // Webelement for Cross selling Cart slider Memory Pillow Type pack of four product added in cart
 public WebElement CrossSellCartMemoryPillowTypePillowcasePackOfFourProductAddedInCart() {
 		return CrossSellCartMemoryPillowTypePillowcasePackOfFourProductAddedInCart;
 }
 
 //MemoryFoam pillow products added in cart
 //Standard Category Memory Foam pillow Pack Of one Product added in cart XPath
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PILLOW-S-26x16x4']")
   private WebElement StandardCategoryMemoryFoamPillowPackOfOneProductAddedInCart;

	// Webelement for Standard Category Memory Foam pillow Pack Of one Product in cart 
	public WebElement standardCategoryMemoryFoamPillowPackOfOneProductAddedInCart() {
		return StandardCategoryMemoryFoamPillowPackOfOneProductAddedInCart;
	}
	
	//President Category Memory Foam pillow Pack Of four Product added in cart XPath
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-MFPILWSET4-P-28x18']")
   private WebElement PresidentCategoryMemoryFoamPillowPackOfFourProductAddedInCart;

	// Webelement for President Category Memory Foam pillow Pack Of four Product added in cart 
	public WebElement presidentCategoryMemoryFoamPillowPackOfFourProductAddedInCart() {
		return PresidentCategoryMemoryFoamPillowPackOfFourProductAddedInCart;
	}

 //Metal Bed product added in cart slider
 //Single category Metal bed Product added in cart XPath
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-BED-S-78x36x16']")
 private WebElement MetalBedSingleCategoryProductAddedInCart;

	// Webelement for Single category Metal bed Product added in cart 
	public WebElement metalBedSingleCategoryProductAddedInCart() {
		return MetalBedSingleCategoryProductAddedInCart;
	}
	
     //Ohayo Bed product added in cart slider
	    //Queen category Ohayo bed Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-OHAYOBED-Q-84x65x13']")
	    private WebElement OhayoBedQueenCategoryProductAddedInCart;

		// Webelement for Queen category Ohayo bed Product added in cart
		public WebElement ohayoBedQueenCategoryProductAddedInCart() {
			return OhayoBedQueenCategoryProductAddedInCart;
		}
		
		//King category Ohayo bed Product added in cart XPath
		@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-OHAYOBED-K-84x77x13']")
		private WebElement OhayoBedKingCategoryProductAddedInCart;

		// Webelement for King category Ohayo bed Product added in cart 
		public WebElement ohayoBedKingCategoryProductAddedInCart() {
			return OhayoBedKingCategoryProductAddedInCart;
		}
 
 //Cuddle pillow product added in cart slider
 //Standard category Cuddle Pillow Product added in Cart 
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-GRBDPILWSET-S-50x19']")
	 private WebElement StandardCategoryCuddlePillowProductAddedInCart;

 // Webelement for President category Cloud Pillow Pack of Two Product added in Cart 
 public WebElement standardCategoryCuddlePillowProductAddedInCart() {
 		return StandardCategoryCuddlePillowProductAddedInCart;
 }
 
 
 //Original mattress product added in cart slider
 //Double category Original Mattress Product added in Cart 
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-D-75x48x6']")
	 private WebElement DoubleCategoryOriginalMattress75x48x6ProductAddedInCart;

 // Webelement for Double category Original Mattress Product added in Cart
 public WebElement doubleCategoryOriginalMattress75x48x6ProductAddedInCart() {
 		return DoubleCategoryOriginalMattress75x48x6ProductAddedInCart;
 }
 
//Double category Original Mattress Product added in Cart 
@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-D-72x48x6']")
private WebElement DoubleCategoryOriginalMattress72x48x6ProductAddedInCart;

// Webelement for Double category Original Mattress Product added in Cart
public WebElement doubleCategoryOriginalMattress72x48x6ProductAddedInCart() {
		return DoubleCategoryOriginalMattress72x48x6ProductAddedInCart;
}
 
 //Cross selling King category Original Mattress Product added in cart XPath
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-K-75x72x6']")
	 private WebElement OriginalMattressKingCategory75x72x6ProductAddedInCart;

 // Webelement for Cross selling King category Original Mattress Product added in cart XPath
 public WebElement originalMattressKingCategory75x72x6ProductAddedInCart() {
 		return OriginalMattressKingCategory75x72x6ProductAddedInCart;
 }
 
 //King category Original Mattress Bundle Product added in cart XPath
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIGBDL-K-72x72x6']")
	 private WebElement OriginalMattressKingCategory72x72x6BundleProductAddedInCart;

 // Webelement for King category Original Mattress Bundle Product added in cart
 public WebElement originalMattressKingCategory72x72x6BundleProductAddedInCart() {
 		return OriginalMattressKingCategory72x72x6BundleProductAddedInCart;
 }
 
 //Single category Original Mattress Product added in cart XPath
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-S-78x36x6']")
	 private WebElement SingleCategoryOriginalMattress78x36x6ProductAddedInCart;

// Webelement for Single category Original Mattress Product added in Cart
public WebElement singleCategoryOriginalMattress78x36x6ProductAddedInCart() {
		return SingleCategoryOriginalMattress78x36x6ProductAddedInCart;
}

//Single category Original Mattress Product added in cart XPath
@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-ORIG-S-72x30x6']")
private WebElement SingleCategoryOriginalMattress72x30x6ProductAddedInCart;

// Webelement for Single category Original Mattress Product added in Cart
	public WebElement singleCategoryOriginalMattress72x30x6ProductAddedInCart() {
		return SingleCategoryOriginalMattress72x30x6ProductAddedInCart;
	}
 
 
 //Latex mattress product added in cart slider
 //Queen category Latex Mattress Product added in Cart 
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-Q-75x60x7']")
	 private WebElement QueenCategoryLatexMattress75x60x7ProductAddedInCart;

 // Webelement for Queen category Latex Mattress Product added in Cart 
 public WebElement queenCategoryLatexMattress75x60x7ProductAddedInCart() {
 		return QueenCategoryLatexMattress75x60x7ProductAddedInCart;
 }
 
 //Custom category Latex Mattress Product added in Cart 
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-Q-75x60x7']")
	private WebElement CustomCategoryLatexMattressProductAddedInCart;

	// Webelement for Custom category Latex Mattress Product added in cart XPath
	public WebElement customCategoryLatexMattressProductAddedInCart() {
		return CustomCategoryLatexMattressProductAddedInCart;
	}
	
 //Single category Latex Mattress Product added in Cart 
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-S-72x30x7']")
	private WebElement SingleCategoryLatexMattress72x30x7ProductAddedInCart;

	// Webelement for Single category Latex Mattress Product added in cart XPath
	public WebElement singleCategoryLatexMattress72x30x7ProductAddedInCart() {
		return SingleCategoryLatexMattress72x30x7ProductAddedInCart;
	}
	
	//Single category Latex Mattress Product added in Cart
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-LATEX-S-75x36x7']")
	private WebElement SingleCategoryLatexMattress75x36x7ProductAddedInCart;

	// Webelement for Single category Latex Mattress Product added in cart XPath
	public WebElement singleCategoryLatexMattress75x36x7ProductAddedInCart() {
		return SingleCategoryLatexMattress75x36x7ProductAddedInCart;
	}
 
 
 //Plus mattress product added in cart slider
 //Double category Plus Mattress Product added in Cart 
 @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PLUS-D-75x48x8']")
	 private WebElement DoubleCategoryPlusMattress75x48x8ProductAddedInCart;

 // Webelement for Double category Plus Mattress Product added in Cart 
 public WebElement doubleCategoryPlusMattress75x48x8ProductAddedInCart() {
 		return DoubleCategoryPlusMattress75x48x8ProductAddedInCart;
 }
 
 
  //Baby mattress Product added in cart slider
 //Xpath for Single category Baby mattress product added in cart slider
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-BABY-S-48x24x4']")
  private WebElement SingleCategoryBabyMattress48x24x4ProductAddedInCart;

	// Webelement for Single category Baby mattress product added in cart slider
	public WebElement singleCategoryBabyMattress48x24x4ProductAddedInCart() {
		return SingleCategoryBabyMattress48x24x4ProductAddedInCart;
	}
	
 //Xpath for Single category Baby mattress product added in cart slider
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-BABY-S-52x28x4']")
  private WebElement SingleCategoryBabyMattress52x28x4ProductAddedInCart;

	// Webelement for Single category Baby mattress product added in cart slider
	public WebElement singleCategoryBabyMattress52x28x4ProductAddedInCart() {
		return SingleCategoryBabyMattress52x28x4ProductAddedInCart;
	}
	
  //Pet bed Products added in cart slider
 //Xpath for Original category medium Pet bed product added in cart slider
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORIG-M-36x26']")
   private WebElement OriginalCategoryMediumPetBed36x26ProductAddedInCart;

	// Webelement for Original category medium Pet bed product added in cart slider
	public WebElement originalCategoryMediumPetBed36x26ProductAddedInCart() {
		return OriginalCategoryMediumPetBed36x26ProductAddedInCart;
	}
	
 //Xpath for Original category Large Pet bed product added in cart slider
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORIG-L-46x32']")
   private WebElement OriginalCategoryLargePetBed46x32ProductAddedInCart;

	// Webelement for Original category Large Pet bed product added in cart slider
	public WebElement originalCategoryLargePetBed46x32ProductAddedInCart() {
		return OriginalCategoryLargePetBed46x32ProductAddedInCart;
	}
	
 //Xpath for Orthopedic category Large Pet bed product added in cart slider
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-PETBEDORTHO-L-48x24']")
	private WebElement OrthopedicCategoryLargePetBed48x24ProductAddedInCart;

	// Webelement for Orthopedic category Large Pet bed product added in cart slider
	public WebElement orthopedicCategoryLargePetBed48x24ProductAddedInCart() {
		return OrthopedicCategoryLargePetBed48x24ProductAddedInCart;
	}
	
	//Weighted Blanket product in cart slider
 //Xpath for Grey color Weighted Blanket Product Added In Cart
	@FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-CLWTBLANKET-S-75x50']")
   private WebElement GreyWeightedBlanketProductAddedInCart;

	// Webelement for Grey color Weighted Blanket Product Added In Cart
	public WebElement greyWeightedBlanketProductAddedInCart() {
		return GreyWeightedBlanketProductAddedInCart;
	}
	
	 //Xpath for Blushed Nude color Weighted Blanket Product Added In Cart
   @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-BNWTBLANKET-S-75x50']")
   private WebElement BlushedNudeWeightedBlanketProductAddedInCart;

	// Webelement for Blushed Nude color Weighted Blanket Product Added In Cart
	public WebElement blushedNudeWeightedBlanketProductAddedInCart() {
		return BlushedNudeWeightedBlanketProductAddedInCart;
	}
	
	   //Xpath for Midnight Blue Color Weighted Blanket product added in cart slider
	   @FindBy(xpath = "//div[@class='cart_item_mid']//div[@data-product_sku='SC-MBWTBLANKET-S-75x50']")
    private WebElement MidnightBlueWeightedBlanketProductAddedInCart;

	  // Webelement for Midnight Blue Color Weighted Blanket product added in cart slider
	  public WebElement midnightBlueWeightedBlanketProductAddedInCart() {
			return MidnightBlueWeightedBlanketProductAddedInCart;
	   }
 
 
		
		public CartSlider(RemoteWebDriver driver) throws Exception
		{
		   this.driver=driver;
	       PageFactory.initElements(driver, this);
		   
		}
}
