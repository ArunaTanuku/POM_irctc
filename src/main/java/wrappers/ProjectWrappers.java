package wrappers;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

public class ProjectWrappers extends GenericWrappers{
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	} 
	
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		test.assignAuthor(testCaseAuthor);
		test.assignCategory(testCaseCategeory);
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");

	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	public void afterTest() {
		objProp=null;
	}
	
	

}
 