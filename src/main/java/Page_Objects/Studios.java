package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Studios extends SoloSettings_AbstractComponents{

	WebDriver driver;
	public Studios(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='+ ADD NEW STUDIOS']")
	WebElement addStudios;
	
	public WebElement addStudios()
	{
		return addStudios;
	}
	
	@FindBy(css="input[name='name']")
	WebElement studioName;
	
	public WebElement studioName()
	{
		waitForVisibilityOfElement(studioName);
		waitForElementToBeClickable(studioName);
		return studioName;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement studioEmail;
	
	public WebElement studioEmail()
	{
		return studioEmail;
	}
	
	@FindBy(xpath="//div[@role='dialog']/div/div[1]/div[2]/div/div[1]/div/div/input")
	WebElement studioPhoneNo;
	
	public WebElement studioPhoneNo()
	{
		return studioPhoneNo;
	}
	
	@FindBy(xpath="//div[@role='dialog']/div/div/div[4]/div/div/div/div/input")
	WebElement studioCancellationNotAllowed;
	
	public WebElement studioCancellationNotAllowed()
	{
		return studioCancellationNotAllowed;
	}
	
	@FindBy(xpath="//span[text()='SAVE ']")
	WebElement saveStudio;
	
	public WebElement saveStudio()
	{
		return saveStudio;
	}
	
	@FindBy(xpath="//div/div/div/div[3]/div/div/div[1]/div[2]/button")
	WebElement edit1stStudio;
	
	public WebElement edit1stStudio()
	{
		return edit1stStudio;
	}
	
	@FindBy(xpath="//div/div/div/div[3]/div/div/div[1]/div[3]/button")
	WebElement delete1stStudio;
	
	public WebElement delete1stStudio()
	{
		return delete1stStudio;
	}
	
	@FindBy(xpath="//span[text()='PREVIOUS STEP']")
	WebElement studios_previousStep;
	
	public WebElement studios_previousStep()
	{
		return studios_previousStep;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement studios_saveAndContinue;

	public WebElement studios_saveAndContinue()
	{
		waitForElementToBeClickable(studios_saveAndContinue);
		return studios_saveAndContinue;
	}

}
