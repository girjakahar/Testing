package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	
	static RemoteWebDriver driver;

    public Header(RemoteWebDriver driver) throws Exception
   {
    this.driver = driver; 
    PageFactory.initElements(driver, this);
   }


    //Xpath for login Menu links
    @FindBy(xpath = "//a[text()='Login']")
    private WebElement Login;
    
    //Webelement for login Menu links
    public WebElement loginHeader() {
  		return Login;
  	}
    
  	
	//Mattress and its products dropdown links
    @FindBy(xpath = "//a[text()='Mattress']")
    private WebElement MattressHeader;

    //@FindBy(xpath = "//a[text()='Original Mattress – 6″']")
    @FindBy(xpath = "//a[text()='Original Mattress – 6 inch']")
    private WebElement OriginalMattressMenu;

    //@FindBy(xpath = "//a[text()='Latex Mattress – 7″']")
    @FindBy(xpath = "//a[text()='Latex Mattress – 7 inch']")
    private WebElement LatexMattressMenu;
    
    //@FindBy(xpath = "//a[text()='Plus Mattress – 8″ & 10″']")
    @FindBy(xpath = "//a[text()='Plus Mattress – 8 & 10 inch']")
    private WebElement PlusMattressMenu;

    @FindBy(xpath = "//a[text()='Baby Mattress']")
    private WebElement BabyMattressMenu;

    @FindBy(xpath = "//a[text()='Compare Page']")
    private WebElement CompareMattressMenu;
	
	//Webelements for Mattress and its products dropdown links
	public WebElement mattressHeader() {
		return MattressHeader;
	}
	
	public WebElement originalMattressMenu() {
		return OriginalMattressMenu;
	}
	
	public WebElement latexMattressMenu() {
		return LatexMattressMenu;
	}
	
	public WebElement plusMattressMenu() {
		return PlusMattressMenu;
	}
    
	public WebElement babyMattressMenu() {
		return BabyMattressMenu;
	}
	
	public WebElement compareMattressMenu() {
		return CompareMattressMenu;
	}
	
	//Xpath for Track order option in header
	@FindBy(xpath = "//ul[@id='menu-new_head_sec_menu']//a[text()='Track Order']")
    private WebElement TrackOrder;
					
    //Webelements for Track order option in header
	public WebElement trackOrder() {
		return TrackOrder;
	}
	
	//Xpath for Review option in header
	@FindBy(xpath = "//ul[@id='menu-new_head_sec_menu']//a[text()='Reviews']")
	private WebElement Review;
						
	//Webelements for Review option in header
	public WebElement review() {
		return Review;
	}
	
	//Xpath for FAQ option in header
	@FindBy(xpath = "//ul[@id='menu-new_head_sec_menu']//a[text()='FAQs']")
	private WebElement Faq;
							
	//Webelements for FAQ option in header
	public WebElement faq() {
		return Faq;
	}
	
	//Xpath for Contact option in header
    @FindBy(xpath = "//ul[@id='menu-new_head_sec_menu']//a[text()='Contact']")
	private WebElement Contact;
								
    //Webelements for Contact option in header
	public WebElement contact() {
		return Contact;
	}
				
	
	
	
	// Xpath for cart icon 
	@FindBy(xpath = "//li[@class='crticn']//a")
    private WebElement CartIcon;
		
	//Webelement Xpath for cart icon
	public WebElement cartIcon() {
		return CartIcon;
	}	
	
	
	//Xpath for Bedding and its products dropdown links
	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Protector']")
    private WebElement ProtectorMenu;
    
    @FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Comforter']")
    private WebElement ComforterMenu;

    @FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Weighted Blanket']")
    private WebElement WeightedBlanketMenu;

    @FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Pet Bed']")
    private WebElement PetBedMenu;
		
	//Webelements for Bedding products dropdown links	
	public WebElement protectorMenu() {
		return ProtectorMenu;
	}
		
	public WebElement comforterMenu() {
		return ComforterMenu;
	}
		
	public WebElement weightedBlanketMenu() {
		return WeightedBlanketMenu;
	}
	
	public WebElement petBedMenu() {
		return PetBedMenu;
	}
	
	
	//Xpath for Pillow products dropdown links
	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Cloud Pillow']")
    private WebElement CloudPillowMenu;
    
    @FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Memory Foam Pillow']")
    private WebElement MemoryFoamPillowMenu;

    @FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Cuddle Pillow']")
    private WebElement CuddlePillowMenu;

    @FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Pillow Case']")
    private WebElement PillowCaseMenu;
			
	//Webelements for Pillow products dropdown links	
	public WebElement cloudPillowMenu() {
		return CloudPillowMenu;
	}
			
	public WebElement memoryFoamPillowMenu() {
		return MemoryFoamPillowMenu;
	}
			
	public WebElement cuddlePillowMenu() {
		return CuddlePillowMenu;
	}
	
	public WebElement pillowCaseMenu() {
		return PillowCaseMenu;
	}
	
	
	//Xpath for Bed products dropdown links
	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Ohayo Bed']")
    private WebElement OhayoBedMenu;

    @FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Metal Bed Frame']")
    private WebElement MetalBedFrameMenu;
				
	//Webelements for Bed products dropdown links	
	public WebElement ohayoBedMenu() {
		return OhayoBedMenu;
	}
			
	public WebElement metalBedFrameMenu() {
		return MetalBedFrameMenu;
	}
	
	
	//Xpath for Land and MYAccount xpath section
	@FindBy(xpath = "//div[@class='desktop_header']//div[3]")
    private WebElement BannerDiscountText;

    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement MyAccount;
    
	//Webelement for LandTxt and myaccount link
	public WebElement bannerDiscountText() {
		return BannerDiscountText;
	}
	
	public WebElement myAccount() {
		return MyAccount;
	}
	
	public void mattHeader() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();
	}
	
	public void originalMattressProduct() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();
		OriginalMattressMenu.click();
	}
	
	public void latexMattressProduct() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();
		LatexMattressMenu.click();
	}
	
	public void plusMattressProduct() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();
		PlusMattressMenu.click();
	}
	
	public void babyMattressProduct() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();
		BabyMattressMenu.click();
	}
	
	public void beddingHeader() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bedding']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();

	}
	
	public void protectorProducts() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bedding']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		ProtectorMenu.click();
	}
	
	public void comforterProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bedding']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		ComforterMenu.click();

	}
	
	public void weightedBlanketProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bedding']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		WeightedBlanketMenu.click();

	}
	
	public void petBedProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bedding']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		PetBedMenu.click();

	}
	
	public void pillowHeader() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Pillows']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();

	}
	
	public void cloudPillowProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Pillows']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		CloudPillowMenu.click();

	}
	
	public void memoryFoamPillowProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Pillows']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		MemoryFoamPillowMenu.click();
	}
	
	public void cuddlePillowProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Pillows']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		CuddlePillowMenu.click();

	}
	
	public void pillowCaseProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Pillows']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		PillowCaseMenu.click();
	}
	
	public void bedHeader() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bed']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();

	}
	
	public void ohayoBedProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bed']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		OhayoBedMenu.click();
	}
	
	public void metalBedFrameProduct() {
		WebElement scrollbedding = driver.findElement(By.xpath("//a[text()='Bed']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollbedding).build().perform();
		MetalBedFrameMenu.click();
	}
	
	public void pillowMenulinkOnHeader() {
		WebElement scrollToPillowMenu = driver.findElement(By.xpath("//a[text()='Pillows']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollToPillowMenu).build().perform();
		scrollToPillowMenu.click();
	}
	
	public void compareMenuLinkOnHeader() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();
		CompareMattressMenu.click();

	}

}
