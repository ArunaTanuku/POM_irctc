package pom.pages;

import org.apache.poi.ss.usermodel.Chart;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	


	public CharterPage enterApplicantName(String applicant) {
		enterByName("CharterPage.enterApplicantName", applicant);
		return new CharterPage();
	}
	
	public CharterPage enterOrganisation(String org) {
		enterByName("CharterPage.enterOrganisation", org);
		return new CharterPage();
	}
	
	public CharterPage enterAddress(String add) {
		enterByName("CharterPage.enterAddress", add);
		return new CharterPage();
	}
	
	public CharterPage enterMobile(String mobile) {
		enterByName("CharterPage.enterMobile", mobile);
		return new CharterPage();
	}
	
	public CharterPage enterEmail(String email) {
		enterByName("CharterPage.enterEmail", email);
		return new CharterPage();
	}
	
	
	public CharterPage RequestFor(String salreq) {
		selectValueByXpath("CharterPage.RequestFor", salreq);
		return new CharterPage();
	}
	
	
	public CharterPage enterOrgStation(String orginSt) {
		enterByName("CharterPage.enterOrgStation", orginSt);
		return new CharterPage();
	}
	
	
	public CharterPage enterDesStation(String desSt) {
		enterByName("CharterPage.enterDesStation", desSt);
		return new CharterPage();
	}
	
	public CharterPage DateofDeparture(String doDep) {
		clickByName("checkInDate");
		selectValueByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[2]/select", doDep);
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[3]/span[1]/i");
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[4]/td[7]/span");
		return new CharterPage();		
	}
	
	public CharterPage DateofArrival(String doArival) {
		clickByName("checkOutDate");
		selectValueByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[2]/select", doArival);
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[3]/span[1]/i");
		clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[1]/span");
		return new CharterPage();	
	}
	
	
	public CharterPage enterDuration(String duration) {
		enterByName("CharterPage.enterDuration", duration);
		return new CharterPage();
	}
	
	public CharterPage enterCoachDetails(String coach) {
		enterByName("CharterPage.enterCoachDetails", coach);
		return new CharterPage();
	}
	
	public CharterPage enterPassengerCount(String passcount) {
		enterByName("CharterPage.enterPassengerCount", passcount);
		return new CharterPage();
	}
	
	public CharterPage enterCharterPurpose(String purpose) {
		enterByName("CharterPage.enterCharterPurpose", purpose);
		return new CharterPage();
	}
	
	public CharterPage enterAdditionalServices(String addservices) {
		enterByName("CharterPage.enterAdditionalServices", addservices);
		return new CharterPage();
	}
	
	public CharterPage clickonSubmit() {
		clickByXpath("CharterPage.clickonSubmit");
		return new CharterPage();
	}
	
	
	
}




