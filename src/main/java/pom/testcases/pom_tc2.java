package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import wrappers.ProjectWrappers;

public class pom_tc2 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC002";
		testCaseDescription="Accommodations";
		testCaseCategeory="Sample Tests";
		testCaseAuthor="Aruna Tanuku";
	}

	@Test
	public void accomodations() {
		
		HomePage hp = new HomePage(driver, test);
		
		hp.clickOnOkButton()
		.mousehoverOnHolidays()
		.mousehoverOnStays()
		.clickonLongue()
		.selectStationName("Jaipur")
		.selectLongues("IRCTC EXECUTIVE LONGUE JAIPUR")
		.PassengersCount("5")
		.checkInDate("2021-11-27")
		.Duration("01:00")
		.clickonBook()
		.clickonGuestUserLogin()
		.enterEmail("xyz@gmail.com")
		.enterMobileNo("995566220")
		.clickonLogin()
		//.PassengerDetails("xxyy", "25", "Female", "xyyyz","26", "Other", "yuuv", "29","Male", "lloop", "35", "Female")
		.State("Andhra Pradesh")
		.clickonSubmit()
		.verifyEmailid("\"xyz@gmail.com\"")
		.verifyMobileno("995566220")
		.Tnc()
		.MakePayment();
		
		
	}
}
