package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import utils.GenericHTMLReport;

public class GenericWrappers extends GenericHTMLReport implements Wrappers{
	
	public static RemoteWebDriver driver;
	public static Properties objProp;
	
	
	public void loadObjects() {
		try {
			objProp=new Properties();
			objProp.load(new FileInputStream("./src/test/java/Object.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try { 
			String folderpath = System.getProperty("user.dir");
			if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", folderpath+"/drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", folderpath+"");
				 driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", folderpath+"");
				 driver = new InternetExplorerDriver();
				 
				 
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			//logStatus("Pass", "The "+browser+" Browser Launched Successfully and loaded url as - "+url);
			logStatus("Pass", "The "+browser+" Browser Launched Successfully and loaded url as - "+url);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Browser Got Closed Due to Unknown Error");
		}finally {
			 
		}
		
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(objProp.getProperty(idValue)).sendKeys(data);
			logStatus("Pass", "The Element Identified Using ID Value as - "+idValue+" and entered data as -"+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to Identify the element using Id Value as - "+idValue+" to enter the data as "+data);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to Identify the element using Id Value as - "+idValue+" to enter the data as "+data);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using ID value as -"+idValue+"to enter the data as"+data);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using ID value as -"+idValue+"to enter the data as"+data);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using ID value as -"+idValue+"to enter the data as"+data);
		}finally {
			 
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			logStatus("Pass", "The Element identified using Name as" +nameValue +" and entered data as-" +data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to identify the element using Name value as -"+nameValue+"to enter the data as"+data);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using Name value as -"+nameValue+"to enter the data as"+data);
		}catch (ElementNotInteractableException  e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using Name value as -"+nameValue+"to enter the data as"+data);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using Name value as -"+nameValue+"to enter the data as"+data);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using Name value as -"+nameValue+"to enter the data as"+data);
		}finally {
			 
			
		}
		
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			logStatus("Pass", "The Element identified using Xpath as" +xpathValue +" and entered data as-" +data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to identify the element using XPath value as -"+xpathValue+"to enter the data as"+data);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using XPath value as -"+xpathValue+"to enter the data as"+data);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using XPath value as -"+xpathValue+"to enter the data as"+data);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using XPath value as -"+xpathValue+"to enter the data as"+data);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to identify the element using XPath value as -"+xpathValue+"to enter the data as"+data);
		}finally {
			 
		}
		
		
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				logStatus("Pass", "Actual title is"+title+"expected title is"+actualTitle+ ",they are same");
			}else {
				logStatus("Pass", "Actual title is"+title+ "and expected title name is"+actualTitle+", they are not same");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Pass", "No such window found with title name as"+title);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Pass", "No such window found with title name as"+title);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Pass", "No such window found with title name as"+title);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Pass", "No such window found with title name as"+title);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Pass", "No such window found with title name as"+title);
		}finally {
			 
		}
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String textid = driver.findElementById(id).getText();
			if (textid.equals(text)) {
				logStatus("Pass", "Actual text is"+textid+"and verified text is"+text+" and they are both are same -VERIFIED");
			}else {
				logStatus("Pass", "Actual text is"+textid+"and verified text is"+text+" and they are both are not same");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+id);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+id);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+id);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+id);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+id);
		}finally {
			 
		}
	}
	
	
	@Override
	public void verifyTextByName(String name, String text) {
		// TODO Auto-generated method stub
		 try {
			String textname = driver.findElementByName(name).getText();
			 if(textname.equals(name)) {
				 logStatus("Pass", "Actual text is"+textname+"and verified text is"+name+"they both are same");
			 }else {
				 logStatus("Pass", "Actual text is"+textname+"and verified text is"+name+" and they are both are not same");
			 }
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+name);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+name);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+name);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the id element"+name);
		}finally {
			 
		}
		
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String textXpath = driver.findElementByXPath(xpath).getText();
			if(textXpath.equals(text)) {
				logStatus("Pass", "Actual text is"+textXpath+"expected text is"+text+"and they both are same");
			}else {
				logStatus("Pass", "Actual text is"+textXpath+"expected text is"+text+"and they both are not same");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}finally {
			 
			
		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String textXpath1 = driver.findElementByXPath(xpath).getText();
			if(textXpath1.contains(xpath)) {
				logStatus("Pass", "Actual text is"+textXpath1+"expected text is"+text+"and they both are same");
			}else {
				logStatus("Pass", "Actual text is"+textXpath1+"expected text is"+text+"and they both are not same");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Pass", "Not able to verify the text as"+text+"from the element Xpath"+xpath);
		}finally {
			 
		}
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			logStatus("Pass", "The Element identified using ID value as" +id+ "and clicked on the button"); 
		}
		
		catch (NoSuchElementException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+id);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Not able to click on the button located by classname as"+id);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+id);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+id);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+id);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+id);
		}finally {
			 
		}
	
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			logStatus("Pass", "The Element identified using classname value as" +classVal+ "and clicked on the button"); 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Not able to click on the button located by classname as"+classVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+classVal);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+classVal);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+classVal);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+classVal);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by classname as"+classVal);
		}finally {
			 
		}
	} 

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			logStatus("Pass", "The Element identified using name value as" +name+ "and clicked on the button"); 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Not able to click on the button located by name as"+name);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by name as"+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by name as"+name);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by name as"+name);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by name as"+name);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by name as"+name);
		}finally {
			 
		}
		
		
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			logStatus("Pass", "The Element identified using linktext as" +name+ "and clicked on the button"); 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Not able to click on the button located by Linktext "+name);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by Linktext "+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by Linktext "+name);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by Linktext "+name);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by Linktext "+name);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Not able to click on the button located by Linktext "+name);
		}finally {
			 
		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			logStatus("Pass", "The Element identified using linktext as" +name+ "and clicked on the button"); 
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to click on the button located by Linktext "+name);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by Linktext "+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by Linktext "+name);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by Linktext "+name);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by Linktext "+name);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by Linktext "+name);
		}
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(objProp.getProperty(xpathVal)).click();
			logStatus("Pass", "The Element identified using Xpath as" +xpathVal+ "and clicked the button"); 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}finally {
			 
		}
		
	}
	
	public void clickByXpath(WebElement xpathValue, String xpathVal) {
		// TODO Auto-generated method stub
		try {
			xpathValue.click();
			logStatus("Pass", "The Element identified using Xpath as" +xpathVal+ "and clicked the button"); 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}finally {
			 
		}
		
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			logStatus("Pass", "Element identified using Xpath locator"+xpathVal+"and clicked ");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to click on the button located by xpath value"+xpathVal);
		}
	}

	
	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		
		String text = null ;
		try {
			 text = driver.findElementById(idVal).getText();
			 logStatus("Pass", "Getting the text using ID locator"+idVal);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to get the text using ID locator"+idVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+idVal);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+idVal);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+idVal);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+idVal);
		}finally {
			 
		}
		
		return text;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		 String text = null;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			logStatus("Pass", "Gettting the text using Xpath locator"+xpathVal);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to get the text using ID locator"+xpathVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+xpathVal);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+xpathVal);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+xpathVal);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to get the text using ID locator"+xpathVal);
		}finally {
			 
		}
		return text;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement visibletext = driver.findElementById(id);
			Select s1 = new Select(visibletext);
			s1.selectByVisibleText(value);
			logStatus("Pass", "Element identified using ID"+id+"and selected the value from "+value+"using"+visibletext);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}finally {
			 
		}
	}
	
	
	@Override
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement val = driver.findElementById(id);
			Select s3 = new Select(val);
			s3.selectByValue(value);
			logStatus("Pass", "Element identified using ID"+id+"and selected the value from "+value+"using"+val);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+id);
		}finally {
			 
		}
	}
	@Override
	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement val1 = driver.findElementByName(name);
			Select s4 = new Select(val1);
			s4.selectByValue(value);
			logStatus("Pass", "Element identified using ID"+name+"and selected the value from "+value+"using"+val1);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to select the value from"+value+"using id"+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+name);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+name);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+name);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+name);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+name);
		}finally {
			 
		}
	}

	@Override
	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement val2 =driver.findElementByXPath(xpath);
			Select s5 = new Select(val2);
			s5.selectByValue(value);
			logStatus("Pass", "Element identifed by using Xpath value"+xpath+" and selected the value from"+value+"using"+val2);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to select the value from"+value+"using id"+xpath);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+xpath);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+xpath);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+xpath);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+xpath);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select the value from"+value+"using id"+xpath);
		}finally {
			 
		}
	} 
	
	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement index = driver.findElementById(id);
			Select s2 = new Select(index);
			s2.selectByIndex(value);
			logStatus("Pass", "Element identifed using Id value"+id+"and selected the value from"+value+"by using"+index);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to select value from"+value+"using id"+id);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select value from"+value+"using id"+id);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select value from"+value+"using id"+id);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select value from"+value+"using id"+id);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select value from"+value+"using id"+id);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to select value from"+value+"using id"+id);
		}finally {
			 
		}
	}
	
	
	

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> parent = driver.getWindowHandles();
			int i=0;
			
			for  (String pw : parent) {
				driver.switchTo().window(pw);
				i++;
				if(i==1) {
					break;
				}
			}
			logStatus("Pass", "Switched to parent window");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Switch to parent window failed");
		}finally {
			 
		}
	}
		

	
	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			String win1 = driver.getWindowHandle();
			logStatus("Pass", win1);
			
			Set<String> win2 = driver.getWindowHandles();
			
			 
			for(String shift:win2) {
				driver.switchTo().window(shift);
			}
			logStatus("Pass", "Switched to next tab in the browser");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Switched to next tab failed");
		}finally {
			 
		}
		
	}
	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			logStatus("Pass", "Alert accepted");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Alert not found to accept");
		}finally {
			 
		}
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			logStatus("Pass", "Alert dismissed");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block			
			logStatus("Fail", "Alert not found to dismiss");
		}finally {
			 
		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
			logStatus("Pass", "Received the alert text successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Alert text not found");
		}finally {
			 
		}
		return text;
		
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		long number = System.currentTimeMillis();
		File image = driver.getScreenshotAs(OutputType.FILE);
		File path =new File(System.getProperty("user.dir")+"images/image"+number+".jpg");
		try {
			FileUtils.copyFile(image, path);
			//logStatus("Pass", "Screenshot saved ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		
		return number;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			logStatus("Pass", "Browser closed successfully");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "No window found to close");
		}
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			logStatusWithOutScreenShot("Pass", "All windows are closed successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logStatusWithOutScreenShot("Fail", "unable to close all windows");
		}
		
	}

	@Override
	public void mouseHoverById(String idValue) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(idValue);
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
			logStatus("Pass", "Element identifed using Id value"+idValue+"and mousehover is performed successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to mousehover the element located by id value"+idValue);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+idValue);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+idValue);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+idValue);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+idValue);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+idValue);
		}finally {
			 
		}
	}

	@Override
	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementByXPath(xpath);
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
			logStatus("Pass", "Element identifed using Xpath value"+xpath+"and mousehover is performed successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("Fail", "Unable to mousehover the element located by id value"+xpath);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+xpath);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+xpath);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+xpath);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+xpath);
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("Fail", "Unable to mousehover the element located by id value"+xpath);
		}finally {
			 
		}
	}

	@Override
	public void waitForSomeTime(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	

	

	

	

	

	
	
	

}
