package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeakOrNonPeakHours extends SoloSettings_AbstractComponents
{

	WebDriver driver;
	
	public PeakOrNonPeakHours(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement peakOrNonPeakHours_title;
	
	public WebElement peakOrNonPeakHours_title()
	{
		waitForVisibilityOfElement(peakOrNonPeakHours_title);
		return peakOrNonPeakHours_title;
	}
	
	@FindBy(css="div[class*='grid'] span")
	WebElement peakOrNonPeakHours_allElements;
	
	@FindBy(css="div[role='radiogroup'] label:nth-child(1) span:nth-child(1) span:nth-child(1)")
	WebElement peakOrNonPeakHours_Yes;	
		
	@FindBy(css="div[role='radiogroup'] label:nth-child(2) span:nth-child(1) span:nth-child(1)")
	WebElement peakOrNonPeakHours_No;
	
	public WebElement peakOrNonPeakHours_No()
	{
		waitForVisibilityOfElements(peakOrNonPeakHours_allElements);
		waitForVisibilityOfElement(peakOrNonPeakHours_No);
		return peakOrNonPeakHours_No;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement peakOrNonPeakHours_previousStep;
	
	public WebElement peakOrNonPeakHours_previousStep()
	{
		return peakOrNonPeakHours_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE FOR LATER']")
	WebElement peakOrNonPeakHours_saveForLater;
	
	public WebElement peakOrNonPeakHours_saveForLater()
	{
		return peakOrNonPeakHours_saveForLater;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement peakOrNonPeakHours_saveAndContinue;

	public WebElement peakOrNonPeakHours_saveAndContinue()
	{
		waitForElementToBeClickable(peakOrNonPeakHours_saveAndContinue);
		return peakOrNonPeakHours_saveAndContinue;
	}
	
	
}
