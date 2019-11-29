package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DriverConfiguration {

	public DriverConfiguration(){
		
	}
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setupBrowser(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		ReportGeneratorUtility.intialiseconfig();
	}
	
	@AfterSuite
	public void closeApplicationAndTriggerEmail(){
		ReportGeneratorUtility.logger.info("Test END");
		ReportGeneratorUtility.report.flush();
		DriverConfiguration.driver.get(ReportGeneratorUtility.ReportLocation); //after execution report w
		MailUtility.sendPDFReportByGMail("FROM", "PASSWORD", "TO", "Automation execution report", "PFA");
	}
}
