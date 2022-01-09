package pom.pages;

import java.util.function.LongUnaryOperator;

import wrappers.GenericWrappers;

public class LonguePage extends GenericWrappers {
	
	public LonguePage selectStationName(String stname) {
		
		selectValueByXpath("LonguePage.selectStationName", stname);
		
		return new LonguePage();
	}

	public LonguePage selectLongues(String longue) {
		selectValueByXpath("LonguePage.selectLongues", longue);
		return new LonguePage();
	}
	
	public LonguePage PassengersCount(String passengersNo) {
		selectValueByXpath("LonguePage.PassengersCount", passengersNo);
		return new LonguePage();
	}
	
	public LonguePage checkInDate(String chkinDate) {
		clickByName("acservicecheckindate");
		selectValueByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[2]/select", chkinDate);		
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[4]/td[6]/span");
		
		return new LonguePage();
	}
	
	public LonguePage checkInTime(String chkinTime) {
		
		selectValueByXpath("LonguePage.checkInTime", chkinTime);		
		return new LonguePage();
	}
	
	public LonguePage Duration(String duration) {
		selectValueByXpath("LonguePage.Duration", duration);		
		return new LonguePage();
	}
	
	public LonguePage clickonBook() {
		clickByXpath("LonguePage.clickonBook");
		return new LonguePage();
	}
	
	public LonguePage clickonGuestUserLogin() {
		clickByXpath("LonguePage.clickonGuestUserLogin");
		return new LonguePage();
	}
	
	public LonguePage enterEmail(String gmail) {
		enterById("LonguePage.enterEmail", gmail);
		return new LonguePage();		
	}
	
	public LonguePage enterMobileNo(String gmob) {
		enterByName("LonguePage.enterMobileNo", gmob);
		return new LonguePage();
	}
	
	
	public LongueBookingPage clickonLogin() {
		clickByXpath("LonguePage.clickonLogin");
		return new LongueBookingPage();
	}
	

	// menu at top right corner
	public LonguePage clickonMenu() {
		clickByXpath("LonguePage.clickonMenu");
		return new LonguePage();
	}
	
	
	//top right corner --> menu--> charter
	public LonguePage clickonCharter() {
		clickByXpath("LonguePage.clickonCharter");
		return new LonguePage();
	}
	
	public LonguePage switchtoLonguePage() {
		switchToParentWindow();
		return new LonguePage();
	}
	
	public CharterPage clickonEnquiry() {
		clickByXpath("CharterPage.clickonEnquiry");
		return new CharterPage();
	}
		
	
}
