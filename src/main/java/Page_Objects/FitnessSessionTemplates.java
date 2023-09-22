package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FitnessSessionTemplates extends SoloSettings_AbstractComponents
{

	WebDriver driver;
	public FitnessSessionTemplates(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div/div/div/div/div/h2")
	WebElement fitnessSessionTitle;
	
	public WebElement fitnessSessionTitle()
	{
		return fitnessSessionTitle;
	}
	
	@FindBy(xpath="//span[text()='+ ADD NEW FITNESS SESSION']")
	WebElement addFitnessSession;
	
	public WebElement addFitnessSession()
	{
		waitForElementToBeClickable(addFitnessSession);
		return addFitnessSession;
	}
	
	@FindBy(css="input[name='className']")
	WebElement enterSessionName;
	
	public WebElement enterSessionName()
	{
		waitForElementToBeClickable(enterSessionName);
		return enterSessionName;
	}
	
	@FindBy(css="div[id='mui-component-select-classType']")
	WebElement selectSessionType;
	
	public WebElement selectSessionType()
	{
		return selectSessionType;
	}
	
	@FindBy(xpath="//div/ul/li")
	WebElement selectSession_yoga;
	
	public WebElement selectSession_yoga()
	{
		return selectSession_yoga;
	}
	
	@FindBy(css="div[id='mui-component-select-classDuration']")
	WebElement selectClassDuration;
	
	public WebElement selectClassDuration()
	{
		return selectClassDuration;
	}
	
	@FindBy(xpath="//ul/li[4]")
	WebElement selectClassDuration_1hr;
	
	public WebElement selectClassDuration_1hr()
	{
		return selectClassDuration_1hr;
	}
	
	@FindBy(css="textarea[name='description']")
	WebElement enterDescription;
	
	public WebElement enterDescription()
	{
		return enterDescription;
	}
	
	@FindBy(css="input[name='instructors']")
	WebElement addInstructors;
	
	public WebElement addInstructors()
	{
		return addInstructors;
	}
	
	@FindBy(css="li[role='option'] div div span span:nth-child(1)")
	WebElement selectInstructorCheckbox;
	
	public WebElement selectInstructorCheckbox()
	{
		waitForElementToBeClickable(selectInstructorCheckbox);
		return selectInstructorCheckbox;	
	}
	
	@FindBy(css="div[id='mui-component-select-revenueCategory']")
	WebElement selectServices;
	
	public WebElement selectServices()
	{
		return selectServices;
	}
	
	@FindBy(css="ul li")
	WebElement selectServices_nutrition;
	
	public WebElement selectServices_nutrition()
	{
		return selectServices_nutrition;
	}

	@FindBy(xpath="//span[text()='SAVE Fitness Session']")
	WebElement saveFitnessSession;
	
	public WebElement saveFitnessSession()
	{
		waitForElementToBeClickable(saveFitnessSession);
		return saveFitnessSession;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div/div[1]")
	WebElement copyFitnessSession;
	
	public WebElement copyFitnessSession()
	{
		return copyFitnessSession;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div/div[1]")
	WebElement deleteFitnessSession;
	
	public WebElement deleteFitnessSession()
	{
		return deleteFitnessSession;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement fitnessSession_previousStep;
	
	public WebElement fitnessSession_previousStep()
	{
		return fitnessSession_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement fitnessSession_saveAndContinue;
	
	public WebElement fitnessSession_saveAndContinue()
	{
		waitForElementToBeClickable(fitnessSession_saveAndContinue);
		return fitnessSession_saveAndContinue;
	}
}
