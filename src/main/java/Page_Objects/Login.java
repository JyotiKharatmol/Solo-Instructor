package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Solo_AbstractComponents
{
	WebDriver driver;
	
	public Login(WebDriver driver)
	{	
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(css="div img")
	WebElement logo;
	
	public WebElement smartStudioLogo()
	{
		return logo;
	}
	
	@FindBy(tagName="h1")
	WebElement titleOfLoginPage;
	
	public WebElement titleOfLoginPage()
	{
		return titleOfLoginPage;
	}
	
	@FindBy(css="input[type=\"email\"]")
	WebElement username;
	
	public WebElement username()
	{
		return username;
	}
	
	@FindBy(css="input[type=\"password\"]")
	WebElement password;
	
	public WebElement password()
	{
		return password;
	}
	
	@FindBy(css="a[href='#/fit/solo-instructor/forgotPassword']")
	WebElement forgotPassword;
	
	public WebElement forgotPassword()
	{
		return forgotPassword;
	}
	
	@FindBy(css="button[type='submit']")
	WebElement loginButton;
	
	public WebElement loginButton()
	{
		return loginButton;
	}
	
	@FindBy(css="a[href='#/fit/solo-client/client/app']")
	WebElement customerAccount;
	
	public WebElement customerAccount()
	{
		return customerAccount;
	}

	@FindBy(css="a[href='#/fit/solo-client/client/app/login']")
	WebElement clientLogin;
	
	public WebElement clientLogin()
	{
		return clientLogin;
	}
	
	@FindBy(css="a[href='#/fit/solo-client/client/app/client-signup']")
	WebElement signUp;
	
	public WebElement SignUp()
	{
		return signUp;
	}
	
}
