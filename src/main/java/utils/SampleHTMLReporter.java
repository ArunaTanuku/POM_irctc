package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleHTMLReporter {
	
	
	// Test Case Name, Test Case Description, Test Case Status, Test Step Status, Test Step Desc, Author, Categeory
	
	
	@Test
	public void sampleHTMLReport() {
		String filePath = System.getProperty("user.dir");
		
		// 1st step
		ExtentReports extent = new ExtentReports(filePath+"/reports/samplereport.html");

		// start test
		ExtentTest test = extent.startTest("Sample Test Case", "Sample Description");
		

		test.assignAuthor("Aruna");
		test.assignCategory("Sample Test Run");
		// log details		
		test.log(LogStatus.PASS, "Passed");
		test.log(LogStatus.FAIL, "Failed");
		test.log(LogStatus.PASS, "Passed");
		test.log(LogStatus.FAIL, "Failed");
		test.log(LogStatus.PASS, "Passed");
		test.log(LogStatus.PASS, "Passed");
		
		// end test
		extent.endTest(test);
		
		// end report
		extent.flush();
		
	}
	

}
