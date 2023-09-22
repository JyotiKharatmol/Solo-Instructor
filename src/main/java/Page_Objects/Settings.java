package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings extends Solo_AbstractComponents
{

	WebDriver driver;
	public Settings(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div h1")
	WebElement adminPageTitle;
	
	public WebElement AdminPageTitle()
	{
		return adminPageTitle;
	}
	
	@FindBy(linkText="Instructor Details")
	WebElement instructorDetailsBox;
	
	public WebElement InstructorDetailsBox()
	{
		return instructorDetailsBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/reportSettings'] div")
	WebElement servicesAndProductsBox;
	
	public WebElement ServicesAndProductsBox()
	{
		return servicesAndProductsBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/classesSettings'] div")
	WebElement sessionSettingsBox;
	
	public WebElement SessionSettingsBox()
	{
		return sessionSettingsBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/clientWaiver'] div")
	WebElement clientWaiverBox;
	
	public WebElement ClientWaiverBox()
	{
		return clientWaiverBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/contractTerms'] div")
	WebElement policiesAndProceduresBox;
	
	public WebElement PoliciesAndProceduresBox()
	{
		return policiesAndProceduresBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/studios'] div")
	WebElement studiosBox;
	
	public WebElement StudiosBox()
	{
		return studiosBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/packages'] div")
	WebElement packagesBox;
	
	public WebElement PackagesBox()
	{
		return packagesBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/promoCodes'] div")
	WebElement promoCodesBox;
	
	public WebElement PromoCodesBox()
	{
		waitForVisibilityOfElement(promoCodesBox);
		return promoCodesBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/fitnessClassTemplate'] div")
	WebElement fitnessClassTemplateBox;
	
	public WebElement FitnessClassTemplateBox()
	{
		return fitnessClassTemplateBox;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/email'] div")
	WebElement emailSettingsBox;
		
	public WebElement EmailSettingsBox()
	{
		return emailSettingsBox;
	}
	
}
