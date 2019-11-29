package methodLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.MercuryReservation2Page;
import elementRepository.MercuryReservationPage;
import genericLibrary.DriverConfiguration;
import genericLibrary.ReportGeneratorUtility;
import genericLibrary.ScreenshotUtility;

public class MercuryReservation2PageLib {
	
ScreenshotUtility sutility = new ScreenshotUtility();
	
	MercuryReservation2Page mercuryreservation2Page = PageFactory.initElements(DriverConfiguration.driver, MercuryReservation2Page.class);
	
	public void clickReserveFlights() throws Exception{
		try{
		Thread.sleep(3000);
		mercuryreservation2Page.getReserveFlightsButton().click();
		ReportGeneratorUtility.PassCase("Flight reserve button is clicked", "FlightReserveButton");
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UnableToClickReserveFlights");
			ReportGeneratorUtility.FailCase("Flight reserve button is not clicked", "FlightReserveButton_NotClicked");
		}
	}

}
