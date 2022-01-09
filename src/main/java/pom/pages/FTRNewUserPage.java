package pom.pages;

import wrappers.GenericWrappers;

public class FTRNewUserPage extends GenericWrappers{
	
	public FTRNewUserPage switchFtrNewUserPage() {
		switchToLastWindow();
		return new FTRNewUserPage();
	}

	public FTRNewUserPage enterUserid(String Userid) {
		enterById("FTRNewUserPage.enterUserid", Userid);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterPassword(String pwd) {
		enterById("FTRNewUserPage.enterPassword", pwd);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterConfirmPassword(String cpwd) {
		enterById("FTRNewUserPage.enterConfirmPassword", cpwd);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage SecurityQuestion(String Secque) {
		selectValueById("FTRNewUserPage.SecurityQuestion", Secque);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage SecurityAnswer(String Secans) {
		enterById("FTRNewUserPage.SecurityAnswer", Secans);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage DOB(String dobM, String dobY) {
		clickByXpath("name=\"dateOfBirth\"");
		selectValueByXpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]", dobM);
		selectValueByXpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]", dobY);
		clickByXpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a");
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage Gender(String gender) {
		if(gender.equals("Male")) {
			clickByXpath("//*[@id=\"gender0\"]");
		}
		else if(gender.equals("Female")) {
			clickByXpath("//*[@id=\"gender1\"]");
		}
		else if(gender.equals("Transgender")) {
			clickByXpath("//*[@id=\"gender2\"]");
		}
		else {
			clickByXpath("//*[@id=\"gender3\"]");
		}

		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage MaritalStatus(String ms) {
		 if(ms.equals("Married")) {
			 clickByXpath("//*[@id=\"maritalStatus0\"]");
		 }else {
			 clickByXpath("//*[@id=\"maritalStatus1\"]");
		 }
		 return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterEmail(String email) {
		enterById("FTRNewUserPage.enterEmail",email);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage Occupation(String occ) {
		selectValueById("FTRNewUserPage.Occupation", occ);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterFirstName(String Fname) {
		enterById("FTRNewUserPage.enterFirstName", Fname); 
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterMiddleName(String Mname) {
		enterById("FTRNewUserPage.enterMiddleName", Mname);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterLastName(String Lname) {
		enterById("FTRNewUserPage.enterLastName", Lname);
		return new FTRNewUserPage();
	}
	
	  
	public FTRNewUserPage Nationality(String nation) {
		selectValueById("FTRNewUserPage.Nationality",nation );
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterDoorno(String doorno) {
		enterById("FTRNewUserPage.enterDoorno", doorno);
		return new FTRNewUserPage();
	}
	
	
	public FTRNewUserPage enterStreet(String street) {
		enterById("FTRNewUserPage.enterStreet", street);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage enterLocality(String area) {
		enterById("FTRNewUserPage.enterLocality", area);
		return new FTRNewUserPage();
	}
	
	
	public FTRNewUserPage Country(String country) {
		selectValueById("FTRNewUserPage.Country", country);
		return new FTRNewUserPage();
	}
	
	
	public FTRNewUserPage enterMobile(String mobile) {
		enterById("FTRNewUserPage.enterMobile", mobile);
		return new FTRNewUserPage();
	}
	
	public FTRNewUserPage Pincode(String pin) {
		enterById("FTRNewUserPage.Pincode", pin);
		return new FTRNewUserPage();
	}
	
	
	
	
	
	
	
	
	
	
	
}
