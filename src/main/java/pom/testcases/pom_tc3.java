package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import wrappers.ProjectWrappers;

public class pom_tc3 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		 testCaseName="TC003";
		 testCaseDescription="FTR Signup";
		 testCaseCategeory="Sample Testcase";
		 testCaseAuthor="Aruna Tanuku";
	}

	@Test
	public void tc3() {
		
		HomePage hp = new HomePage(driver, test);
		hp.clickOnOkButton()
		.mousehoverOnTrains()
		.clickonFTRcoach()
		.switchToFTRCoachPage()
		.clickonNewUserSignup()
		.switchFtrNewUserPage()
		.enterUserid("KimK")	
		.enterPassword("WestK@1122")
		.enterConfirmPassword("WestK@1122")
		.SecurityQuestion("What is your Petname ?")
		.SecurityAnswer("LoLo")
		.DOB("07", "1980")
		.Gender("Female")
		.MaritalStatus("Married")
		.enterEmail("kimkw@gmail.com")
		.Occupation("Others")
		.enterFirstName("Kim")
		.enterMiddleName("K")
		.enterLastName("West")
		.Nationality("Indian")
		.enterDoorno("002")
		.enterStreet("ducko Street")
		.enterLocality("Bucko")
		.Country("India")
		.enterMobile("996655220")
		.Pincode("500062");
		
		
	}
}
