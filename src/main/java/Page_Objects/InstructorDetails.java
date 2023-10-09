package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstructorDetails extends SoloSettings_AbstractComponents
{

	WebDriver driver;
	public InstructorDetails(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div[class*='center'] h2")
	WebElement instructorDetails_title;
	
	public WebElement instructorDetails_title()
	{
		waitForVisibilityOfElement(instructorDetails_title);
		return instructorDetails_title;
	}
	
	@FindBy(css="input[name='name']")
	WebElement brandName;
	
	public WebElement brandName()
	{
		waitForAttributeOfElement(brandName, "value", "Cross-Fit");
		return brandName;
	}
	
	@FindBy(css="div[id*='timeZone']")
	WebElement timeZone;
	
	public WebElement timeZone()
	{
		return timeZone;
	}
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(1)")
	WebElement easternTimeZone;
	
	public WebElement easternTimeZone()
	{
		return easternTimeZone;
	}
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(2)")
	WebElement centralTimeZone;
	
	public WebElement centralTimeZone()
	{
		return centralTimeZone;
	}
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(3)")
	WebElement mountainTimeZone;
	
	public WebElement mountainTimeZone()
	{
		return mountainTimeZone;
	}
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(4)")
	WebElement pacificTimeZone;
	
	public WebElement pacificTimeZone()
	{
		return pacificTimeZone;
	}
	
	@FindBy(css="input[name='address1']")
	WebElement address1;
	
	public WebElement address1()
	{
		return address1;
	}
	
	@FindBy(css="input[name='address2']")
	WebElement address2;
	
	public WebElement address2()
	{
		return address2;
	}
	
	@FindBy(css="input[name='city']")
	WebElement city;
	
	public WebElement city()
	{
		return city;
	}
	
	@FindBy(css="div[id*='state']")
	WebElement state;
	
	public WebElement state()
	{
		return state;
	}
	
	@FindBy(css="div[id*='state'] ul li:nth-child(11)")
	WebElement georgiaState;
	
	public WebElement georgiaState()
	{
		return georgiaState;
	}
	
	@FindBy(css="input[name='zip']")
	WebElement zip;
	
	public WebElement zip()
	{
		return zip;
	}
	
	@FindBy(css="input[name='firstName']")
	WebElement firstName;
	
	public WebElement firstName()
	{
		return firstName;
	}
	
	@FindBy(css="input[name='lastName']")
	WebElement lastName;
	
	public WebElement lastName()
	{
		return lastName;
	}
	
	@FindBy(xpath="//div[11]/div/div/input")
	WebElement phoneNumber;
	
	public WebElement phoneNumber()
	{
		return phoneNumber;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement emailId;
	
	public WebElement emailId()
	{
		return emailId;
	}
	
	@FindBy(css="input[name='alias']")
	WebElement companyAlias;
	
	public WebElement companyAlias()
	{
		return companyAlias;
	}
	
	@FindBy(xpath="//div[14]/div/div/input")
	WebElement merchantId;
	
	public WebElement merchantId()
	{
		return merchantId;
	}
	
	@FindBy(css="input[name='merchantUsername']")
	WebElement merchantUsername;
	
	public WebElement merchantUsername()
	{
		return merchantUsername;
	}
	
	@FindBy(css="input[name='merchantPassword']")
	WebElement merchantPassword;
	
	public WebElement merchantPassword()
	{
		return merchantPassword;
	}
	
	@FindBy(css="button[aria-label*='password visibility'] span:nth-child(1)")
	WebElement togglePasswordVisibilityIcon;
	
	public WebElement togglePasswordVisibilityIcon()
	{
		return togglePasswordVisibilityIcon;
	}
	
	@FindBy(css="div[class='dropzone'] div button")
	WebElement browseImage;
	
	public WebElement browseImage()
	{
		waitForVisibilityOfElement(browseImage);
		return browseImage;
	}
	
	@FindBy(css="img[alt='thumbnail']")
	WebElement instructorDetails_uploadedImage;
	
	@FindBy(xpath="//span[text()='CHANGE PASSWORD']")
	WebElement changePassword;
	
	public WebElement changePassword()
	{
		return changePassword;
	}
	
	@FindBy(css="div h1")
	WebElement createPasswordHeader;
	
	public WebElement createPasswordHeader()
	{
		return createPasswordHeader;
	}
	
	@FindBy(css="input[name='password']")
	WebElement newPassword;
	
	public WebElement newPassword()
	{
		return newPassword;
	}
	
	@FindBy(css="input[name='confirmPassword']")
	WebElement confirmPassword;
	
	public WebElement confirmPassword()
	{
		return confirmPassword;
	}
	
	@FindBy(css="button[type='submit']")
	WebElement submit;
	
	public WebElement submit()
	{
		return submit;
	}
	
	@FindBy(xpath="//div[@role='dialog']/div[1]/button")
	WebElement cancel;
	
	public WebElement cancel()
	{
		return cancel;
	}

	@FindBy(xpath="//span[text()='SAVE FOR LATER']")
	WebElement instructorDetails_saveForLater;
	
	public WebElement instructorDetails_saveForLater()
	{
		return instructorDetails_saveForLater;
	}
	
	@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
	WebElement instructorDetails_saveAndContinue;
	
	public WebElement instructorDetails_saveAndContinue()
	{
		//waitForVisibilityOfElement(instructorDetails_uploadedImage);
		waitForElementToBeClickable(instructorDetails_saveAndContinue);
		return instructorDetails_saveAndContinue;
	}
	
}
