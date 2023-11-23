package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.SoloSettings_AbstractComponents;

public class Calendar extends SoloSettings_AbstractComponents
{
	WebDriver driver;
	
	public Calendar(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='ADD SESSION']")
	WebElement addSession;
	
	public WebElement addSession()
	{
		waitForElementToBeClickable(addSession);
		return addSession;
	}
	
	@FindBy(css="input[name='classId']")
	WebElement selectSession;
	
	public WebElement selectSession()
	{
		waitForElementToBeClickable(selectSession);
		return selectSession;
	}
	
	@FindBy(css="ul li")
	WebElement selectSession_yogaBeginner;
	
	public WebElement selectSession_yogaBeginner()
	{
		waitForElementToBeClickable(selectSession_yogaBeginner);
		return selectSession_yogaBeginner;
	}
	
	@FindBy(css="input[name='studioId']")
	WebElement selectStudio;
	
	public WebElement selectStudio()
	{
		return selectStudio;
	}
	
	@FindBy(css="ul li")
	WebElement selectStudio_studio;
	
	public WebElement selectStudio_studio()
	{
		waitForElementToBeClickable(selectStudio_studio);
		return selectStudio_studio;
	}
	
	@FindBy(css="div[inputMode='numeric'] div input")
	WebElement capacity;
	
	public WebElement capacity()
	{
		return capacity;
	}
	
	@FindBy(css="button[aria-label='change date'] span svg")
	WebElement selectDate_datepicker;
	
	public WebElement selectDate_datepicker()
	{
		return selectDate_datepicker;
	}
	
	@FindBy(css="button[class*='daySelected']")
	WebElement selectDate_todayDate;
	
	public WebElement selectDate_todayDate()
	{
		waitForElementToBeClickable(selectDate_todayDate);
		return selectDate_todayDate;
	}
	
	@FindBy(css="div input[name='startTime']")
	WebElement startTime;
	
	public WebElement startTime()
	{
		return startTime;
	}
	
	@FindBy(css="div input[name='endTime']")
	WebElement endTime;
	
	public WebElement endTime()
	{
		return endTime;
	}
	
	@FindBy(css="button[aria-describedby='recurring-class-popup']")
	WebElement setRecurrence;
	
	public WebElement setRecurrence()
	{
		waitForElementToBeClickable(setRecurrence);
		return setRecurrence;
	}
	
	@FindBy(css="div[id*='select-periodOfTime']")
	WebElement selectPeriodOfTime;
	
	public WebElement selectPeriodOfTime()
	{
		waitForElementToBeClickable(selectPeriodOfTime);
		return selectPeriodOfTime;
	}
	
	@FindBy(css="ul li")
	WebElement selectPeriodOfTime_week;
	
	public WebElement selectPeriodOfTime_week()
	{
		waitForElementToBeClickable(selectPeriodOfTime_week);
		return selectPeriodOfTime_week;
	}
	
	@FindBy(css="label[id='Sat']")
	WebElement repeatDays_sat;
	
	public WebElement repeatDays_sat()
	{
		return repeatDays_sat;
	}
	
	@FindBy(css="input[name='until']")
	WebElement recurringSession_untilDate;
	
	public WebElement recurringSession_untilDate()
	{
		return recurringSession_untilDate;
	}
	
	@FindBy(xpath="//div[@id='recurring-class-popup']/div/div/div/div[6]/div/div/div/button")
	WebElement save_recurringSessionModal;
	
	public WebElement save_recurringSessionModal()
	{
		return save_recurringSessionModal;
	}
	
	@FindBy(xpath="//span[text()='SAVE']")
	WebElement saveSession;
	
	public WebElement saveSession()
	{
		return saveSession;
	}
	
}
