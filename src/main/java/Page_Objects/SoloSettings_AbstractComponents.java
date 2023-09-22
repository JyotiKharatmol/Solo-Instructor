package Page_Objects;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SoloSettings_AbstractComponents extends Solo_AbstractComponents
{

	WebDriver driver;
	public SoloSettings_AbstractComponents(WebDriver driver)
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div/div/a[@href='#/fit/solo-instructor/app/settings']/div")
	WebElement backToSettings;
	
	public WebElement backToSettings()
	{
		return backToSettings;
	}
	
	@FindBy(css="ul a[href*='companyDetails']")
	WebElement instructorDetails;
	
	public WebElement instructorDetails()
	{
		waitForElementToBeClickable(instructorDetails);
		return instructorDetails;
	}
	
	@FindBy(css="a[href*='reportSettings']")
	WebElement servicesAndProducts;
	
	public WebElement servicesAndProducts()
	{
		return servicesAndProducts;
	}
	
	@FindBy(css="a[href*='classesSettings']")
	WebElement sessionSettings;
	
	public WebElement sessionSettings()
	{
		return sessionSettings;
	}
	
	@FindBy(css="a[href*='clientWaiver']")
	WebElement clientWaiver;
	
	public WebElement clientWaiver()
	{
		return clientWaiver;
	}
	
	@FindBy(css="a[href*='contractTerms']")
	WebElement policies_procedures;
	
	public WebElement policies_procedures()
	{
		return policies_procedures;
	}
	
	@FindBy(css="a[href*='studios']")
	WebElement studios;
	
	public WebElement studios()
	{
		return studios;
	}
	
	@FindBy(css="a[href*='packages']")
	WebElement packages;
	
	public WebElement packages()
	{
		return packages;
	}
	
	@FindBy(css="a[href*='promoCodes']")
	WebElement promoCodes;
	
	public WebElement promoCodes()
	{
		return promoCodes;
	}
	
	@FindBy(css="a[href*='fitnessClassTemplate']")
	WebElement fitnessClassTemplate;
	
	public WebElement fitnessClassTemplate()
	{
		return fitnessClassTemplate;
	}
	
	@FindBy(css="a[href*='email']")
	WebElement emailSettings;
	
	public WebElement emailSettings()
	{
		return emailSettings;
	}
	
	public void waitForElementToBeClickable(WebElement a)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		w.until(ExpectedConditions.elementToBeClickable(a));	
	}
	
	public void waitForAttributeOfElement(WebElement a, String b, String c)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.attributeToBe(a, b, c));
	}
	
	public void waitForVisibilityOfElement(WebElement a)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(a));
				
	}
	
}
