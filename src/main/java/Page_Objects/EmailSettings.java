package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailSettings extends SoloSettings_AbstractComponents
{
	WebDriver driver;
	public EmailSettings(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='email']")
	WebElement enterEmail;
	
	public WebElement enterEmail()
	{
		waitForElementToBeClickable(enterEmail);
		return enterEmail;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement emailSettings_previousStep;
	
	public WebElement emailSettings_previousStep()
	{
		return emailSettings_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement emailSettings_saveAndContinue;
	
	public WebElement emailSettings_saveAndContinue()
	{
		waitForElementToBeClickable(emailSettings_saveAndContinue);
		return emailSettings_saveAndContinue;
	}
}
