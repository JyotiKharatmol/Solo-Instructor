package tests;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import abstractComponents.SoloSettings_AbstractComponents;
import abstractComponents.Solo_AbstractComponents;
import pageObjects.InstructorDetails;
import pageObjects.Login;
import pageObjects.ServicesAndProducts;
import pageObjects.Settings;
import testComponents.BaseTest;


public class OnboardSettings extends BaseTest
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
		l.password().sendKeys("$m@rtDev!-00");
		l.loginButton();
		SoloSettings_AbstractComponents solo = new SoloSettings_AbstractComponents(driver);
		solo.waitForURLToContain("app");
		Solo_AbstractComponents s = new Solo_AbstractComponents(driver);
		s.settings();
		solo.waitForURLToContain("settings");
		Settings se = new Settings(driver);
		se.InstructorDetailsBox();
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
		i.instructorDetails_saveAndContinue();
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


