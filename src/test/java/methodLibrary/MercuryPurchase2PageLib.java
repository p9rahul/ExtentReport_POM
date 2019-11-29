package methodLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.MercuryPurchase2Page;
import elementRepository.MercuryPurchasePage;
import genericLibrary.DriverConfiguration;
import genericLibrary.ReportGeneratorUtility;
import genericLibrary.ScreenshotUtility;

public class MercuryPurchase2PageLib {

ScreenshotUtility sutility = new ScreenshotUtility();
	
MercuryPurchase2Page mercuryPurchase2Page = PageFactory.initElements(DriverConfiguration.driver, MercuryPurchase2Page.class);

	public boolean finalConfirmation() throws Exception{
		boolean b = false;
		try{
			if(mercuryPurchase2Page.getFlightConfirmation().isDisplayed()) {
				b = true;
				ReportGeneratorUtility.PassCase("Flight reservation is done", "FlightBookingDone");
			}
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "FlightBookingNotDone");
			ReportGeneratorUtility.FailCase("Flight booking is not done", "FlightBookingNotDone");
		}
		return b;
	}
}
