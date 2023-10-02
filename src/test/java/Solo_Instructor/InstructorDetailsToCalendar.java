package Solo_Instructor;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.Assert;
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
import Page_Objects.SoloSettings_AbstractComponents;
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
	public void InstructorSettings() throws InterruptedException, IOException
	{
		Login l = new Login(driver);
		l.username().sendKeys("jyoti.kharatmol@azularc.com");
		l.password().sendKeys("cyC3Hd)(");
		l.loginButton().click();
		
		SoloSettings_AbstractComponents solo = new SoloSettings_AbstractComponents(driver);
		
		solo.waitForURLToContain("companyDetails");
		
		InstructorDetails i = new InstructorDetails(driver);
		Assert.assertEquals(i.instructorDetails_title().getText(), "Instructor Details");
		i.browseImage().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Desktop\\autoIT\\imageUpload.exe");
		i.instructorDetails_saveAndContinue().click(); 	
		
		solo.waitForURLToContain("reportSettings");
		
		ServicesAndProducts s = new ServicesAndProducts(driver);
		Assert.assertEquals(s.servicesAndProducts_title().getText(), "Services and Products");
		s.enterServiceOrProduct().sendKeys("Nutrition Consultations");
		s.addCategory().click();
		Assert.assertEquals(s.serviceAndProducts_1stcategory().getText(), "Nutrition Consultations");
		s.servicesAndProducts_saveAndContinue().click();
		
		solo.waitForURLToContain("classesSettings");
		
		SessionsSettings se = new SessionsSettings(driver);
		Assert.assertEquals(se.sessionSettings_title().getText(), "Sessions Settings");
		se.enterSessionType().sendKeys("Yoga");
		se.addSessionType().click();
		Assert.assertEquals(se.newSessionAdded().getText(), "Yoga");
		se.sessionSettings_SaveAndContinue().click();		
		
		solo.waitForURLToContain("hours");
		
		PeakOrNonPeakHours p = new PeakOrNonPeakHours(driver);
		Assert.assertEquals(p.peakOrNonPeakHours_title().getText(), "Peak / Non-Peak Settings");
		p.peakOrNonPeakHours_No().click();
		p.peakOrNonPeakHours_saveAndContinue().click();
		
		solo.waitForURLToContain("clientWaiver");		
		
		ClientWaiver c = new ClientWaiver(driver);
		Assert.assertEquals(c.clientWaiver_title().getText(), "Client Waiver");
		c.uploadWaiver_browse().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Desktop\\autoIT\\fileUpload.exe");
		c.enterWaiverTerm1().sendKeys("Each member who is age 13 and older will receive a membership card. This card is required to enter the facility. You must scan your card at the Front Desk each time you enter the facility.");
		c.addWaiverTerm().click();
		c.enterWaiverTerm2().sendKeys("All members will have a picture image on file to verify their identities. Members under the age of 13 must be accompanied by an adult and must be checked in at the Front Desk by giving their name.");
		c.addWaiverTerm().click();
		c.waiverSaveAndContinue().click();

		solo.waitForURLToContain("contractTerms");
		
		PoliciesAndProcedures p1 = new PoliciesAndProcedures(driver);
		Assert.assertEquals(p1.policies_title().getText(), "Policies & Procedures");
		p1.uploadPolicies_browse().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jyoti_xfiqe3z\\Desktop\\autoIT\\policiesFileUpload.exe");
		p1.enterPoliciesTerm1().sendKeys("It is the policy of the Office of Wellness Services and the Fitness Center to promote health and wellness while encouraging members to engage in safe conduct while participating in Wellness Services activities and events and while utilizing recreational facilities.");
		p1.addPoliciesTerm().click();
		p1.enterPoliciesTerm2().sendKeys("Accordingly, in addition to encouraging members to use good judgment, the Office of Wellness Services has adopted this policy and authorized the Fitness Center to approve rules designed to encourage safe behavior on the part of current members of the Fitness Center.");
		p1.addPoliciesTerm().click();
		p1.policies_saveAndContinue().click();
		
		solo.waitForURLToContain("studios");
		
		Studios s1 = new Studios(driver);
		Assert.assertEquals(s1.studios_title().getText(), "Create Your Studios");
		s1.addStudios().click();
		Assert.assertEquals(s1.addStudioModal_title().getText(), "Studio Details");
		s1.studioName().sendKeys("Studio Fitness");
		s1.studioEmail().sendKeys("jyoti.kharatmol@azularc.com");
		s1.studioPhoneNo().sendKeys("5949395932");
		s1.studioCancellationNotAllowed().sendKeys("0");
		s1.saveStudio().click();
		Assert.assertEquals(s1.newlyCreatedStudio().getText(), "Studio Fitness");
		s1.studios_saveAndContinue().click();
		
		solo.waitForURLToContain("packages");
		
		Packages pa = new Packages(driver);
		Assert.assertEquals(pa.packages_title().getText(), "Create Packages");
		pa.createMembership().click();
		Assert.assertEquals(pa.clientType_title().getText(), "Who can purchase this membership?");
		pa.clientType_newClients().click();
		pa.clientType_introClients().click();
		pa.clientType_continue().click();
		Assert.assertEquals(pa.membershipDetails_title().getText(), "Complete the details of this membership");
		pa.membershipDetails_enterNameOfMemPack().sendKeys("1 Year Pilates Membership Pack");
		pa.membershipDetails_selectLengthOfMemPack().click();
		pa.membershipDetails_selectLength12Month().click();
		pa.membershipDetails_enterNumberOfSessions().sendKeys("30");
		pa.membershipDetails_selectSessionsTimePeriod().click();
		pa.membershipDetails_selectSessionsTimePeriodMonthly().click();	
		pa.membershipDetails_selectTimes().click();
		pa.membershipDetails_selectTimes_anyTime().click();
		pa.membershipDetails_selectNoPurchaseLimit().click();
		pa.membershipDetails_allowRolloverOfUnusedSessions().click();
		pa.membershipDetails_1YearPilatesMemPack_continue().click();
		Assert.assertEquals(pa.membershipPack_pricing_title().getText(), "What is the pricing structure for this membership?");
		pa.membershipPack_price().sendKeys("1");
		pa.membershipPack_selectPackageChargeTimePeriod().click();
		pa.membershipPack_selectMonthlyPackageChargeTimePeriod().click();
		pa.membershipPack_selectPackageChargeFromEvent().click();
		pa.membershipPack_selectPackageChargeFromEventDateOfPurchase().click();
		pa.membershipPack_pricing_continue().click();
		Assert.assertEquals(pa.membershipPack_confirmation_title().getText(), "Confirm the details below to create the package");
		pa.membershipPack_confirmation_continue().click();
		Assert.assertEquals(pa.createdMemPackName().getText(), "1 Year Pilates Membership Pack");
		
		pa.copyMemPack_1st().click();
		pa.clientType_continue().click();
		pa.membershipDetails_enterNameOfMemPack().sendKeys(Keys.chord(Keys.CONTROL,"a"),"1 Year Unlimited Membership Package");
		pa.membershipDetails_enterNumberOfSessions().click();
		pa.clientCanAttendUnlimitedSessions().click();
		pa.membershipDetails_copy_unlimitedMemPack_continue().click();
		pa.membershipPack_pricing_continue().click();	
		pa.membershipPack_confirmation_continue().click();
		Assert.assertEquals(pa.createdMemPackName().getText(), "1 Year Unlimited Membership Package");
		
		pa.copyMemPack_2nd().click();
		pa.clientType_continue().click();
		pa.membershipDetails_enterNameOfMemPack().sendKeys(Keys.chord(Keys.CONTROL,"a"),"Free First Month Membership Package");
		pa.membershipDetails_enterNumberOfSessions().sendKeys(Keys.chord(Keys.CONTROL,"a"),"25");
		pa.membershipDetails_copy_freeFirstMonthMemPack_continue().click();
		pa.membershipPack_diffFirstMonthPriceCheckbox().click();
		pa.membershipPack_enterDiffFirstMonthPrice().sendKeys("0");
		pa.membershipPack_pricing_continue().click();
		pa.membershipPack_confirmation_continue().click();
		Assert.assertEquals(pa.createdMemPackName().getText(), "Free First Month Membership Package");
	
		pa.createSessionPack().click();
		Assert.assertEquals(pa.clientType_title().getText(), "Who can purchase this Session pack?");
		pa.clientType_newClients().click();
		pa.clientType_introClients().click();
		pa.clientType_continue().click();
		Assert.assertEquals(pa.sessionDetails_title().getText(), "Complete the details of this session pack");
		pa.sessionDetails_enterNameOfSessionPack().sendKeys("Free Yoga Trail Session Pack");
		pa.sessionDetails_enterNumberOfSessions().sendKeys("15");
		pa.sessionDetails_selectTimes().click();
		pa.sessionDetails_selectTimes_anyTime().click();
		pa.sessionDetails_selectNoPurchaseLimit().click();
		pa.sessionDetails_continue().click();
		Assert.assertEquals(pa.sessionPack_pricing_title().getText(), "What is the pricing structure for this session pack?");
		pa.sessionPack_price().sendKeys("0");
		pa.sessionPack_selectExpiryTime().click();
		pa.sessionPack_selectExpiryTime_1yr().click();
		pa.sessionPack_selectFromEvent().click();
		pa.sessionPack_selectFromEventDateOfPurchase().click();
		pa.sessionPack_pricing_continue().click();
		Assert.assertEquals(pa.sessionPack_confirmation_title().getText(), "Confirm the details below to create the package");
		pa.sessionPack_confirmation_continue().click();
		Assert.assertEquals(pa.createdSessionPackName().getText(), "Free Yoga Trail Session Pack");
		
		pa.copy_sessionPack_1st().click();
		pa.clientType_continue().click();
		pa.sessionDetails_enterNameOfSessionPack().sendKeys(Keys.chord(Keys.CONTROL,"a"),"Yoga Session Pack");
		pa.sessionDetails_enterNumberOfSessions().sendKeys(Keys.chord(Keys.CONTROL,"a"),"50");
		pa.sessionDetails_continue().click();
		pa.sessionPack_price().sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
		pa.sessionPack_pricing_continue().click();
		pa.sessionPack_confirmation_continue().click();
		Assert.assertEquals(pa.createdSessionPackName().getText(), "Yoga Session Pack");
		pa.packages_saveAndContinue().click();
		
		Settings set = new Settings(driver);
	
		set.PromoCodesBox().click();
		PromoCodes pro = new PromoCodes(driver);
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
