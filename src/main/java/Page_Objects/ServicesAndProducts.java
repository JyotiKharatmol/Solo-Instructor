package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesAndProducts extends SoloSettings_AbstractComponents
{

	WebDriver driver;
	public ServicesAndProducts(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="form div div div h2")
	WebElement servicesAndProducts_pageTitle;
	
	public WebElement servicesAndProducts_pageTitle()
	{
		waitForAttributeOfElement(servicesAndProductsToolTip,"aria-label","If you offer Group Classes, 1:1 Personal Training, provide Nutrition Consultations, or Apparel, enter those here");
		return servicesAndProducts_pageTitle;
	}
	
	@FindBy(css="svg[aria-label*='Group Classes']")
	WebElement servicesAndProductsToolTip;
	
	@FindBy(css="input[type='text']")
	WebElement enterServiceOrProduct;
	
	public WebElement enterServiceOrProduct()
	{
		waitForVisibilityOfElement(enterServiceOrProduct);
		waitForElementToBeClickable(enterServiceOrProduct);
		return enterServiceOrProduct;
	}

	@FindBy(xpath="//span[text()='+ Add Category']")
	WebElement addCategory;
	
	public WebElement addCategory()
	{
		return addCategory;
	}
	
	@FindBy(css="p[class*='Mui-error']")
	WebElement servicesAndProducts_ErrorMessage;
	
	public WebElement servicesAndProducts_ErrorMessage()
	{
		return servicesAndProducts_ErrorMessage;
	}
	
	@FindBy(xpath="//form/div/div[3]/div/div/div[1]/div/div/div/button")
	WebElement servicesAndProducts_deleteButton;
	
	public WebElement servicesAndProducts_deleteButton()
	{
		return servicesAndProducts_deleteButton;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement servicesAndProducts_previousStep;
	
	public WebElement servicesAndProducts_previousStep()
	{
		return servicesAndProducts_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE FOR LATER']")
	WebElement servicesAndProducts_saveForLater;
	
	public WebElement servicesAndProducts_saveForLater()
	{
		return servicesAndProducts_saveForLater;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement servicesAndProducts_saveAndContinue;

	public WebElement servicesAndProducts_saveAndContinue()
	{
		return servicesAndProducts_saveAndContinue;
	}	
}
