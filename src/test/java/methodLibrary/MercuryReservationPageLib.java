package methodLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import elementRepository.MercuryPurchasePage;
import elementRepository.MercuryReservationPage;
import genericLibrary.DriverConfiguration;
import genericLibrary.ReportGeneratorUtility;
import genericLibrary.ScreenshotUtility;

public class MercuryReservationPageLib {
	
	ScreenshotUtility sutility = new ScreenshotUtility();
	
	MercuryReservationPage mercuryreservationPage = PageFactory.initElements(DriverConfiguration.driver, MercuryReservationPage.class);
	
	public void clickFindFlightsButton() throws Exception{
		try{
		mercuryreservationPage.getContinueButton().click();
		ReportGeneratorUtility.PassCase("Find Flights button is clicked", "FindFlightsButton");
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UnableToClickContinueButton");
			ReportGeneratorUtility.FailCase("Find Flights button is not clicked", "FindFlightsButton_NotClicked");
		}
	}
	
	public boolean validateIfUserIsLoggedIn() throws Exception{
		boolean b = false;
		try{
			if(mercuryreservationPage.getDetailsPageHeader().isDisplayed()){
				b = true;
				ReportGeneratorUtility.PassCase("User is navigated to reservation page", "ReservationPage");
			}
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UserNotLoggedIn");
			ReportGeneratorUtility.FailCase("User is not navigated to reservation page", "ReservationPage_NotNavigated");
		}
		return b;
	}


}
