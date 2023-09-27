package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SessionsSettings extends SoloSettings_AbstractComponents{

	WebDriver driver;
	public SessionsSettings(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="form div div div h2")
	WebElement sessionSettings_pageTitle;
	
	public WebElement sessionSettings_pageTitle()
	{
		return sessionSettings_pageTitle;
	}
	
	@FindBy(css="div input[type='text']")
	WebElement enterSessionType;
	
	public WebElement enterSessionType()
	{
		waitForVisibilityOfElement(addSessionType);
		waitForElementToBeClickable(enterSessionType);
		return enterSessionType;
	}

	@FindBy(xpath="//span[text()='+ Add Session Type']")
	WebElement addSessionType;
	
	public WebElement addSessionType()
	{
		return addSessionType;
	}
	
	@FindBy(css="p[class*='Mui-error']")
	WebElement enterSession_ErrorMessage;
	
	public WebElement enterSession_ErrorMessage()
	{
		return enterSession_ErrorMessage;
	}
	
	@FindBy(css="button[aria-label='delete']")
	WebElement sessionDelete;
	
	public WebElement sessionDelete()
	{
		return sessionDelete;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement sessionSettings_PreviousStep;
	
	public WebElement sessionSettings_PreviousStep()
	{
		return sessionSettings_PreviousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE FOR LATER']")
	WebElement sessionSettings_SaveForLater;
	
	public WebElement sessionSettings_SaveForLater()
	{
		return sessionSettings_SaveForLater;
	}
	
	@FindBy(css="button[class*='disabled']")
	WebElement sessionSettings_saveAndContinueDisabled;
	
	public WebElement sessionSettings_saveAndContinueDisabled()
	{
		return sessionSettings_saveAndContinueDisabled;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement sessionSettings_SaveAndContinue;

	public WebElement sessionSettings_SaveAndContinue()
	{
		waitForVisibilityOfElement(sessionDelete);
		waitForElementToBeClickable(sessionSettings_SaveAndContinue);
		return sessionSettings_SaveAndContinue;
	}
	
	
}
