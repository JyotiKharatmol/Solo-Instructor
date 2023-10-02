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
	WebElement createMembershipOrSession_packageProgessBar;
	
	@FindBy(css="div[class*='center'] h2")
	WebElement clientType_title;
	
	public WebElement clientType_title()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(clientType_allTypeOfClients);
		waitForVisibilityOfElements(clientType_bottomElements);
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
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
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
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
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
	
	@FindBy(css="input[name='clientCanAttend']")
	WebElement membershipDetails_enterNumberOfSessions;
	
	public WebElement membershipDetails_enterNumberOfSessions()
	{
		waitForElementToBeClickable(membershipDetails_enterNumberOfSessions);
		return membershipDetails_enterNumberOfSessions;
	}
	
	@FindBy(css="div[id='mui-component-select-timePeriod']")
	WebElement membershipDetails_selectSessionsTimePeriod;
	
	public WebElement membershipDetails_selectSessionsTimePeriod()
	{
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
	
	public WebElement membershipDetails_1YearPilatesMemPack_continue()
	{
		waitForVisibilityOfElements(membershipDetails_checkedRadioButtons);
		waitForElementToBeClickable(membershipDetails_continue);
		return membershipDetails_continue;
	}
	
	public WebElement membershipDetails_copy_unlimitedMemPack_continue()
	{
		waitForVisibilityOfElement(membershipDetails_checkedRadioButtons);
		waitForElementToBeClickable(membershipDetails_continue);
		return membershipDetails_continue;
	}
	
	public WebElement membershipDetails_copy_freeFirstMonthMemPack_continue()
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
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(membershipPack_pricing_allElements);
		waitForVisibilityOfElements(membershipPack_bottomElements);
		waitForElementToBeClickable(membershipPack_price);
		return membershipPack_price;
	}
	
	@FindBy(css="span[class*='Checkbox']")
	WebElement membershipPack_diffFirstMonthPriceCheckbox;
	
	public WebElement membershipPack_diffFirstMonthPriceCheckbox()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(membershipPack_pricing_allElements);
		waitForVisibilityOfElements(membershipPack_bottomElements);
		waitForElementToBeClickable(membershipPack_diffFirstMonthPriceCheckbox);
		return membershipPack_diffFirstMonthPriceCheckbox;
	}
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid-container')]/div[4]/div/div[1]/span[3]/div/div/div/div/input")
	WebElement membershipPack_enterDiffFirstMonthPrice;
	
	public WebElement membershipPack_enterDiffFirstMonthPrice()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(membershipPack_pricing_allElements);
		waitForVisibilityOfElements(membershipPack_bottomElements);
		waitForVisibilityOfElement(membershipPack_enterDiffFirstMonthPrice);
		waitForElementToBeClickable(membershipPack_enterDiffFirstMonthPrice);
		return membershipPack_enterDiffFirstMonthPrice;
	}
	
	@FindBy(css="div[id*='select-chargeTimePeriod']")
	WebElement membershipPack_selectPackageChargeTimePeriod;
	
	public WebElement membershipPack_selectPackageChargeTimePeriod()
	{
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
		return membershipPack_confirmation_continue;
	}
	
	@FindBy(xpath="//div[contains(@class,'MuiPaper-rounded')]/div/div[1]/div[5]/div/div/ul/li[1]/div/div[2]/div[1]")
	WebElement createdMemPackName;
	
	public WebElement createdMemPackName()
	{
		waitForVisibilityOfElement(packages_title);
		waitForVisibilityOfElement(createdMemPackName);
		return createdMemPackName;
	}
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid')][5]/div/div/ul/li[1]/div/div[3]/a")
	WebElement memPack_1st_elements;
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid')][5]/div/div/ul/li[1]/div/div[3]/a[1]")
	WebElement copyMemPack_1st;
	
	public WebElement copyMemPack_1st()
	{
		waitForVisibilityOfElements(memPack_1st_elements);
		waitForVisibilityOfElement(copyMemPack_1st);
		return copyMemPack_1st;
	}
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid')][5]/div/div/ul/li[2]/div/div[3]/a[1]")
	WebElement copyMemPack_2nd;
	
	public WebElement copyMemPack_2nd()
	{
		waitForVisibilityOfElement(packages_title);
		waitForVisibilityOfElement(copyMemPack_2nd);	
		return copyMemPack_2nd;
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
		waitForVisibilityOfElement(createSessionPack);
		waitForElementToBeClickable(createSessionPack);
		return createSessionPack;
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement sessionDetails_title;
	
	@FindBy(xpath="//div[contains(@class,'spacing')]/div")
	WebElement sessionDetails_midElements;
	
	@FindBy(css="div[class*='MuiBox-root']")
	WebElement sessionDetails_topAndBottomElements;
	
	public WebElement sessionDetails_title()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionDetails_midElements);
		waitForVisibilityOfElements(sessionDetails_topAndBottomElements);
		waitForVisibilityOfElement(sessionDetails_title);
		return sessionDetails_title;
	}
		
	@FindBy(css="input[name='classpackName']")
	WebElement sessionDetails_enterNameOfSessionPack;
	
	public WebElement sessionDetails_enterNameOfSessionPack()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionDetails_midElements);
		waitForVisibilityOfElements(sessionDetails_topAndBottomElements);
		waitForElementToBeClickable(sessionDetails_enterNameOfSessionPack);
		return sessionDetails_enterNameOfSessionPack;
	}
	
	@FindBy(xpath="//div[@inputmode='numeric']/div/input")
	WebElement sessionDetails_enterNumberOfSessions;
	
	public WebElement sessionDetails_enterNumberOfSessions()
	{
		waitForVisibilityOfElement(sessionDetails_enterNumberOfSessions);
		waitForElementToBeClickable(sessionDetails_enterNumberOfSessions);
		return sessionDetails_enterNumberOfSessions;
	}
	
	@FindBy(css="div[id*='select-timeSlot']")
	WebElement sessionDetails_selectTimes;
	
	public WebElement sessionDetails_selectTimes()
	{
		waitForElementToBeClickable(sessionDetails_selectTimes);
		return sessionDetails_selectTimes;
	}
	
	@FindBy(css="ul li:nth-child(1)")
	WebElement sessionDetails_selectTimes_anyTime;
	
	public WebElement sessionDetails_selectTimes_anyTime()
	{
		waitForVisibilityOfElement(sessionDetails_selectTimes_anyTime);
		waitForElementToBeClickable(sessionDetails_selectTimes_anyTime);
		return sessionDetails_selectTimes_anyTime;
	}
	
	@FindBy(xpath="//div[@role='radiogroup']/label[2]/span[1]/span[1]")
	WebElement sessionDetails_selectNoPurchaseLimit;
	
	public WebElement sessionDetails_selectNoPurchaseLimit()
	{
		waitForVisibilityOfElement(sessionDetails_selectNoPurchaseLimit);
		waitForElementToBeClickable(sessionDetails_selectNoPurchaseLimit);
		return sessionDetails_selectNoPurchaseLimit;
	}
	
	@FindBy(css="span[class*='checked']")
	WebElement sessionDetails_checkedNoPurchaseLimit;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement sessionDetails_continue;
	
	public WebElement sessionDetails_continue()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionDetails_midElements);
		waitForVisibilityOfElements(sessionDetails_topAndBottomElements);
		waitForVisibilityOfElement(sessionDetails_checkedNoPurchaseLimit);
		waitForElementToBeClickable(sessionDetails_continue);
		return sessionDetails_continue;
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement sessionPack_pricing_title;
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid')][1]")
	WebElement sessionPack_pricingElements;
	
	@FindBy(css="div[class*='MuiBox']")
	WebElement sessionPack_pricingTopAndBottomElements;
	
	public WebElement sessionPack_pricing_title()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionPack_pricingElements);
		waitForVisibilityOfElements(sessionPack_pricingTopAndBottomElements);
		waitForVisibilityOfElement(sessionPack_pricing_title);
		return sessionPack_pricing_title;
	}
	
	@FindBy(css="input[type='text']")
	WebElement sessionPack_price;
	
	public WebElement sessionPack_price()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionPack_pricingElements);
		waitForVisibilityOfElements(sessionPack_pricingTopAndBottomElements);
		waitForElementToBeClickable(sessionPack_price);
		return sessionPack_price;
	}
	
	@FindBy(css="div[id='mui-component-select-expireTimePeriod']")
	WebElement sessionPack_selectExpiryTime;
	
	public WebElement sessionPack_selectExpiryTime()
	{
		waitForElementToBeClickable(sessionPack_selectExpiryTime);
		return sessionPack_selectExpiryTime;
	}
	
	@FindBy(css="ul li:nth-child(7)")
	WebElement sessionPack_selectExpiryTime_1yr;
	
	public WebElement sessionPack_selectExpiryTime_1yr()
	{
		waitForVisibilityOfElement(sessionPack_selectExpiryTime_1yr);
		waitForElementToBeClickable(sessionPack_selectExpiryTime_1yr);
		return sessionPack_selectExpiryTime_1yr;
	}
	
	@FindBy(css="div[id='mui-component-select-expireEvent']")
	WebElement sessionPack_selectFromEvent;
	
	public WebElement sessionPack_selectFromEvent()
	{
		waitForElementToBeClickable(sessionPack_selectFromEvent);
		return sessionPack_selectFromEvent;
	}
	
	@FindBy(css="ul li:nth-child(1)")
	WebElement sessionPack_selectFromEventDateOfPurchase;
	
	public WebElement sessionPack_selectFromEventDateOfPurchase()
	{
		waitForVisibilityOfElement(sessionPack_selectFromEventDateOfPurchase);
		waitForElementToBeClickable(sessionPack_selectFromEventDateOfPurchase);
		return sessionPack_selectFromEventDateOfPurchase;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement sessionPack_pricing_continue;
	
	public WebElement sessionPack_pricing_continue()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionPack_pricingElements);
		waitForVisibilityOfElements(sessionPack_pricingTopAndBottomElements);
		waitForElementToBeClickable(sessionPack_pricing_continue);
		return sessionPack_pricing_continue;
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement sessionPack_confirmation_title;
	
	@FindBy(css="div[class*='MuiGrid'] p")
	WebElement sessionPack_confirmationElements;
	
	public WebElement sessionPack_confirmation_title()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionPack_confirmationElements);
		waitForVisibilityOfElement(sessionPack_confirmation_title);
		return sessionPack_confirmation_title;
	}
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	WebElement sessionPack_confirmation_continue;
	
	public WebElement sessionPack_confirmation_continue()
	{
		waitForVisibilityOfElements(createMembershipOrSession_packageProgessBar);
		waitForVisibilityOfElements(sessionPack_confirmationElements);
		waitForElementToBeClickable(sessionPack_confirmation_continue);
		return sessionPack_confirmation_continue;
	}
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid')][9]/div/div/ul/li[1]/div/div[2]/div[1]")
	WebElement createdSessionPackName;
	
	public WebElement createdSessionPackName()
	{
		waitForVisibilityOfElement(packages_title);
		waitForVisibilityOfElement(createdSessionPackName);
		return createdSessionPackName;
	}	
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid')][9]/div/div/ul/li[1]/div/div[3]/a")
	WebElement copy_sessionPack_elements;
	
	@FindBy(xpath="//div[contains(@class,'MuiGrid')][9]/div/div/ul/li[1]/div/div[3]/a[1]")
	WebElement copy_sessionPack_1st;
	
	public WebElement copy_sessionPack_1st()
	{
		waitForVisibilityOfElements(copy_sessionPack_elements);
		waitForVisibilityOfElement(copy_sessionPack_1st);
		return copy_sessionPack_1st;
	}
	
	@FindBy(xpath="//li[contains(@class,'carousel')]/div")
	WebElement packages_allCreatedPackages;
	
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
		waitForVisibilityOfElement(packages_title);
		waitForVisibilityOfElement(packages_description);
		waitForVisibilityOfElements(packages_memAndSessionPackDescription);
		waitForVisibilityOfElements(packages_allCreatedPackages);
		waitForVisibilityOfElements(packages_bottomElements);
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
