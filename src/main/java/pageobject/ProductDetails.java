package pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.CrossBrowserBase;


public class ProductDetails extends CrossBrowserBase {
	
static RemoteWebDriver driver;
public static Logger log =LogManager.getLogger(ProductDetails.class);


   public ProductDetails(RemoteWebDriver driver) throws Exception
   {
    this.driver = driver; 
   //MyPageFactory.initElements(driver, this);
    PageFactory.initElements(driver, this);
   }
	
	// Category section on product details page
	@FindBy(xpath = "//li[text()='Double']")
    private WebElement DoubleCategory;
	
	@FindBy(xpath = "//li[contains(text(),'Queen')]")
    private WebElement QueenCategory;
	
	@FindBy(xpath = "//li[text()='Single']")
    private WebElement SingleCategory;
	
	@FindBy(xpath = "//li[text()='King']")
    private WebElement KingCategory;
	
	@FindBy(xpath = "//li[text()='Custom']")
    private WebElement CustomCategory;
		
	// Webelement for Category section of product details page
	public WebElement queenCategory() {
		return QueenCategory;
	}
	
	public WebElement singleCategory() {
		return SingleCategory;
	}
	
	public WebElement doubleCategory() {
		return DoubleCategory;
	}
	
	public WebElement kingCategory() {
		return KingCategory;
	}

	public WebElement customCategory() {
		return CustomCategory;
	}
	
	@FindBy(xpath = "//li[@data-value='7']")
    private WebElement QuantitySelection;
	
	public WebElement quantityselection() {
		return QuantitySelection;
	}

	
	// Dimension section of product details page
	@FindBy(xpath = "//Span[text()=' inch ']")
    private WebElement InchDimension;
	
	@FindBy(xpath = "//Span[text()=' cm ']")
    private WebElement CmDimension;
	
	@FindBy(xpath = "//Span[text()=' feet ']")
    private WebElement FeetDimension;
	
	//Webelement for Dimension section on product details page
	public WebElement inchDimension() {
		return InchDimension;
	}
	
	public WebElement cmDimension() {
		return CmDimension;
	}
	
	public WebElement feetDimension() {
		return FeetDimension;
	}
	
	//Buy Bundle button XPath
	@FindBy(xpath = "(//button[@id='bundlePurchase'])[2]")
    private WebElement BuyBundleButton;

	// Webelement for Buy Bundle button 
	public WebElement buyBundleButton() {
		return BuyBundleButton;
	}

	
	// Size dropdown section
	@FindBy(xpath = "//div[@Class='variations attr']")
    private WebElement SizeDropdown;
		
	//Webelement for sizeDropdown field
	public WebElement sizeDropdown() {
		return SizeDropdown;
	}

	
	// Qunatity dropdown selection section
	@FindBy(xpath = "//div[@data-name='quantity']")
    private WebElement QuantityField;
		   
	// Webelement for single original mattress
	public WebElement quantityField() {
		return QuantityField;
	}
	
	// Xpath for Size chart image link text on product details page
	@FindBy(xpath = "(//div[@class='mt-2 sizeChart'])[1]")
    private WebElement MattressSizeChartImageLinkText;
			   
	// Webelement for Size chart image link text on product details page
	public WebElement mattressSizeChartImageLinkText() {
		return MattressSizeChartImageLinkText;
	}
	
	// Xpath for Size chart image on product details page
	@FindBy(xpath = "//*[@id='sizeChartModal']//*[contains(@class, 'vin-lazy-load')]")
    private WebElement MattressSizeChartImage;
				   
    // Webelement for Size chart image on product details page
    public WebElement mattressSizeChartImage() {
	    return MattressSizeChartImage;
	}
    
    // Xpath for Size guide link text on product details page
 	@FindBy(xpath = "(//div[@class='mt-2 sizeChart'])[2]")
     private WebElement MattressSizeGuideLinkText;
 			   
 	// Webelement for Size Guide link text on product details page
 	public WebElement MattressSizeGuideLinkText() {
 		return MattressSizeGuideLinkText;
 	}
 	
 	// Xpath for Size Guide image on product details page
 	//@FindBy(xpath = "//*[@id='measureMattress']//*[contains(@class, 'modal-content')]/img")
 	@FindBy(xpath = "//*[@id='measureMattress']//*[contains(@class, 'modal-content')]/img")
 	private WebElement MattressSizeGuideImage;
 				   
     // Webelement for Size Guide image on product details page
     public WebElement mattressSizeGuideImage() {
 	    return MattressSizeGuideImage;
 	}
     
    // Xpath for Size chart image on product details page
  	@FindBy(xpath = "//*[@id='measureMattress']//button[text()='×']")
    private WebElement MattressSizeGuideCrossIcon;
  				   
    // Webelement for Size chart image on product details page
    public WebElement mattressSizeGuideCrossIcon() {
	   return MattressSizeGuideCrossIcon;
  	}
		
	//Xpath for error messages for lenght and width field for Original,plus and Latex mattress
	@FindBy(xpath = "//div[text()='Length customization is allowed between 68 - 84 inch']")
    private WebElement LengthError;
	
	@FindBy(xpath = "//div[text()='Length customization is allowed between 70 - 78 inch']")
    private WebElement LatexLenghtError;
	
	@FindBy(xpath = "//div[text()='Width customization is allowed between 30 - 72 inch']")
    private WebElement WidthError;
			
	// Webelement for error messages for lenght and width field for Original,plus and Latex mattress
	public WebElement lenghtError() {
		return LengthError;
	}
		
	public WebElement latexLenghtError() {
		return LatexLenghtError;
	}
		
	public WebElement widthError() {
		return WidthError;
	}
	
	// Xpath for custom lenght and width option when category is custom
	@FindBy(xpath = "//input[@name='custom_length']")
    private WebElement CustomLength;
	
	@FindBy(xpath = "//input[@name='custom_breath']")
    private WebElement CustomWidth;
	
	// Webelement option for Dropdown option when category is Queen on Plus mattress and height is 10 inch
	public WebElement customLength() {
		return CustomLength;
	}

	public WebElement customWidth() {
		return CustomWidth;
	}
	
	
	//Xpath for Personalize Name Section,Stitch it button and name field on product details page
	@FindBy(xpath = "//button[@id='personalize-toggle-btn']")
    private WebElement PersonalizeNameSection;
	
	@FindBy(xpath = "//input[@id='personalize-initials']")
    private WebElement PersonalizeNameField;
	
	@FindBy(xpath = "//button[@id='stitch-it-btn']")
    private WebElement StitchButton;
	
	@FindBy(xpath = "//button[@id='edit-btn']")
    private WebElement EditButton;
	
	@FindBy(xpath = "//button[@id='cancel-btn']")
    private WebElement RemoveButton;
	
	// Webelement for Personalize Name Section,Stitch it button and name field on product details page
	public WebElement personalizeNameSection() {
		return PersonalizeNameSection;
	}
	
	public WebElement personalizeNameField() {
		return PersonalizeNameField;
	}
	
	public WebElement stitchButton() {
		return StitchButton;
	}
	
	public WebElement editButton() {
		return EditButton;
	}
	
	public WebElement removeButton() {
		return RemoveButton;
	}
	
	//Xpath for Frequently bought with the above product  text
	@FindBy(xpath = "//span[text()='Frequently bought with the above product']")
    private WebElement FrequentlyText;
			
	// Webelement for for Frequently bought with the above product  text
	public WebElement frequentlyText() {
		return FrequentlyText;
	}
	
	//Xpath for cross sell section text
	@FindBy(xpath = "//span[text()='10 years warranty']")
    private WebElement CrossSellSection;
				
	// Webelement for for Frequently bought with the above product  text
	public WebElement crossSellSection() {
		return CrossSellSection;
	}
	
	//Xpath for cross sell section text
	@FindBy(xpath = "//span[text()='Free shipping']")
    private WebElement CrossSellFreeShippingText;
					
	// Webelement for for Frequently bought with the above product  text
	public WebElement CrossSellFreeShippingText() {
		return CrossSellFreeShippingText;
	}

	
	//Xpath for How to measure the right fit for your bed text
	@FindBy(xpath = "//span[text()='How to measure the right fit for your bed?']")
    private WebElement MeasureBedText;
				
	// Webelement for How to measure the right fit for your bed text
	public WebElement measureBedText() {
		return MeasureBedText;
	}
	
	//Cross selling section product Add to cart button xpath section on product details page
	@FindBy(xpath = "//div[@class='container_cross_sell comforter ']//span[@data-sku='SC-COMF-S-90x60']")
    private WebElement CrossSellSingleComforter;
	
	@FindBy(xpath = "//div[@class='container_cross_sell body_pillow ']//span[@data-sku='SC-GRBDPILWSET-S-50x19']")
    private WebElement CrossSellCuddlePillow;
	
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILW-S-27x18']")
    private WebElement CrossCloudPillow;
	
	// Webelement option for Cross selling section Add to cart product button
	public WebElement crossSellSingleComforter() {
		return CrossSellSingleComforter;
	}

	public WebElement crossSellCuddlePillow() {
		return CrossSellCuddlePillow;
	}
	
	public WebElement crossCloudPillow() {
		return CrossCloudPillow;
	}
	
	
	//Cross selling next and previous product icon xpath section on product details page
	@FindBy(xpath = "//div[@class='product_cross_sell_wrap cross-selling-section']//a[@class='lSNext']")
    private WebElement CrossSellNextproduct;
	
	@FindBy(xpath = "//div[@class='product_cross_sell_wrap cross-selling-section']//a[@class='lSPrev']")
    private WebElement CrossSellPreviousProduct;
    
	// Webelement option for Cross selling next and previous product icon on product details page
	public WebElement crossSellNextproduct() {
		return CrossSellNextproduct;
	}

	public WebElement crossSellPreviousProduct() {
		return CrossSellPreviousProduct;
	}
	
	
	//Cross selling section product Add to cart button xpath section on product details page of Original mattress page
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILW-P-32x20']")
    private WebElement CrossSellAddtocartPresidentCloudPillowSet1;
	
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILWSET2-P-32x20']")
    private WebElement CrossSellAddtocartPresidentCloudPillowSet2;
	
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//span[@data-sku='SC-CLPILWSET4-P-32x20']")
    private WebElement CrossSellAddtocartPresidentCloudPillowSet4;
	
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//span[@data-sku='SC-PROT-S-75x36']")
    private WebElement CrossSellAddtocartSingleProtector75x36;
	
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//span[@data-sku='SC-PROT-S-72x36']")
    private WebElement CrossSellAddtocartSingleProtector72x36;
	
	@FindBy(xpath = "//div[@class='container_cross_sell pillow ']//span[@data-sku='SC-PILLOW-S-26x16x4']")
    private WebElement CrossSellAddtocartStandardMemoryPillowSet1;

	// Webelement option for cross selling product on Original mattress page 
	public WebElement crossSellAddtocartPresidentCloudPillowSet1() {
		return CrossSellAddtocartPresidentCloudPillowSet1;
	}
	
	public WebElement crossSellAddtocartPresidentCloudPillowSet2() {
		return CrossSellAddtocartPresidentCloudPillowSet2;
	}
	
	public WebElement crossSellAddtocartPresidentCloudPillowSet4() {
		return CrossSellAddtocartPresidentCloudPillowSet4;
	}

	public WebElement crossSellAddtocartSingleProtector75x36() {
		return CrossSellAddtocartSingleProtector75x36;
	}
	
	public WebElement crossSellAddtocartSingleProtector72x36() {
		return CrossSellAddtocartSingleProtector72x36;
	}
	
	public WebElement crossSellAddtocartStandardMemoryPillowSet1() {
		return CrossSellAddtocartStandardMemoryPillowSet1;
	}
	
	//Cross selling cloud pillow section
	//Xpath for category field of cloud pillow cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//div[@data-value='Standard']")
    private WebElement CrossSellCloudPillowCategoryField;

	// Webelement for category field of cloud pillow cross selling product section
	public WebElement crossSellCloudPillowCategoryField() {
		return CrossSellCloudPillowCategoryField;
	}
	
	//Xpath for President category of cloud pillow cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//span[text()='President']")
    private WebElement CrossSellPresidentCategoryCloudPillow;
	
	// Webelement option for President category of cloud pillow cross selling product section
	public WebElement crossSellPresidentCategoryCloudPillow() {
		return CrossSellPresidentCategoryCloudPillow;
	}
	
	
	//Xpath for pack field of cloud pillow in cross selling product section
	@FindBy(xpath = "//div[@data-name='pack']//span[text()='Pack of 1']")
    private WebElement CrossSellPackFieldOfCloudPillow;
	
	// Webelement option for pack field of cloud pillow in cross selling product section
	public WebElement crossSellPackFieldOfCloudPillow() {
		return CrossSellPackFieldOfCloudPillow;
	}
	
	
	//Xpath for pack field of cloud pillow in cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//li[text()='Pack of 2']")
    private WebElement CrossSellPackTwoOfCloudPillow;
	
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//li[text()='Pack of 4']")
    private WebElement CrossSellPackFourOfCloudPillow;
	
	// Webelement option for pack field of cloud pillow in cross selling product section
	public WebElement crossSellPackFourOfCloudPillow() {
		return CrossSellPackFourOfCloudPillow;
	}
	
	public WebElement CrossSellPackTwoOfCloudPillow() {
		return CrossSellPackTwoOfCloudPillow;
	}
	
	
	//Xpath for increment and decrement product quantity icon of cloud pillow in cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//input[@class='plus']")
    private WebElement CrossSellCloudPillowIncrementQuantity;
	
	@FindBy(xpath = "//div[@class='container_cross_sell cloud_pillow ']//input[@class='minus']")
    private WebElement CrossSellCloudPillowDecreaseQuantity;
	
	// Webelement option for increment and decrement product quantity icon of cloud pillow in cross selling product section
	public WebElement crossSellCloudPillowIncrementQuantity() {
		return CrossSellCloudPillowIncrementQuantity;
	}
	
	public WebElement crossSellCloudPillowDecreaseQuantity() {
		return CrossSellCloudPillowDecreaseQuantity;
	}
	
	//Cross selling section for Comforter
	//Xpath for category Type field of comforter cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell comforter ']//div[@data-value='Single']")
    private WebElement CrossSellComforterCategoryField;
	
	// Webelement option for category Type field of comforter cross selling product section
	public WebElement crossSellComforterCategoryField() {
		return CrossSellComforterCategoryField;
	}
		
	//Xpath for Double category of comforter cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell comforter ']//span[text()='Double']")
    private WebElement CrossSellDoubleCategoryComforter;
		
	// Webelement option for Double category of comforter cross selling product section
	public WebElement crossSellDoubleCategoryComforter() {
		return CrossSellDoubleCategoryComforter;
	}
	
	//Xpath for Color options of Comforter on cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell comforter ']//li[@data-value='coffee']")
    private WebElement CrossSellComforterCoffeeColor;
	
	@FindBy(xpath = "//div[@class='container_cross_sell comforter ']//li[@data-value='pink']")
    private WebElement CrossSellComforterPinkColor;
	
	// Webelement for Color options of Comforter on cross selling product section
	public WebElement crossSellComforterCoffeeColor() {
		return CrossSellComforterCoffeeColor;
	}
			
	public WebElement crossSellComforterPinkColor() {
		return CrossSellComforterPinkColor;
	}
	
	//Xpath for Add to cart of Double category pink color comforter cross selling product 
	@FindBy(xpath = "//div[@class='container_cross_sell comforter ']//span[@data-sku='SC-PKCOMF-D-90x100']")
    private WebElement CrossSellDoubleCategoryPinkComforter;
				
	// Webelement option for Add to cart of Double category pink color comforter cross selling product 
	public WebElement crossSellDoubleCategoryPinkComforter() {
		return CrossSellDoubleCategoryPinkComforter;
	}
	
	//Xpath for Add to cart of Double category Coffee color comforter cross selling product 
	@FindBy(xpath = "//div[@class='container_cross_sell comforter ']//span[@data-sku='SC-CFCOMF-D-90x100']")
    private WebElement CrossSellDoubleCategoryCoffeeComforter;
					
	// Webelement option for Add to cart of Double category Coffee color comforter cross selling product 
	public WebElement crossSellDoubleCategoryCoffeeComforter() {
		return CrossSellDoubleCategoryCoffeeComforter;
	}
	
	
	//Cross selling section for Protector
	//Xpath for category Type field of comforter cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//div[@data-value='Single']")
    private WebElement CrossSellProtectorCategoryField;

	// Webelement option for category Type field of comforter cross selling product section
	public WebElement crossSellProtectorCategoryField() {
		return CrossSellProtectorCategoryField;
	}
			
	//Xpath for different category field of comforter cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//span[text()='Single']")
    private WebElement CrossSellSingleCategoryProtector;
	
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//span[text()='Double']")
    private WebElement CrossSellDoubleCategoryProtector;
	
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//span[text()='King']")
    private WebElement CrossSellKingCategoryProtector;
	
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//span[text()='Queen']")
    private WebElement CrossSellQueenCategoryProtector;
	
	// Webelement option for Double category of comforter cross selling product section
	public WebElement crossSellSingleCategoryProtector() {
		return CrossSellSingleCategoryProtector;
	}
	
	public WebElement crossSellDoubleCategoryProtector() {
		return CrossSellDoubleCategoryProtector;
	}
	
	public WebElement crossSellKingCategoryProtector() {
		return CrossSellKingCategoryProtector;
	}
	
	public WebElement crossSellQueenCategoryProtector() {
		return CrossSellQueenCategoryProtector;
	}
	
	//Xpath for Size field of Protector cross selling product section
	@FindBy(xpath = "//div[@class='container_cross_sell protector on-sale']//div[@name='variations protector']")
    private WebElement CrossSellProtectorSizeField;
	
	// Webelement option for category Type field of comforter cross selling product section
	public WebElement crossSellProtectorSizeField() {
		return CrossSellProtectorSizeField;
	}
	
	//Xpath for Different Size dropdown field of Protector in cross selling product section
	@FindBy(xpath = "//*[@id='product_cross_sell_wrap_slider']//li[@data-sku='SC-PROT-D-75x48']")
    private WebElement CrossSellDoubleProtector75x48;
	
	@FindBy(xpath = "//*[@id='product_cross_sell_wrap_slider']//li[@data-sku='SC-PROT-D-78x48']")
    private WebElement CrossSellDoubleProtector78x48;
	
	// Webelement for Different Size dropdown field of Protector in cross selling product section
	public WebElement crossSellDoubleProtector75x48() {
		return CrossSellDoubleProtector75x48;
	}
	
	public WebElement crossSellDoubleProtector78x48() {
		return CrossSellDoubleProtector78x48;
	}
	
	//Xpath for Different Size dropdown field of Protector in cross selling product section
	@FindBy(xpath = "//span[@data-sku='SC-PROT-D-75x48']")
    private WebElement CrossSellAddToCartDoubleProtector75x48;
	
	@FindBy(xpath = "//span[@data-sku='SC-PROT-D-78x48']")
    private WebElement CrossSellAddToCartDoubleProtector78x48;

	// Webelement for Different Size dropdown field of Protector in cross selling product section
	public WebElement crossSellAddToCartDoubleProtector75x48() {
		return CrossSellAddToCartDoubleProtector75x48;
	}
		
	public WebElement crossSellAddToCartDoubleProtector78x48() {
		return CrossSellAddToCartDoubleProtector78x48;
	}
	
	//Xpath for Different Size dropdown field of Protector in cross selling product section
	@FindBy(xpath = "//*[@id='product_cross_sell_wrap_slider']//li[@data-sku='SC-PROT-Q-78x60']")
	private WebElement CrossSellQueenProtector78x60;
		
    // Webelement for Different Size dropdown field of Protector in cross selling product section
	public WebElement crossSellQueenProtector78x60() {
		return CrossSellQueenProtector78x60;
	}
		
	//Xpath for Add to cart button when Protector in cross selling product section
    @FindBy(xpath = "//span[@data-sku='SC-PROT-Q-78x60']")
	private WebElement CrossSellAddToCartQueenProtector78x60;
	
    // Webelement for Add to cart button when Protector Protector in cross selling product section
	public WebElement crossSellAddToCartQueenProtector78x60() {
		return CrossSellAddToCartQueenProtector78x60;
	}
	
	//Xpath for Defaut Add to cart button when Single Protector in cross selling product section
    @FindBy(xpath = "//span[@data-sku='SC-PROT-S-78x36']")
	private WebElement CrossSellAddToCartSingleProtector78x36;
	
    // Webelement for Add to cart button when Protector Protector in cross selling product section
	public WebElement crossSellAddToCartSingleProtector78x36() {
		return CrossSellAddToCartSingleProtector78x36;
	}
	
	//Plus mattress product in cross selling product section
	//Xpath for category field for plus mattress 
    @FindBy(xpath = "//div[@class='container_cross_sell plus on-sale']//div[@data-value='Single']")
	private WebElement CrossSellPlusMattressCategoryField;
	
    // Webelement for category field for plus mattress
	public WebElement crossSellPlusMattressCategoryField() {
		return CrossSellPlusMattressCategoryField;
	}
	
	//Xpath for category options for plus mattress 
    @FindBy(xpath = "//div[@class='container_cross_sell plus on-sale']//li[@data-value='Queen']")
	private WebElement CrossSellPlusMattressQueenCategory;
    
    @FindBy(xpath = "//div[@class='container_cross_sell plus on-sale']//li[@data-value='King']")
	private WebElement CrossSellPlusMattressKingCategory;
	
    // Webelement for category options for plus mattress
	public WebElement crossSellPlusMattressQueenCategory() {
		return CrossSellPlusMattressQueenCategory;
	}
	
	public WebElement crossSellPlusMattressKingCategory() {
		return CrossSellPlusMattressKingCategory;
	}
	
	//Xpath for Height field for plus mattress 
    @FindBy(xpath = "//div[@class='container_cross_sell plus on-sale']//div[@data-value='8 inch']")
	private WebElement CrossSellPlusMattressHeightField;
	
    // Webelement for Height field for plus mattress
	public WebElement crossSellPlusMattressHeightField() {
		return CrossSellPlusMattressHeightField;
	}
	
	//Xpath for Height field for plus mattress 
	@FindBy(xpath = "//div[@class='container_cross_sell plus on-sale']//li[@data-value='10 inch']")
	private WebElement CrossSellPlusMattressTenInchHeight;
	
    // Webelement for Height field for plus mattress
	public WebElement crossSellPlusMattressTenInchHeight() {
		return CrossSellPlusMattressTenInchHeight;
	}
	
	//Xpath for Size field for plus mattress 
    @FindBy(xpath = "//div[@class='container_cross_sell plus on-sale']//div[@class='customDropdown variations plus']")
	private WebElement CrossSellPlusMattressSizeField;
	
    // Webelement for Size field for plus mattress
	public WebElement crossSellPlusMattressSizeField() {
		return CrossSellPlusMattressSizeField;
	}
	
	//Xpath for different size options for plus mattress when king category is selected and height is 10 inch
    @FindBy(xpath = "//div[@class='container_cross_sell plus on-sale']//li[@data-sku='SC-PLUS-K-75x72x10']")
	private WebElement CrossSellPlusMattressKing75x72x10;
	
    // Webelement for for different size options for plus mattress when king category is selected and height is 10 inch
	public WebElement crossSellPlusMattressKing75x72x10() {
		return CrossSellPlusMattressKing75x72x10;
	}
	
	//Xpath for Add to cart button for plus mattress when king category is selected and height is 10 inch and size is 75x72x10
    @FindBy(xpath = "//span[@data-sku='SC-PLUS-K-75x72x10']")
	private WebElement CrossSellAddToCartPlusMattressKing75x72x10;
	
    // Webelement for Add to cart button for plus mattress when king category is selected and height is 10 inch and size is 75x72x10
	public WebElement crossSellAddToCartPlusMattressKing75x72x10() {
		return CrossSellAddToCartPlusMattressKing75x72x10;
	}
	
	//Original mattress product in cross selling product section
	//Xpath for category field for Original mattress 
	@FindBy(xpath = "//div[@class='container_cross_sell original on-sale']//div[@data-value='Single']")
	private WebElement CrossSellOriginalMattressCategoryField;
	
    // Webelement for category field for Original mattress
	public WebElement CrossSellOriginalMattressCategoryField() {
		return CrossSellOriginalMattressCategoryField;
	}
	
	//Xpath for category options for Original mattress 
    @FindBy(xpath = "//div[@class='container_cross_sell original on-sale']//li[@data-value='Queen']")
	private WebElement CrossSellOriginalMattressQueenCategory;
    
    @FindBy(xpath = "//div[@class='container_cross_sell original on-sale']//li[@data-value='King']")
	private WebElement CrossSellOriginalMattressKingCategory;
	
    // Webelement for category options for Original mattress
	public WebElement crossSellOriginalMattressQueenCategory() {
		return CrossSellOriginalMattressQueenCategory;
	}
	
	public WebElement crossSellOriginalMattressKingCategory() {
		return CrossSellOriginalMattressKingCategory;
	}
		
	//Xpath for Size field for Original mattress 
    @FindBy(xpath = "//div[@class='container_cross_sell original on-sale']//div[@class='customDropdown variations original']")
	private WebElement CrossSellOriginalMattressSizeField;
	
    // Webelement for Size field for Original mattress
	public WebElement crossSellOriginalMattressSizeField() {
		return CrossSellOriginalMattressSizeField;
	}
	
	//Xpath for different size options for Original mattress when king category is selected
    @FindBy(xpath = "//div[@class='container_cross_sell original on-sale']//li[@data-sku='SC-ORIG-K-75x72x6']")
	private WebElement CrossSellOriginalMattressKing75x72x6;
	
    // Webelement for for different size options for Original mattress when king category is selected 
	public WebElement crossSellOriginalMattressKing75x72x6() {
		return CrossSellOriginalMattressKing75x72x6;
	}
	
	//Xpath for Add to cart button for Original mattress when king category is selected and size is 75x72x6
    @FindBy(xpath = "//span[@data-sku='SC-ORIG-K-75x72x6']")
	private WebElement CrossSellAddToCartOriginalMattressKing75x72x6;
	
    // Webelement for Add to cart button for plus mattress when king category is selected and size is 75x72x6
	public WebElement crossSellAddToCartOriginalMattressKing75x72x6() {
		return CrossSellAddToCartOriginalMattressKing75x72x6;
	}
	
	//Xpath for Default add to cart button for Original mattress 
	@FindBy(xpath = "//span[@data-sku='SC-ORIG-S-72x30x6']")
	private WebElement CrossSellAddToCartOriginalMattressSingle72x30x6;
			
	// Webelement for Default add to cart button for Original mattress 
	public WebElement crossSellAddToCartOriginalMattressSingle72x30x6() {
		return CrossSellAddToCartOriginalMattressSingle72x30x6;
	}
	
	
	//Memory foam pillow product in cross selling product section
	//Xpath for category field for Memory foam pillow
	@FindBy(xpath = "//div[@class='container_cross_sell pillow ']//div[@data-value='Standard']")
	private WebElement CrossSellMemoryPillowCategoryField;
		
    // Webelement for category field for Original mattress
	public WebElement crossSellMemoryPillowCategoryField() {
		return CrossSellMemoryPillowCategoryField;
	}
		
	//Xpath for category options for Memory foam pillow 
	@FindBy(xpath = "//div[@class='container_cross_sell pillow ']//li[@data-value='President']")
	private WebElement CrossSellMemoryPillowPresidentCategory;
		
    // Webelement for category options for Memory foam pillow
	public WebElement crossSellMemoryPillowPresidentCategory() {
		return CrossSellMemoryPillowPresidentCategory;
	}
			
	//Xpath for Pack field for Memory foam pillow 
    @FindBy(xpath = "//div[@class='container_cross_sell pillow ']//div[@data-name='pack']")
	private WebElement CrossSellMemoryPillowPackField;
		
    // Webelement for Pack field for Memory foam pillow
	public WebElement crossSellMemoryPillowPackField() {
		return CrossSellMemoryPillowPackField;
	}
		
	//Xpath for different Pack options for Memory pillow when President category is selected
    @FindBy(xpath = "//div[@class='container_cross_sell pillow ']//li[@value='pillow-2']")
	private WebElement CrossSellMemoryPillowPresidentPackOfTwo;
    
    @FindBy(xpath = "//div[@class='container_cross_sell pillow ']//li[@value='pillow-4']")
	private WebElement CrossSellMemoryPillowPresidentPackOfFour;
		
    // Webelement for different Pack options for Memory pillow when President category is selected
	public WebElement crossSellMemoryPillowPresidentPackOfTwo() {
		return CrossSellMemoryPillowPresidentPackOfTwo;
	}
	
	public WebElement crossSellMemoryPillowPresidentPackOfFour() {
		return CrossSellMemoryPillowPresidentPackOfFour;
	}
		
	//Xpath for Add to cart button for Memory foam when President category is selected and Pack is two
	@FindBy(xpath = "//span[@data-sku='SC-MFPILWSET2-P-28x18']")
	private WebElement CrossSellAddToCartPresidentMemoryPillowPackTwo;
		
    // Webelement for Add to cart button for Memory foam when President category is selected and Pack is two
	public WebElement crossSellAddToCartPresidentMemoryPillowPackTwo() {
    	return CrossSellAddToCartPresidentMemoryPillowPackTwo;
	}
	
	//Pillow Case product in cross selling product section
	//Xpath for Type field for pillow case product
	@FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//span[text()='Cloud Pillow Case']")
	private WebElement CrossSellPillowCaseTypeField;
			
    // Webelement for Type field for pillow case product
	public WebElement crossSellPillowCaseTypeField() {
		return CrossSellPillowCaseTypeField;
	}
			
	//Xpath for Different Type options for pillow cases
	@FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//li[@data-value='Memory Foam Pillow Case']")
	private WebElement CrossSellMemoryCaseTypeForPillowCases;
	
	@FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//li[@data-value='Cuddle Pillow Case']")
	private WebElement CrossSellCuddleCaseTypeForPillowCases;
			
    // Webelement for Different Type options for pillow cases
	public WebElement crossSellMemoryCaseTypeForPillowCases() {
		return CrossSellMemoryCaseTypeForPillowCases;
	}
	
	public WebElement crossSellCuddleCaseTypeForPillowCases() {
		return CrossSellCuddleCaseTypeForPillowCases;
	}
				
	//Xpath for Pack field for Pillow cases
    @FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//div[@data-value='case-2']")
	private WebElement CrossSellPillowCasesPackField;
			
    // Webelement for Pack field for Pillow cases
	public WebElement crossSellPillowCasesPackField() {
		return CrossSellPillowCasesPackField;
	}
			
	//Xpath for different Pack options for pillow cases 
    @FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//li[text()='Pack of 4']")
	private WebElement CrossSellPillowCasePackOfFour;
	    
    @FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//li[text()='Pack of 8']")
	private WebElement CrossSellPillowCasePackOfEight;
			
    // Webelement for different Pack options for Memory pillow when President category is selected
	public WebElement crossSellPillowCasePackOfFour() {
		return CrossSellPillowCasePackOfFour;
	}
		
	public WebElement crossSellPillowCasePackOfEight() {
		return CrossSellPillowCasePackOfEight;
	}
			
	//Xpath for size field for Pillow case cross selling product
	@FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//div[@class='customDropdown variations pillow_case']")
	private WebElement CrossSellPillowCaseSizeField;
			
    // Webelement for size field for Pillow case cross selling product
	public WebElement crossSellPillowCaseSizeField() {
    	return CrossSellPillowCaseSizeField;
	}
	
	//Xpath for different size dropdown for pillow cases when Type is memmory foam and Pack is four
	@FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//li[@data-sku='SC-GRPILWCSSET2-S-28x18']")
	private WebElement CrossSellMemoryPillowTypePillowcasePackFour28x18;
	
	@FindBy(xpath = "//div[@class='container_cross_sell pillow_case ']//li[@data-sku='SC-GRPILWCSSET2-P-33x21']")
	private WebElement CrossSellMemoryPillowTypePillowcasePackFour33x21;
				
    // Webelement for different size dropdown for pillow cases when Type is memmory foam and Pack is four
	public WebElement crossSellMemoryPillowTypePillowcasePackFour28x18() {
    	return CrossSellMemoryPillowTypePillowcasePackFour28x18;
	}
	
	public WebElement crossSellMemoryPillowTypePillowcasePackFour33x21() {
    	return CrossSellMemoryPillowTypePillowcasePackFour33x21;
	}
	
	//Xpath for Add to cart button for pillow case when type is memory Foam and and Pack is four
	@FindBy(xpath = "//span[@data-sku='SC-GRPILWCSSET2-S-28x18']")
	private WebElement CrossSellAddToCartMemoryPillowTypePillowcasePackOfFour;
				
    // Webelement for size field for Pillow case cross selling product
	public WebElement crossSellAddToCartMemoryPillowTypePillowcasePackOfFour() {
    	return CrossSellAddToCartMemoryPillowTypePillowcasePackOfFour;
	}
	
	
	// Xpath for all the products present in Shop from our Best seller products section
	@FindBy(xpath = "//div[@id='product_page_629264']//a[@class='shop-more']")
 	private WebElement PlusMattressShopNowButton;
	 		
	@FindBy(xpath = "//div[@id='product_page_98749']//a[@class='shop-more']")
	private WebElement MemoryFoamPillowShopNowButton;
	 		
    @FindBy(xpath = "//div[@id='product_page_629227']//a[@class='shop-more']")
    private WebElement OriginalMattressShopNowButton;
	 		
	@FindBy(xpath = "//div[@id='product_page_214599']//a[@class='shop-more']")
	private WebElement ReversibleComforterShopNowButton;
	
	@FindBy(xpath = "//div[@id='product_page_214583']//a[@class='shop-more']")
	private WebElement CloudPillowShopNowButton;
	 		
	// Webelement for all the products present in Our most loved products section
	public WebElement plusMattressShopNowButton() {
	 	return PlusMattressShopNowButton; 		
	}

	public WebElement memoryFoamPillowShopNowButton() {
 		return MemoryFoamPillowShopNowButton;
 	}

 	public WebElement originalMattressShopNowButton() {
 		return OriginalMattressShopNowButton;
 	}

 	public WebElement reversibleComforterShopNowButton() {
 		return ReversibleComforterShopNowButton;
	}
 	
 	public WebElement cloudPillowShopNowButton() {
 		return CloudPillowShopNowButton;
	}
 	
 	public void plusMattressInBestSellerProductSection() 
    {		
 	  Actions productscroll = new Actions(driver); 
 	  productscroll.moveToElement(PlusMattressShopNowButton).build().perform();		
 	}
 	
 	public void memoryFoamPillowInBestSellerProductSection() 
    {		
 	  Actions productscroll = new Actions(driver); 
 	  productscroll.moveToElement(MemoryFoamPillowShopNowButton).build().perform();	
 	  
 	}
 	
 	public void originalMattressInBestSellerProductSection() 
    {		
 	  Actions productscroll = new Actions(driver); 
 	  productscroll.moveToElement(OriginalMattressShopNowButton).build().perform();		
 	}
 	
 	public void reversibleComforterInBestSellerProductSection() 
    {		
 	  Actions productscroll = new Actions(driver); 
 	  productscroll.moveToElement(ReversibleComforterShopNowButton).build().perform();		
 	}
 	
 	public void cloudPillowInBestSellerProductSection() 
    {		
 	  Actions productscroll = new Actions(driver); 
 	  productscroll.moveToElement(CloudPillowShopNowButton).build().perform();		
 	}
 	
	
	//Xpath for Cross icon of offer modal
	@FindBy(xpath = "//*[@class='soundest-form-without-image-close ']")
    private WebElement CrossIconOfoffer;
					
	// Webelement for Cross icon of offer modal
	public WebElement crossIconOfoffer() {
			return CrossIconOfoffer;
	}
	
	public void closeoffer() {
		
		try {                                                      
			CrossIconOfoffer.click();
			log.info("Clicked on First modal cross icon");
             
		} catch (Exception e) 
		{
			log.error("Offer modal is not shwoing");
		}
}


	
	/*
	 * public void selectSize() throws Exception { Actions sizeselect = new
	 * Actions(driver);
	 * sizeselect.moveToElement(SizeDropdown).click(SizeDropdown).build().perform();
	 * 
	 * }
	 */	
	
	public void quantityselect() {
		
		  Actions cart = new Actions(driver); 
		  //cart.moveToElement(QuantityField).click(QuantityField).build().perform();
          cart.moveToElement(QuantitySelection).click().build().perform();
		 
		//QuantityField.click();
		//QuantitySelection.click();	
	}
	
	//Xpath for Changed Add to cart button
	@FindBy(xpath = "//button[@class='single_add_to_cart_button btn-block alt btn-orange inverse']")
    private WebElement ChangedAddToCartButton;
						
	// Webelement for Changed Add to cart button
	public WebElement changedAddToCartButton() {
			return ChangedAddToCartButton;
	}
	
	public void scrollToDefaultAddToCart() {
		//List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));
		WebElement add1 = driver.findElementByXPath("//button[@class='single_add_to_cart_button btn-block alt']");
		Actions cart = new Actions(driver);
		cart.moveToElement(add1).build().perform();
	}
	
	public void scrollToChangedAddToCart() {
		//List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));
		WebElement add1 = driver.findElementByXPath("(//button[@class='single_add_to_cart_button btn-block alt btn-orange inverse'])[2]");
		Actions cart = new Actions(driver);
		cart.moveToElement(add1).build().perform();
	}
	
	public void scrollToChangeCategoryDefaultAddToCart() {
		//List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));
		WebElement add1 = driver.findElementByXPath("(//button[@class='single_add_to_cart_button btn-block alt disabled wc-variation-selection-needed'])[2]");
		Actions cart = new Actions(driver);
		cart.moveToElement(add1).build().perform();
	}
	
	public void scrollToBuyBundleButton() {
		//List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));
		WebElement add1 = driver.findElementByXPath("//button[@id='bundlePurchase']");
		Actions cart = new Actions(driver);
		cart.moveToElement(add1).build().perform();
	}
	
	public void defaultAddToCart() {
		//List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));//div[@class='productDirectPurchase hidden_form plus']//button[@type='button'][normalize-space()='Add To Cart']
		//WebElement add1 = driver.findElementByXPath("(//button[@class='single_add_to_cart_button btn-block alt'])[2]");
		WebElement add1 = driver.findElementByXPath("//button[@class='single_add_to_cart_button btn-block alt']");
		Actions cart = new Actions(driver);
		cart.moveToElement(add1).click(add1).build().perform();
	}
	
	public void changedaddToCart() {
		//List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));//div[@class='productDirectPurchase hidden_form plus']//button[@type='button'][normalize-space()='Add To Cart']
		WebElement add1 = driver.findElementByXPath("(//button[@class='single_add_to_cart_button btn-block alt btn-orange inverse'])[2]");
		Actions cart = new Actions(driver);
		cart.moveToElement(add1).click(add1).build().perform();
	}

}
