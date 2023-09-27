package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientWaiver extends SoloSettings_AbstractComponents
{
	WebDriver driver;
	
	public ClientWaiver(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement clientWaiver_title;
	
	public WebElement clientWaiver_title()
	{
		return clientWaiver_title;
	}
	
	@FindBy(xpath="//div[@class='dropzone']/div/button")
	WebElement uploadWaiver_browse;
	
	public WebElement uploadWaiver_browse()
	{
		waitForVisibilityOfElement(uploadWaiver_browse);
		return uploadWaiver_browse;
	}
	
	@FindBy(css="div[class*='MuiBox-root'] span[class*='MuiTypography']")
	WebElement uploadedWaiverFile;
	
	@FindBy(css="input[type='text']")
	WebElement enterWaiverTerm1;
	
	public WebElement enterWaiverTerm1()
	{
		waitForVisibilityOfElement(uploadedWaiverFile);
		waitForElementToBeClickable(enterWaiverTerm1);
		return enterWaiverTerm1;
	}
	
	@FindBy(xpath="//span[text()='+ ADD Term & Conditions']")
	WebElement addWaiverTerm;
	
	public WebElement addWaiverTerm()
	{
		return addWaiverTerm;
	}
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container'][1]/div/div/div/p")
	WebElement waiverTerm1;
	
	public WebElement enterWaiverTerm2()
	{
		waitForVisibilityOfElement(waiverTerm1);
		waitForElementToBeClickable(enterWaiverTerm1);
		return enterWaiverTerm1;
	}
	
	@FindBy(css="button[aria-label='edit']")
	WebElement edit1stWaiverTerm;
	
	public WebElement edit1stWaiverTerm()
	{
		return edit1stWaiverTerm;
	}
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[1]/div/div/div/button[2]")
	WebElement delete1stWaiverTerm;
	
	public WebElement delete1stWaiverTerm()
	{
		return delete1stWaiverTerm;
	}
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[2]/div[2]/div[2]/button")
	WebElement cancelWaiverTerm;
	
	public WebElement cancelWaiverTerm()
	{
		return cancelWaiverTerm;
	}
		
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement waiverPreviousStep;
	
	public WebElement waiverPreviousStep()
	{
		return waiverPreviousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE FOR LATER']")
	WebElement waiverSaveForLater;
	
	public WebElement waiverSaveForLater()
	{
		return waiverSaveForLater;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement waiverSaveAndContinue;

	public WebElement waiverSaveAndContinue()
	{
		waitForVisibilityOfElements(waiverTerm1);
		waitForElementToBeClickable(waiverSaveAndContinue);
		return waiverSaveAndContinue;
	}

}
