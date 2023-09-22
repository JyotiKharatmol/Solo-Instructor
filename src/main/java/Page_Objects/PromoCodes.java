package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoCodes extends SoloSettings_AbstractComponents{

	WebDriver driver;
	public PromoCodes(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/div/div/div/div/h2")
	WebElement promoCodeTitle;
	
	public WebElement promoCodeTitle()
	{
		return promoCodeTitle;
	}
	
	@FindBy(xpath="//div/div/div/div/div[2]/button")
	WebElement addPromoCode;
	
	public WebElement addPromoCode()
	{
		return addPromoCode;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div/div[1]")
	WebElement copyPromoCode;
	
	public WebElement copyPromoCode()
	{
		return copyPromoCode;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/div/div[1]")
	WebElement deletePromoCode;
	
	public WebElement deletePromoCode()
	{
		return deletePromoCode;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement promoCodes_previousStep;
	
	public WebElement promoCodes_previousStep()
	{
		waitForElementToBeClickable(promoCodes_previousStep);
		return promoCodes_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement promoCodes_saveAndContinue;
	
	public WebElement promoCodes_saveAndContinue()
	{
		return promoCodes_saveAndContinue;
	}
	
	@FindBy(xpath="//span[text()='SKIP']")
	WebElement promoCodes_skip;
	
	public WebElement promoCodes_skip()
	{
		waitForElementToBeClickable(promoCodes_skip);
		return promoCodes_skip;
	}
}
