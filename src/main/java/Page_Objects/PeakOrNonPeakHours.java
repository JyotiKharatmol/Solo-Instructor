package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeakOrNonPeakHours extends Solo_AbstractComponents
{

	WebDriver driver;
	
	public PeakOrNonPeakHours(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//label[2]/span[1]/span[1]")
	WebElement peakOrNonPeakHours_No;
	
	public WebElement peakOrNonPeakHours_No()
	{
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
		waitForVisibilityOfElement(peakOrNonPeakHours_saveAndContinue);
		return peakOrNonPeakHours_saveAndContinue;
	}
	
	
}
