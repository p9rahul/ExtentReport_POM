package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericLibrary.DriverConfiguration;
import genericLibrary.ReportGeneratorUtility;
import methodLibrary.HomePageLib;
import methodLibrary.MercuryPurchase2PageLib;
import methodLibrary.MercuryPurchasePageLib;
import methodLibrary.MercuryReservation2PageLib;
import methodLibrary.MercuryReservationPageLib;

public class TestTwo extends DriverConfiguration {

	@BeforeMethod
	public void navigateToApplication(Method method){
		ReportGeneratorUtility.logger=ReportGeneratorUtility.report.createTest(method.getName());
		DriverConfiguration.driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("test end");
	}
	
	HomePageLib homePage;
	MercuryReservationPageLib mercuryReservationPage;
	MercuryReservation2PageLib mercuryReservation2Page;
	MercuryPurchasePageLib mercuryPurchasePageLib;
	MercuryPurchase2PageLib mercuryPurchase2PageLib;
	@BeforeClass
	public void config(){
		homePage =new HomePageLib();
		mercuryReservationPage =new MercuryReservationPageLib();
		mercuryReservation2Page =new MercuryReservation2PageLib();
		mercuryPurchasePageLib =new MercuryPurchasePageLib();
		mercuryPurchase2PageLib = new MercuryPurchase2PageLib();
	}
	
	public TestTwo(){
		
	}
	
}
