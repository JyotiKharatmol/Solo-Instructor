package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.SoloSettings_AbstractComponents;

public class SessionsSettings extends SoloSettings_AbstractComponents
{

	WebDriver driver;
	public SessionsSettings(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="div[class*='center'] h2")
	WebElement sessionSettings_title;
	
	public WebElement sessionSettings_title()
	{
		waitForVisibilityOfElement(sessionSettings_title);
		return sessionSettings_title;
	}
	
	@FindBy(css="h4 span")
	WebElement sessionSettings_topElements;
	
	@FindBy(css="div[class*='center'] div")
	WebElement sessionSettings_bottomElements;
	
	@FindBy(css="div input[type='text']")
	WebElement enterSessionType;
	
	public WebElement enterSessionType()
	{
		waitForVisibilityOfElements(sessionSettings_topElements);
		waitForVisibilityOfElements(sessionSettings_bottomElements);
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
	
	@FindBy(css="div[class*='grid'] p")
	WebElement newSessionAdded;
	
	public WebElement newSessionAdded()
	{
		waitForVisibilityOfElement(newSessionAdded);
		return newSessionAdded;
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
		waitForElementToBeClickable(sessionSettings_SaveAndContinue);
		return sessionSettings_SaveAndContinue;
	}
	
	
}
