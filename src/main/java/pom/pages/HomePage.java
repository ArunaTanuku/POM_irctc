package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	
	@FindBy(xpath="/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]")
	private WebElement clickOnRegister;
	
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	
	
	public HomePage clickOnOkButton() {
		clickByXpath("HomePage.clickOnOkButton");
		return new HomePage(driver, test);
	}
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(clickOnRegister, "Click On Register Button");
		return new RegistrationPage(driver, test);
	}
	
	public HomePage mousehoverOnHolidays() {
		mouseHoverByXpath("HomePage.mousehoverOnHolidays");
		return new HomePage(driver, test);		
	}
	
	public HomePage mousehoverOnStays() {
		mouseHoverByXpath("HomePage.mousehoverOnStays");
		return new HomePage(driver, test);	
	}
	public LonguePage clickonLongue() {
		
		clickByXpath("LonguePage.clickonLongue");
		return new LonguePage();
	}
	
	public LonguePage switchtonexttab() {
		switchToLastWindow();
		return new LonguePage();
	} 
	
	public LongueBookingPage switLongueBookingPage() {
		switLongueBookingPage();
		return new LongueBookingPage(); 
	}
	public HomePage mousehoverOnTrains() {
		
		mouseHoverByXpath("HomePage.mousehoverOnTrains");
		return new HomePage(driver, test);
		
	}
	
	
	public FTRCoachPage clickonFTRcoach() {
		
		clickByXpath("FTRCoachPage.clickonFTRcoach");
		return new FTRCoachPage();
	}
	
	 
	 
}
