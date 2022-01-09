package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import wrappers.ProjectWrappers;

public class pom_tc5 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription=" Accommodations - GST Validation";
		testCaseAuthor = "Aruna Tanuku";
		testCaseCategeory="Sample Tests";
	}


	@Test
	public void tc4() {
		
		HomePage hp = new HomePage(driver, test);
		hp.clickOnOkButton()
		.mousehoverOnHolidays()
		.mousehoverOnStays()
		.clickonLongue()
		.selectStationName("Jaipur")
		.selectLongues("IRCTC EXECUTIVE LONGUE JAIPUR")
		.PassengersCount("5")
		.checkInDate("2021-11-27")
		.checkInTime("01:00")
		.Duration("05:00")
		.clickonBook()
		.clickonGuestUserLogin()
		.enterEmail("xyz@gmail.com")
		.enterMobileNo("995566220")
		.clickonLogin()
		.Gst("YES")
		.enterGst("5522000")
		.PassengerDetails("xxyy", "25", "Female", "xyyyz","26", "Other", "yuuv", "29","Male", "lloop", "35", "Female")
		.State("Andhra Pradesh")
		.clickonSubmit();
	
	}

}
