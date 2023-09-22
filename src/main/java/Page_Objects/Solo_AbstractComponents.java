package Page_Objects;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Solo_AbstractComponents 
{
	WebDriver driver;
	
	public Solo_AbstractComponents(WebDriver driver)
	{		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Dashboard")
	WebElement dashboard;
	
	public WebElement dashboard()
	{
		return dashboard;
	}
	
	@FindBy(linkText="Calendar")
	WebElement calendar;
	
	public WebElement calendar()
	{
		return calendar;
	}
	
	@FindBy(linkText="Clients")
	WebElement clients;
	
	public WebElement clients()
	{
		return clients;
	}
	
	@FindBy(linkText="Settings")
	WebElement settings;
	
	public WebElement settings()
	{
		waitForVisibilityOfElement(settings);
		return settings;
	}
	
	@FindBy(xpath="//span[text()='LOG OUT']")
	WebElement logout;
	
	public WebElement logout()
	{
		return logout;
	}
	
	public void waitForVisibilityOfElement(WebElement a)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(a));
				
	}
}
