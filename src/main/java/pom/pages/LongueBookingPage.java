package pom.pages;

import wrappers.GenericWrappers;

public class LongueBookingPage extends GenericWrappers {

	public LongueBookingPage PassengerDetails(String pname1, String age1, String gen1, String pname2, String age2, String gen2,String pname3,String age3,String gen3, String pname4,String age4,String gen4) {
		
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input", pname1);
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input", age1);
		selectValueByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select", gen1);
		
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input", pname2);
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input", age2);
		selectValueByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select", gen2);
		
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[2]/input", pname3);
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[3]/input", age3);
		selectValueByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[4]/select", gen3);
		
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[2]/input", pname4);
		enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[3]/input", age4);
		selectValueByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[4]/select", gen4);
		
		return new LongueBookingPage();
	}
	
	public LongueBookingPage Gst(String gst) {
		selectValueByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[2]/form/div/select", gst);
		return new LongueBookingPage();
	}
	
	public LongueBookingPage enterGst(String gstno) {
		enterByName("gstNo", gstno);
		return new LongueBookingPage();
	}
	
	
	public LongueBookingPage State(String state) {
		selectValueByXpath("LongueBookingPage.State", state);
		return new LongueBookingPage();
	}
	
	public LongueBookingPage clickonSubmit() {
		clickByXpath("LongueBookingPage.clickonSubmit");
		return new LongueBookingPage();
	}
	
	
	public LongueBookingPage verifyEmailid(String gmail) {
		verifyTextById("LongueBookingPage.verifyEmailid", gmail);
		return new LongueBookingPage();
	}
	
	public LongueBookingPage verifyMobileno(String gmob) {
		verifyTextByName("LongueBookingPage.verifyMobileno", gmob);
		return new LongueBookingPage();
	}
	
	public LongueBookingPage Tnc() {
		clickByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[6]/div/label/span");
		return new LongueBookingPage();
	}
	
	public LongueBookingPage MakePayment() {
		clickByXpath("LongueBookingPage.MakePayment");
		return new LongueBookingPage();
	}
	
	
	
}




