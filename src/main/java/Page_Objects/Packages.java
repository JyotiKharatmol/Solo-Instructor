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
	
	@FindBy(css="div h6")
	WebElement packages_description;
	
	@FindBy(css="div h4")
	WebElement packages_memAndSessionPackDescription;
	
	@FindBy(css="div[class*='center'] div")
	WebElement packages_bottomElements;
	
	@FindBy(xpath="//span[text()='+ CREATE MEMBERSHIP']")
	WebElement createMembership;
	
	public WebElement createMembership()
	{
		waitForVisibilityOfElement(packages_description);
		waitForVisibilityOfElements(packages_memAndSessionPackDescription);
		waitForVisibilityOfElement(createSessionPack);
		waitForVisibilityOfElements(packages_bottomElements);
		waitForVisibilityOfElement(createMembership);
		return createMembership;
	}
	
	@FindBy(css="div[class*='horizontal'] div")
	WebElement createMembership_packageProgessBar;
	
	@FindBy(css="div[class*='center'] h2")
	WebElement clientType_title;
	
	public WebElement clientType_title()
	{
		waitForVisibilityOfElement(clientType_title);
		return clientType_title;
	}
	
	@FindBy(css="div[class*='MuiFormGroup-root'] label")
	WebElement clientType_allTypeOfClients;
	
	@FindBy(css="div[class*='MuiBox-root'] div")
	WebElement clientType_bottomElements;

	@FindBy(xpath="//label[@class='MuiFormControlLabel-root'][1]/span[1]/span[1]")
	WebElement clientType_newClients;
	
	public WebElement clientType_newClients()
	{
		waitForVisibilityOfElements(createMembership_packageProgessBar);
		waitForVisibilityOfElements(clientType_allTypeOfClients);
		waitForVisibilityOfElements(clientType_bottomElements);
		waitForVisibilityOfElement(clientType_newClients);
		return clientType_newClients;
	}
	
	@FindBy(css="span[class*='Mui-checked']")
	WebElement clientType_newClientsChecked;
	
	@FindBy(xpath="//label[@class='MuiFormControlLabel-root'][2]/span[1]/span[1]")
	WebElement clientType_introClients;
	
	public WebElement clientType_introClients()
	{
		waitForVisibilityOfElement(clientType_newClientsChecked);
		waitForVisibilityOfElement(clientType_introClients);
		return clientType_introClients;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement clientType_continue;
	
	public WebElement clientType_continue()
	{
		waitForVisibilityOfElements(clientType_newClientsChecked);
		waitForVisibilityOfElement(clientType_continue);
		waitForElementToBeClickable(clientType_continue);
		return clientType_continue;
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement membershipDetails_title;
	
	public WebElement membershipDetails_title()
	{
		waitForVisibilityOfElement(membershipDetails_title);
		return membershipDetails_title;
	}
	
	@FindBy(css="div[class*='container'] div div div")
	WebElement membershipDetails_allFieldElements;
	
	@FindBy(css="div[class*='MuiBox-root'] div")
	WebElement membershipDetails_bottomElements;
	
	@FindBy(css="input[name='membershipName']")
	WebElement membershipDetails_enterNameOfMemPack;
	
	public WebElement membershipDetails_enterNameOfMemPack()
	{
		waitForVisibilityOfElements(createMembership_packageProgessBar);
		waitForVisibilityOfElements(membershipDetails_allFieldElements);
		waitForVisibilityOfElements(membershipDetails_bottomElements);
		waitForElementToBeClickable(membershipDetails_enterNameOfMemPack);
		return membershipDetails_enterNameOfMemPack;
	}
	
	@FindBy(css="input[value='1 Year Pilates Membership Pack']")
	WebElement membershipDetails_enteredNameOfMemPack;
	
	@FindBy(css="div[id='mui-component-select-length']")
	WebElement membershipDetails_selectLengthOfMemPack;
	
	public WebElement membershipDetails_selectLengthOfMemPack()
	{
		waitForVisibilityOfElement(membershipDetails_enteredNameOfMemPack);
		waitForElementToBeClickable(membershipDetails_selectLengthOfMemPack);
		return membershipDetails_selectLengthOfMemPack;
	}
	
	@FindBy(css="ul li:nth-child(4)")
	WebElement membershipDetails_selectLength12Month;
	
	public WebElement membershipDetails_selectLength12Month()
	{
		waitForVisibilityOfElement(membershipDetails_selectLength12Month);
		return membershipDetails_selectLength12Month;
	}
	
	@FindBy(css="input[value='365']")
	WebElement membershipDetails_selectedLength12Month;
	
	@FindBy(css="input[name='clientCanAttend']")
	WebElement membershipDetails_enterNumberOfSessions;
	
	public WebElement membershipDetails_enterNumberOfSessions()
	{
		waitForVisibilityOfElement(membershipDetails_selectedLength12Month);
		waitForElementToBeClickable(membershipDetails_enterNumberOfSessions);
		return membershipDetails_enterNumberOfSessions;
	}
	
	@FindBy(css="input[value='30']")
	WebElement membershipDetails_enteredNumberOfSessions;
	
	@FindBy(css="div[id='mui-component-select-timePeriod']")
	WebElement membershipDetails_selectSessionsTimePeriod;
	
	public WebElement membershipDetails_selectSessionsTimePeriod()
	{
		waitForVisibilityOfElement(membershipDetails_enteredNumberOfSessions);
		waitForElementToBeClickable(membershipDetails_selectSessionsTimePeriod);
		return membershipDetails_selectSessionsTimePeriod;
	}
	
	@FindBy(css="ul li:nth-child(2)")
	WebElement membershipDetails_selectSessionsTimePeriodMonthly;
	
	public WebElement membershipDetails_selectSessionsTimePeriodMonthly()
	{
		waitForVisibilityOfElement(membershipDetails_selectSessionsTimePeriodMonthly);
		return membershipDetails_selectSessionsTimePeriodMonthly;
	}
	
	@FindBy(css="div[id*='select-timeSlot']")
	WebElement membershipDetails_selectTimes;
	
	public WebElement membershipDetails_selectTimes()
	{
		waitForElementToBeClickable(membershipDetails_selectTimes);
		return membershipDetails_selectTimes;
	}
	
	@FindBy(css="ul li:nth-child(3)")
	WebElement membershipDetails_selectTimes_anyTime;
	
	public WebElement membershipDetails_selectTimes_anyTime()
	{
		waitForVisibilityOfElement(membershipDetails_selectTimes_anyTime);
		return membershipDetails_selectTimes_anyTime;
	}
	
	@FindBy(xpath="//div[@aria-label='purchase-limit']/label[2]/span[1]/span[1]")
	WebElement membershipDetails_selectNoPurchaseLimit;
	
	public WebElement membershipDetails_selectNoPurchaseLimit()
	{
		waitForElementToBeClickable(membershipDetails_selectNoPurchaseLimit);
		return membershipDetails_selectNoPurchaseLimit;
	}
	
	@FindBy(xpath="//div[@aria-label='allow-rollover']/label[1]/span[1]/span[1]")
	WebElement membershipDetails_allowRolloverOfUnusedSessions;
	
	public WebElement membershipDetails_allowRolloverOfUnusedSessions()
	{
		waitForElementToBeClickable(membershipDetails_allowRolloverOfUnusedSessions);
		return membershipDetails_allowRolloverOfUnusedSessions;
	}
	
	@FindBy(css="span[class*='Mui-checked']")
	WebElement membershipDetails_checkedRadioButtons;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement membershipDetails_continue;
	
	public WebElement membershipDetails_continue()
	{
		waitForVisibilityOfElements(membershipDetails_checkedRadioButtons);
		waitForElementToBeClickable(membershipDetails_continue);
		return membershipDetails_continue;
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement membershipPack_pricing_title;
	
	public WebElement membershipPack_pricing_title()
	{
		waitForVisibilityOfElement(membershipPack_pricing_title);
		return membershipPack_pricing_title;
	}
	
	@FindBy(css="div[class*='container'] div span")
	WebElement membershipPack_pricing_allElements;
	
	@FindBy(css="div[class*='MuiBox-root'] div")
	WebElement membershipPack_bottomElements;
	
	@FindBy(css="input[type='text']")
	WebElement membershipPack_price;

	public WebElement membershipPack_price()
	{
		waitForVisibilityOfElements(createMembership_packageProgessBar);
		waitForVisibilityOfElements(membershipPack_pricing_allElements);
		waitForVisibilityOfElements(membershipPack_bottomElements);
		waitForElementToBeClickable(membershipPack_price);
		return membershipPack_price;
	}
	
	@FindBy(css="input[value='1.00']")
	WebElement membershipPack_enteredPrice;
	
	@FindBy(css="div[id*='select-chargeTimePeriod']")
	WebElement membershipPack_selectPackageChargeTimePeriod;
	
	public WebElement membershipPack_selectPackageChargeTimePeriod()
	{
		waitForVisibilityOfElement(membershipPack_enteredPrice);
		waitForElementToBeClickable(membershipPack_selectPackageChargeTimePeriod);
		return membershipPack_selectPackageChargeTimePeriod;
	}
	
	@FindBy(css="ul li:nth-child(2)")
	WebElement membershipPack_selectMonthlyPackageChargeTimePeriod;
	
	public WebElement membershipPack_selectMonthlyPackageChargeTimePeriod()
	{
		waitForVisibilityOfElement(membershipPack_selectMonthlyPackageChargeTimePeriod);
		return membershipPack_selectMonthlyPackageChargeTimePeriod;
	}
	
	@FindBy(css="div[id*='select-chargeEvent']")
	WebElement membershipPack_selectPackageChargeFromEvent;
	
	public WebElement membershipPack_selectPackageChargeFromEvent()
	{
		waitForElementToBeClickable(membershipPack_selectPackageChargeFromEvent);
		return membershipPack_selectPackageChargeFromEvent;
	}
	
	@FindBy(css="ul li:nth-child(1)")
	WebElement membershipPack_selectPackageChargeFromEventDateOfPurchase;
	
	public WebElement membershipPack_selectPackageChargeFromEventDateOfPurchase()
	{
		waitForVisibilityOfElement(membershipPack_selectPackageChargeFromEventDateOfPurchase);
		return membershipPack_selectPackageChargeFromEventDateOfPurchase;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement membershipPack_pricing_continue;
	
	public WebElement membershipPack_pricing_continue()
	{
		waitForVisibilityOfElement(membershipPack_pricing_continue);
		waitForElementToBeClickable(membershipPack_pricing_continue);
		return membershipPack_pricing_continue;
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement membershipPack_confirmation_title;
	
	public WebElement membershipPack_confirmation_title()
	{
		waitForVisibilityOfElement(membershipPack_confirmation_title);
		return membershipPack_confirmation_title;
	}
	
	@FindBy(xpath="//div[contains(@class,'space-between')]/div/p[contains(@class,'MuiTypography-body1')]")
	WebElement membershipPack_confirmationElements;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement membershipPack_confirmation_continue;
	
	public WebElement membershipPack_confirmation_continue()
	{
		waitForVisibilityOfElements(membershipPack_confirmationElements);
		waitForElementToBeClickable(membershipPack_confirmation_continue);
		return confirmation_continue;
	}
	
	@FindBy(xpath="//ul/li[contains(@class,'active')][1]/div")
	WebElement newlyCreatedMemPack_1st;
	
	public WebElement newlyCreatedMemPack_1st()
	{
		waitForVisibilityOfElement(newlyCreatedMemPack_1st);
		return newlyCreatedMemPack_1st;
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
	
	@FindBy(xpath="//span[text()='+ CREATE SESSION PACK']")
	WebElement createSessionPack;
	
	public WebElement createSessionPack()
	{
		return createSessionPack;
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
