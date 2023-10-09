package Solo_Instructor;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Page_Objects.InstructorDetails;
import Page_Objects.Solo_AbstractComponents;
import Page_Objects.Login;
import Page_Objects.ServicesAndProducts;
import Page_Objects.Settings;
import Page_Objects.SoloSettings_AbstractComponents;
import Resource_Properties.Base_File;

public class OnboardSettings extends Base_File
{
	@BeforeTest	
	
	public void initialize() throws IOException
	{
	 driver = initializeBrowser();
	 driver.get(pro.getProperty("existingUserUrl")); 
	}
	
	@Test
	public void InstructorDetails() throws InterruptedException, IOException
	{
		Login l = new Login(driver);
		l.username().sendKeys("jyoti.kharatmol@azularc.com");
		l.password().sendKeys("Password@3");
		l.loginButton().click();
		
		SoloSettings_AbstractComponents solo = new SoloSettings_AbstractComponents(driver);
		solo.waitForURLToContain("app");
		
		Solo_AbstractComponents s = new Solo_AbstractComponents(driver);
		
		s.settings().click();
		
		solo.waitForURLToContain("settings");
		
		Settings se = new Settings(driver);
		se.InstructorDetailsBox().click();
		
		solo.waitForURLToContain("companyDetails");
		
		InstructorDetails i = new InstructorDetails(driver);
		Assert.assertEquals(i.instructorDetails_title().getText(), "Instructor Details");
		Assert.assertEquals(i.brandName().getAttribute("value"), "Cross-Fit");
		Assert.assertEquals(i.address1().getAttribute("value"), "Highland Street 120");
		Assert.assertEquals(i.city().getAttribute("value"), "Atlanta");
		Assert.assertEquals(i.zip().getAttribute("value"), "30300");
		Assert.assertEquals(i.firstName().getAttribute("value"), "Jyoti");
		Assert.assertEquals(i.lastName().getAttribute("value"), "Kharatmol");
		Assert.assertEquals(i.phoneNumber().getAttribute("value"), "(234) 562-3235");
		Assert.assertEquals(i.emailId().getAttribute("value"), "jyoti.kharatmol@azularc.com");
		Assert.assertEquals(i.companyAlias().getAttribute("value"), "alias29");
		Assert.assertEquals(i.merchantId().getAttribute("value"), "516158991");
		Assert.assertEquals(i.merchantUsername().getAttribute("value"), "SmartStudioDev");
		i.togglePasswordVisibilityIcon().click();
		Assert.assertEquals(i.merchantPassword().getAttribute("value"), "SmartDev!-00");
		/*
		i.browseImage().click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Desktop\\autoIT\\imageUpload.exe");
		*/
		i.instructorDetails_saveAndContinue().click();
		solo.waitForURLToContain("reportSettings");
		ServicesAndProducts ser = new ServicesAndProducts(driver);
		Assert.assertEquals(ser.servicesAndProducts_title().getText(), "Services and Products");
	}
	
	@AfterTest
	public void teardown()
	{
	driver.close();
	}

}


