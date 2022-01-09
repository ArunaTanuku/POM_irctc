package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pages.HomePage;
import pom.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class pom_tc1 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="IRCTC Sign In";
		testCaseAuthor = "Aruna";
		testCaseCategeory="Sample Tests";
	}

	@Test
	public void tc1() {
		
		HomePage hp = new HomePage(driver, test);
		
		hp.clickOnOkButton()
		.clickOnRegister()
		.enterUserName("Dhoni")
		.enterPassword("MADhoni@11")
		.ConfirmPassword("MADhoni@11")
		//.SecurityQuestion("What is your pet name?")
		//.SecurityAnswer("LoLo")
		.ClickOnContinue()
		.EnterFirstName("Mahendra")
		.EnterMiddleName("Singh")
		.EnterLastName("Dhoni")
		.Gender("Male")
		//.DateOfBirth("6", "1980")
		//.Occupation("other")
		.MaritalStatus("Married")
		.Country("India")
		.EnterEmailid("dhoni27@gmail.com")
		.EnterMobileNo("9494610270")
		.Nationality("Indian")
		.clickOnContinue1()
		.EnterFlatNo("123")
		.EnterStreet("Duckduck street")
		.EnterAreaName("duck area")
		.Pincode("500062")
		.City("Hyderabad")
		.PostOffice("Hyderabad PO")
		.Phone("04066221")
		.CopyRes("NO");
		
		
	}
	
	
}
