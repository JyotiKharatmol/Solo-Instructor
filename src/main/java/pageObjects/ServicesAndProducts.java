package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.SoloSettings_AbstractComponents;

public class ServicesAndProducts extends SoloSettings_AbstractComponents
{

	WebDriver driver;
	public ServicesAndProducts(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement servicesAndProducts_title;
	
	public WebElement servicesAndProducts_title()
	{
		waitForVisibilityOfElement(servicesAndProducts_title);
		return servicesAndProducts_title;
	}
	
	@FindBy(css="h4 span")
	WebElement servicesAndProducts_topElements;
	
	@FindBy(css="div[class*='center'] div")
	WebElement servicesAndProducts_bottomElements;
	
	@FindBy(css="input[type='text']")
	WebElement enterServiceOrProduct;
	
	public WebElement enterServiceOrProduct()
	{	
		waitForVisibilityOfElements(servicesAndProducts_topElements);
		waitForVisibilityOfElements(servicesAndProducts_bottomElements);
		waitForVisibilityOfElement(addCategory);
		waitForElementToBeClickable(enterServiceOrProduct);
		return enterServiceOrProduct;
	}

	@FindBy(xpath="//span[text()='+ Add Category']")
	WebElement addCategory;
	
	public WebElement addCategory()
	{
		return addCategory;
	}
	
	@FindBy(css="div[class*='grid'] p")
	WebElement serviceAndProducts_1stcategory;
	
	public WebElement serviceAndProducts_1stcategory()
	{
		waitForVisibilityOfElement(serviceAndProducts_1stcategory);
		return serviceAndProducts_1stcategory;
	}
	
	@FindBy(css="p[class*='Mui-error']")
	WebElement servicesAndProducts_ErrorMessage;
	
	public WebElement servicesAndProducts_ErrorMessage()
	{
		return servicesAndProducts_ErrorMessage;
	}
	
	@FindBy(css="button[aria-label='delete']")
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
	
	@FindBy(css="button[class*='disabled']")
	WebElement servicesAndProducts_saveAndContinueDisabled;
	
	public WebElement servicesAndProducts_saveAndContinueDisabled()
	{
		return servicesAndProducts_saveAndContinueDisabled;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement servicesAndProducts_saveAndContinue;

	public WebElement servicesAndProducts_saveAndContinue()
	{
		waitForElementToBeClickable(servicesAndProducts_saveAndContinue);
		return servicesAndProducts_saveAndContinue;
	}	
}
