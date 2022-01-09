package pendingTopics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsTopic {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@id='buttonFromTo']").click();
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElementsByXPath("//div[@id='divTrainsListHeader']/table/tbody/tr/td/a");
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
	}
	
}
