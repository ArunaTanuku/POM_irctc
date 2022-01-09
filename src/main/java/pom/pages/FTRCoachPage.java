package pom.pages;

import wrappers.GenericWrappers;

public class FTRCoachPage extends GenericWrappers{
	
	public FTRCoachPage switchToFTRCoachPage() {
		switchToLastWindow();
		return new FTRCoachPage();
	}
	
	public FTRNewUserPage clickonNewUserSignup() {
		
		clickByXpath("FTRCoachPage.clickonNewUserSignup");
		return new FTRNewUserPage();
	}

	
	
}
