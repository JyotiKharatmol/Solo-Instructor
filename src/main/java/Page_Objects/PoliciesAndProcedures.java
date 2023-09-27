package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoliciesAndProcedures extends SoloSettings_AbstractComponents{

	WebDriver driver;
	public PoliciesAndProcedures(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement policies_title;
	
	public WebElement policies_title()
	{
		waitForVisibilityOfElement(policies_title);
		return policies_title;
	}
	
	@FindBy(css="div[class='dropzone'] div button")
	WebElement uploadPolicies_browse;
	
	public WebElement uploadPolicies_browse()
	{
		waitForVisibilityOfElement(uploadPolicies_browse);
		return uploadPolicies_browse;
	}
	
	@FindBy(css="div[class*='MuiFormControl'] div span[class*='MuiTypography-root']")
	WebElement uploadedPoliciesFile;
	
	@FindBy(css="input[type='text']")
	WebElement enterPoliciesTerm1;
	
	public WebElement enterPoliciesTerm1()
	{	
		waitForVisibilityOfElement(uploadedPoliciesFile);
		waitForElementToBeClickable(enterPoliciesTerm1);
		return enterPoliciesTerm1;
	}
	
	@FindBy(xpath="//span[text()='+ ADD Term & Conditions']")
	WebElement addPoliciesTerm;
	
	public WebElement addPoliciesTerm()
	{
		return addPoliciesTerm;
	}
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container']/div/div/div/p")
	WebElement policiesTerm1;
	
	public WebElement enterPoliciesTerm2()
	{
		waitForVisibilityOfElement(policiesTerm1);
		waitForElementToBeClickable(enterPoliciesTerm1);
		return enterPoliciesTerm1;
	}
	
	@FindBy(css="button[aria-label='edit']")
	WebElement edit1stPoliciesTerm;
	
	public WebElement edit1stPoliciesTerm()
	{
		return edit1stPoliciesTerm;
	}
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[1]/div/div/div/button[2]")
	WebElement delete1stPoliciesTerm;
	
	public WebElement delete1stPoliciesTerm()
	{
		return delete1stPoliciesTerm;
	}
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[2]/div[2]/div[2]/button")
	WebElement cancelPoliciesTerm;
	

	public WebElement cancelPoliciesTerm()
	{
		return cancelPoliciesTerm;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement policies_previousStep;
	
	public WebElement policies_previousStep()
	{
		return policies_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE FOR LATER']")
	WebElement policies_saveForLater;
	
	public WebElement policies_saveForLater()
	{
		return policies_saveForLater;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement policies_saveAndContinue;
	
	public WebElement policies_saveAndContinue()
	{
		waitForVisibilityOfElements(policiesTerm1);
		waitForElementToBeClickable(policies_saveAndContinue);
		return policies_saveAndContinue;
	}
}
