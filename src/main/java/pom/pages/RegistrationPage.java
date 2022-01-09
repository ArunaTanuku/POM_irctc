package pom.pages;

import java.rmi.registry.Registry;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	
	public RegistrationPage enterUserName(String Username) {
		enterById("RegistrationPage.enterUserName", Username); 
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage enterPassword(String pwd) {
		enterById("RegistrationPage.enterPassword", pwd);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage ConfirmPassword(String cnfpwd) {
		enterById("RegistrationPage.ConfirmPassword", cnfpwd);
		return new RegistrationPage(driver, test);
	}
	
	
	/*public RegistrationPage PreferredLanguage() {
		clickByXpath("//*[@id=\"ui-tabpanel-3\"]/div/div[5]/p-dropdown/div");	
	
		return new RegistrationPage(driver, test);
	}*/
	
	
	public RegistrationPage SecurityQuestion(String Secque) {

	  	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[2]/span");
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div");
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage SecurityAnswer(String Secans) {
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div");
		  clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div"); 
		  enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", Secans);
		  return new RegistrationPage(driver, test);
	}
	
	public RegistrationPage ClickOnContinue() {
		clickByXpath("RegistrationPage.ClickOnContinue");
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage EnterFirstName(String Fname) {
		enterById("RegistrationPage.EnterFirstName", Fname);
		return new RegistrationPage(driver, test); 
	}
	
	
	public RegistrationPage EnterMiddleName(String Mname) {
		 enterById("RegistrationPage.EnterMiddleName", Mname);
		 return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage EnterLastName(String Lname) {
		enterById("RegistrationPage.EnterLastName", Lname);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage Gender(String gender) {		
		if(gender.equals("Male")) {
			clickByXpath("RegistrationPage.Gender_MALE");
			
		}else if(gender.equals("Female")) {
			clickByXpath("RegistrationPage.Gender");
			
		}else {
			clickByXpath("RegistrationPage.Gender");
		}
		
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage DateOfBirth(String dob, String dobY) {
		// to click on Date of birth text box
		clickByXpath("//*[@id=\"ui-tabpanel-4\"]/div/div[6]/p-calendar/span/input");
		selectValueByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]",dob);
		  selectValueByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]",dobY);
		  clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[2]/a");
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage Occupation(String occupation) {
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[2]/span");
		clickByXpath("//span[text()='"+occupation+"']");
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage MaritalStatus(String ms) {
		
		if(ms.equals("Married")) {
			clickByXpath("RegistrationPage.MaritalStatus");
			
		}else {
			clickByXpath("RegistrationPage.MaritalStatus");
		}
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage Country(String country) {
		
		selectValueByXpath("RegistrationPage.Country", country);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage EnterEmailid(String mailid) {
		enterById("RegistrationPage.EnterEmailid", mailid);
		return new RegistrationPage(driver, test); 
	}
	
	public RegistrationPage EnterMobileNo(String mobile) {
		enterByName("RegistrationPage.EnterMobileNo", mobile);
		return new RegistrationPage(driver, test);
	}
	
	public RegistrationPage Nationality(String nationality) {
		selectValueByXpath("RegistrationPage.Nationality", nationality);
		return new RegistrationPage(driver, test);
	}
	
	public RegistrationPage clickOnContinue1() {
			clickByXpath("RegistrationPage.clickOnContinue1");
		return new RegistrationPage(driver, test);
	}
	
	public RegistrationPage EnterFlatNo(String fno) {
		enterByName("RegistrationPage.EnterFlatNo", fno);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage EnterStreet(String street) {
		enterByName("RegistrationPage.EnterStreet", street);
		return new RegistrationPage(driver, test);
	}
		
	
	public RegistrationPage EnterAreaName(String area){
		enterByName("RegistrationPage.EnterAreaName", area);		
		return new RegistrationPage(driver, test);
	}
	
	public RegistrationPage Pincode(String pin) {
		enterByName("RegistrationPage.Pincode", pin);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage City(String city) {
		selectValueByXpath("RegistrationPage.City", city);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage PostOffice(String po) {
		selectValueByXpath("RegistrationPage.PostOffice", po);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage Phone(String phone) {
		enterById("RegistrationPage.Phone", phone);
		return new RegistrationPage(driver, test);
	}
	
	public RegistrationPage CopyRes(String copy) {
		
		if(copy.equalsIgnoreCase("Yes")){
			clickByXpath("RegistrationPage.CopyRes");			
		}else {
			clickByXpath("RegistrationPage.CopyRes");
			
		}
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage EnterFlatNoN(String fno) {
		enterByName("RegistrationPage.EnterFlatNoN", fno);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage EnterStreetN(String street) {
		enterByName("RegistrationPage.EnterStreetN", street);
		return new RegistrationPage(driver, test);
	}
		
	
	public RegistrationPage EnterAreaNameN(String area){
		enterByName("RegistrationPage.EnterAreaNameN", area);		
		return new RegistrationPage(driver, test);
	}
	
	public RegistrationPage PincodeN(String pin) {
		enterByName("RegistrationPage.PincodeN", pin);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage CityN(String city) {
		selectValueByXpath("RegistrationPage.CityN", city);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage PostOfficeN(String po) {
		selectValueByXpath("RegistrationPage.PostOfficeN", po);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage PhoneN(String phone) {
		enterById("RegistrationPage.PhoneN", phone);
		return new RegistrationPage(driver, test);
	}
	
	
	public RegistrationPage TnC(){
		clickByXpath("RegistrationPage.TnC");
		return new RegistrationPage(driver, test);
	}
	
	
}

