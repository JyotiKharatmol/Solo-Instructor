package Solo_Instructor;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Page_Objects.Calendar;
import Page_Objects.ClientWaiver;
import Page_Objects.EmailSettings;
import Page_Objects.FitnessSessionTemplates;
import Page_Objects.InstructorDetails;
import Page_Objects.Login;
import Page_Objects.Packages;
import Page_Objects.PeakOrNonPeakHours;
import Page_Objects.PoliciesAndProcedures;
import Page_Objects.PromoCodes;
import Page_Objects.ServicesAndProducts;
import Page_Objects.SessionsSettings;
import Page_Objects.Settings;
import Page_Objects.Studios;
import Resource_Properties.Base_File;

public class InstructorDetailsToCalendar extends Base_File
{
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("newUserUrl"));
	}
	
	@Test
	public void InstructorOnBoardingSettings() throws InterruptedException, IOException
	{
		Login l = new Login(driver);
		l.username().sendKeys("jyoti.kharatmol@azularc.com");
		l.password().sendKeys("NH)31s*$");
		l.loginButton().click();
		InstructorDetails i = new InstructorDetails(driver);
		i.instructorDetails_saveAndContinue().click(); 
		ServicesAndProducts s = new ServicesAndProducts(driver);
		Thread.sleep(2000);
		s.enterServiceOrProduct().sendKeys("Nutrition Consultations");
		s.addCategory().click();
		s.servicesAndProducts_saveAndContinue().click();
		SessionsSettings se = new SessionsSettings(driver);
		Thread.sleep(2000);
		se.enterSessionType().sendKeys("Yoga");
		se.addSessionType().click();
		se.sessionSettings_SaveAndContinue().click();
		PeakOrNonPeakHours p = new PeakOrNonPeakHours(driver);
		p.peakOrNonPeakHours_No().click();
		p.peakOrNonPeakHours_saveAndContinue().click();
		ClientWaiver c = new ClientWaiver(driver);
		c.uploadWaiver_browse().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Desktop\\autoIT\\fileUpload.exe");
		c.enterWaiverTerm().sendKeys("Each member who is age 13 and older will receive a membership card. This card is required to enter the facility. You must scan your card at the Front Desk each time you enter the facility.");
		c.addWaiverTerm().click();
		c.enterWaiverTerm().sendKeys("All members will have a picture image on file to verify their identities. Members under the age of 13 must be accompanied by an adult and must be checked in at the Front Desk by giving their name.");
		c.addWaiverTerm().click();
		c.waiverSaveAndContinue().click();
		PoliciesAndProcedures p1 = new PoliciesAndProcedures(driver);
		p1.uploadPolicies_browse().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Desktop\\autoIT\\fileUpload.exe");
		p1.enterPoliciesTerm().sendKeys("It is the policy of the Office of Wellness Services and the Fitness Center to promote health and wellness while encouraging members to engage in safe conduct while participating in Wellness Services activities and events and while utilizing recreational facilities.");
		p1.addPoliciesTerm().click();
		p1.enterPoliciesTerm().sendKeys("Accordingly, in addition to encouraging members to use good judgment, the Office of Wellness Services has adopted this policy and authorized the Fitness Center to approve rules designed to encourage safe behavior on the part of current members of the Fitness Center.");
		p1.addPoliciesTerm().click();
		p1.policies_saveAndContinue().click();
		Studios s1 = new Studios(driver);
		s1.addStudios().click();
		s1.studioName().sendKeys("Studio 790");
		s1.studioEmail().sendKeys("jyoti.kharatmol@azularc.com");
		s1.studioPhoneNo().sendKeys("5949395932");
		s1.studioCancellationNotAllowed().sendKeys("0");
		s1.saveStudio().click();
		Thread.sleep(2000);
		s1.studios_saveAndContinue().click();
		Packages pa = new Packages(driver);
		pa.createSessionPack().click();
		pa.clientType_newClients().click();
		pa.clientType_introClients().click();
		pa.clientType_continue().click();
		pa.enterNameOfSessionPack().sendKeys("Free Yoga Trail Session Pack");
		pa.enterNumberOfSessions().sendKeys("15");
		pa.selectTimes().click();
		pa.selectTimes_anyTime().click();
		pa.selectNoPurchaseLimit().click();
		Thread.sleep(2000);
		pa.sessionPackDetails_continue().click();
		pa.priceOfSessionPack().sendKeys("0");
		pa.selectPackageExpiry().click();
		pa.selectPackageExpiry_1yr().click();
		pa.selectFromEvent().click();
		pa.selectFromEvent_dateOfPurchase().click();
		pa.pricing_continue().click();
		pa.confirmation_continue().click();
		pa.sessionPack_copy().click();
		Thread.sleep(2000);
		pa.clientType_continue().click();
		pa.enterNameOfSessionPack().sendKeys(Keys.chord(Keys.CONTROL,"a"),"Yoga Session Pack");
		pa.enterNumberOfSessions().sendKeys(Keys.chord(Keys.CONTROL,"a"),"50");
		Thread.sleep(2000);
		pa.sessionPackDetails_continue().click();
		pa.priceOfSessionPack().sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
		pa.pricing_continue().click();
		pa.confirmation_continue().click();
		Thread.sleep(2000);
		pa.packages_saveAndContinue().click();
		Settings set = new Settings(driver);
		set.PromoCodesBox().click();
		PromoCodes pro = new PromoCodes(driver);
		Thread.sleep(2000);
		pro.promoCodes_skip().click();
		FitnessSessionTemplates f = new FitnessSessionTemplates(driver);
		f.addFitnessSession().click();
		f.enterSessionName().sendKeys("Yoga Beginner");
		f.selectSessionType().click();
		f.selectSession_yoga().click();
		f.selectClassDuration().click();
		f.selectClassDuration_1hr().click();
		f.enterDescription().sendKeys("Yoga is a practice that connects the body, breath, and mind. It uses physical postures, breathing exercises, and meditation to improve overall health.");
		f.addInstructors().click();
		f.selectInstructorCheckbox().click();
		f.selectServices().click();
		f.selectServices_nutrition().click();
		f.saveFitnessSession().click();
		f.fitnessSession_saveAndContinue().click();
		EmailSettings e = new EmailSettings(driver);
		Thread.sleep(2000);
		e.enterEmail().sendKeys("jyoti.kharatmol@azularc.com");
		e.emailSettings_saveAndContinue().click();
		Calendar cal = new Calendar(driver);
		cal.addSession().click();
		cal.selectSession().click();
		cal.selectSession_yogaBeginner().click();
		cal.selectStudio().click();
		cal.selectStudio_studio().click();
		cal.capacity().sendKeys("100000");
		cal.selectDate_datepicker().click();
		cal.selectDate_todayDate().click();
		cal.startTime().sendKeys("23:00");
		cal.endTime().sendKeys("23:59");
		cal.setRecurrence().click();
		cal.selectPeriodOfTime().click();
		cal.selectPeriodOfTime_week().click();
		cal.repeatDays_sat().click();
		cal.recurringSession_untilDate().sendKeys("03092026");
		cal.save_recurringSessionModal().click();
		cal.saveSession().click();		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
