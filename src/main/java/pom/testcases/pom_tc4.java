package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import wrappers.ProjectWrappers;

public class pom_tc4 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="Saloon Mandatory Check";
		testCaseAuthor="Aruna Tanuku";
		testCaseCategeory="Sample Testcase";
	}
	
	@Test
	public void tc4() {
		
		HomePage hp = new HomePage(driver, test);
		hp.clickOnOkButton()
		.mousehoverOnHolidays()
		.mousehoverOnStays()
		.clickonLongue()
		.clickonMenu()
		.clickonCharter()
		.clickonEnquiry()
		.enterApplicantName("Ken")
		.enterOrganisation("Mumbai")
		.enterAddress("plot:001, Ducko street")
		.enterMobile("9494610270")
		.enterEmail("kenjen@gmail.com")
		.RequestFor("Saloon Charter")
		.enterOrgStation("Mumbai")
		.enterDesStation("Delhi")
		//.DateofDeparture("30-11-2021")
		//.DateofArrival("04-12-2021")
		.enterDuration("5")
		.enterCoachDetails("SL-998")
		.enterPassengerCount("5")
		.enterCharterPurpose("To go comfy")
		.enterAdditionalServices("Personal assistance all the time")
		.clickonSubmit();
		
	}
}
