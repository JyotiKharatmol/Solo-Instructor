package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Packages extends SoloSettings_AbstractComponents
{

	WebDriver driver;
	public Packages(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement packages_title;
	
	public WebElement packages_title()
	{
		waitForVisibilityOfElement(packages_title);
		return packages_title;
	}
	
	@FindBy(xpath="//span[text()='+ CREATE SESSION PACK']")
	WebElement createSessionPack;
	
	public WebElement createSessionPack()
	{
		return createSessionPack;
	}
	
	@FindBy(xpath="//label[@class='MuiFormControlLabel-root'][1]/span[1]/span[1]")
	WebElement clientType_newClients;
	
	public WebElement clientType_newClients()
	{
		waitForElementToBeClickable(clientType_newClients);
		return clientType_newClients;
	}
	
	@FindBy(xpath="//label[@class='MuiFormControlLabel-root'][2]/span[1]/span[1]")
	WebElement clientType_introClients;
	
	public WebElement clientType_introClients()
	{
		return clientType_introClients;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement clientType_continue;
	
	public WebElement clientType_continue()
	{
		waitForVisibilityOfElement(clientType_continue);
		waitForElementToBeClickable(clientType_continue);
		return clientType_continue;
	}
	
	@FindBy(css="input[name='classpackName']")
	WebElement enterNameOfSessionPack;
	
	public WebElement enterNameOfSessionPack()
	{
		waitForElementToBeClickable(clientType_continue);
		return enterNameOfSessionPack;
	}
	
	@FindBy(xpath="//div[@inputmode='numeric']/div/input")
	WebElement enterNumberOfSessionsForSessionPack;
	
	public WebElement enterNumberOfSessionsForSessionPack()
	{
		return enterNumberOfSessionsForSessionPack;
	}
	
	@FindBy(css="div[id*='select-timeSlot']")
	WebElement selectTimes;
	
	public WebElement selectTimes()
	{
		return selectTimes;
	}
	
	@FindBy(css="ul li:nth-child(1)")
	WebElement selectTimesForSessionPack_anyTime;
	
	public WebElement selectTimesForSessionPack_anyTime()
	{
		waitForElementToBeClickable(selectTimesForSessionPack_anyTime);
		return selectTimesForSessionPack_anyTime;
	}
	
	@FindBy(xpath="//div[@role='radiogroup']/label[2]/span[1]/span[1]")
	WebElement selectNoPurchaseLimitForSessionPack;
	
	public WebElement selectNoPurchaseLimitForSessionPack()
	{
		return selectNoPurchaseLimitForSessionPack;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement sessionPackDetails_continue;
	
	public WebElement sessionPackDetails_continue()
	{
		waitForElementToBeClickable(sessionPackDetails_continue);
		return sessionPackDetails_continue;
	}
	
	@FindBy(css="input[type='text']")
	WebElement priceOfSessionPack;
	
	public WebElement priceOfSessionPack()
	{
		waitForElementToBeClickable(priceOfSessionPack);
		return priceOfSessionPack;
	}
	
	@FindBy(css="div[id='mui-component-select-expireTimePeriod']")
	WebElement selectPackageExpiry;
	
	public WebElement selectPackageExpiry()
	{
		return selectPackageExpiry;
	}
	
	@FindBy(css="ul li:nth-child(7)")
	WebElement selectPackageExpiry_1yr;
	
	public WebElement selectPackageExpiry_1yr()
	{
		waitForElementToBeClickable(selectPackageExpiry_1yr);
		return selectPackageExpiry_1yr;
	}
	
	@FindBy(css="div[id='mui-component-select-expireEvent']")
	WebElement selectFromEvent;
	
	public WebElement selectFromEvent()
	{
		return selectFromEvent;
	}
	
	@FindBy(css="ul li:nth-child(1)")
	WebElement selectFromEvent_dateOfPurchase;
	
	public WebElement selectFromEvent_dateOfPurchase()
	{
		waitForElementToBeClickable(selectFromEvent_dateOfPurchase);
		return selectFromEvent_dateOfPurchase;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement pricing_continue;
	
	public WebElement pricing_continue()
	{
		waitForElementToBeClickable(pricing_continue);
		return pricing_continue;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement confirmation_continue;
	
	public WebElement confirmation_continue()
	{
		waitForElementToBeClickable(confirmation_continue);
		return confirmation_continue;
	}
	
	@FindBy(css="a[href*='copy']")
	WebElement sessionPack_copy;
	
	public WebElement sessionPack_copy()
	{
		waitForElementToBeClickable(sessionPack_copy);
		return sessionPack_copy;
	}
	
	@FindBy(xpath="//span[text()='+ CREATE MEMBERSHIP']")
	WebElement createMembership;
	
	public WebElement createMembership()
	{
		waitForVisibilityOfElement(createMembership);
		return createMembership;
	}
	
	@FindBy(css="input[name='membershipName']")
	WebElement enterNameOfMemPack;
	
	public WebElement enterNameOfMemPack()
	{
		return enterNameOfMemPack;
	}
	
	@FindBy(css="div[id='mui-component-select-length']")
	WebElement selectLengthOfMemPack;
	
	public WebElement selectLengthOfMemPack()
	{
		return selectLengthOfMemPack;
	}
	
	@FindBy(css="ul li:nth-child(4)")
	WebElement selectLength12Month;
	
	public WebElement selectLength12Month()
	{
		return selectLength12Month;
	}
	
	@FindBy(css="input[name='clientCanAttend']")
	WebElement enterNumberOfSessionsForMemPack;
	
	public WebElement enterNumberOfSessionsForMemPack()
	{
		return enterNumberOfSessionsForMemPack;
	}
	
	@FindBy(css="div[id='mui-component-select-timePeriod']")
	WebElement selectSessionsTimePeriod;
	
	public WebElement selectSessionsTimePeriod()
	{
		return selectSessionsTimePeriod;
	}
	
	@FindBy(css="ul li:nth-child(2)")
	WebElement selectSessionsTimePeriodMonthly;
	
	public WebElement selectSessionsTimePeriodMonthly()
	{
		return selectSessionsTimePeriodMonthly;
	}
	
	@FindBy(css="ul li:nth-child(3)")
	WebElement selectTimesForMemPack_anyTime;
	
	public WebElement selectTimesForMemPack_anyTime()
	{
		return selectTimesForMemPack_anyTime;
	}
	
	@FindBy(xpath="//div[@aria-label='purchase-limit']/label[2]/span[1]/span[1]")
	WebElement selectNoPurchaseLimitForMemPack;
	
	public WebElement selectNoPurchaseLimitForMemPack()
	{
		return selectNoPurchaseLimitForMemPack;
	}
	
	@FindBy(xpath="//div[@aria-label='allow-rollover']/label[1]/span[1]/span[1]")
	WebElement allowRolloverOfUnusedSessions;
	
	public WebElement allowRolloverOfUnusedSessions()
	{
		return allowRolloverOfUnusedSessions;
	}
	
	@FindBy(css="div[id*='select-chargeTimePeriod']")
	WebElement selectPackageChargeTimePeriod;
	
	public WebElement selectPackageChargeTimePeriod()
	{
		return selectPackageChargeTimePeriod;
	}
	
	@FindBy(css="ul li:nth-child(2)")
	WebElement selectMonthlyPackageChargeTimePeriod;
	
	public WebElement selectMonthlyPackageChargeTimePeriod()
	{
		return selectMonthlyPackageChargeTimePeriod;
	}
	
	@FindBy(css="div[id*='select-chargeEvent']")
	WebElement selectPackageChargeFromEvent;
	
	public WebElement selectPackageChargeFromEvent()
	{
		return selectPackageChargeFromEvent;
	}
	
	@FindBy(css="ul li:nth-child(1)")
	WebElement selectPackageChargeFromEventDateOfPurchase;
	
	public WebElement selectPackageChargeFromEventDateOfPurchase()
	{
		return selectPackageChargeFromEventDateOfPurchase;
	}
	
	@FindBy(css="a[href*='membership/copy'] img")
	WebElement copyMemPack;
	
	public WebElement copyMemPack()
	{
		waitForVisibilityOfElement(copyMemPack);
		return copyMemPack;
	}
	
	@FindBy(css="ul li")
	WebElement clientCanAttendUnlimitedSessions;
	
	public WebElement clientCanAttendUnlimitedSessions()
	{
		waitForVisibilityOfElement(clientCanAttendUnlimitedSessions);
		return clientCanAttendUnlimitedSessions;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement packages_previousStep;
	
	public WebElement packages_previousStep()
	{
		return packages_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement packages_saveAndContinue;

	public WebElement packages_saveAndContinue()
	{
		waitForVisibilityOfElement(packages_previousStep);
		waitForElementToBeClickable(packages_saveAndContinue);
		return packages_saveAndContinue;
	}
	
	@FindBy(xpath="//span[text()='SKIP']")
	WebElement packages_skip;
	
	public WebElement packages_skip()
	{
		waitForElementToBeClickable(packages_skip);
		return packages_skip;
	}
	
}
