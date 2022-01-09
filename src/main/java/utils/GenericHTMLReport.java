package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class GenericHTMLReport {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String testCaseName, testCaseDescription, testCaseAuthor, testCaseCategeory;
	
	public void startReport() {
		 extent = new ExtentReports(System.getProperty("user.dir")+"/reports/report.html");
	}
	
	public void startTest(String testName, String description) {
		test = extent.startTest(testName, description);
	}
	
	public void logStatus(String status, String desc) {
		
		long SnapNumber = takeSnap();
		String imagePath = System.getProperty("user.dir")+"images/image"+SnapNumber+".jpg"; 
		
		if(status.equalsIgnoreCase("Pass")) {
			test.log(LogStatus.PASS, desc+test.addScreenCapture(imagePath));
		}else if(status.equalsIgnoreCase("Fail")) {
			test.log(LogStatus.FAIL, desc+test.addScreenCapture(imagePath));
		}
	}
	
	public void logStatusWithOutScreenShot(String status, String desc) {
		
		if(status.equalsIgnoreCase("Pass")) {
			test.log(LogStatus.PASS, desc);
		}else if(status.equalsIgnoreCase("Fail")) {
			test.log(LogStatus.FAIL, desc);
		}
	}

	public void endTest() {
		extent.endTest(test);
	}
	
	public void endReport() {
		extent.flush();
	}
	
	public abstract long takeSnap();
	
	
}


