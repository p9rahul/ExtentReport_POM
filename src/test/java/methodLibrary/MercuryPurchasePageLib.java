package methodLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.MercuryPurchasePage;
import genericLibrary.DriverConfiguration;
import genericLibrary.ReportGeneratorUtility;
import genericLibrary.ScreenshotUtility;

public class MercuryPurchasePageLib {
	
	ScreenshotUtility sutility = new ScreenshotUtility();
	
	MercuryPurchasePage mercuryPurchasePage = PageFactory.initElements(DriverConfiguration.driver, MercuryPurchasePage.class);

	public void enterPassengerDetails(String firstName,String lastName) throws Exception{
		try{
			mercuryPurchasePage.getFirstNameInputBox().sendKeys(firstName);
			mercuryPurchasePage.getLastNameInputBox().sendKeys(lastName);
			mercuryPurchasePage.getSecureFlightsButton().click();
			ReportGeneratorUtility.PassCase("User is navigated to Passenger details Page", "PassengerDetailsPage");
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UnableToEnterUserDetails");
			ReportGeneratorUtility.FailCase("User is not navigated to Passenger details Page", "PassengerDetailsPage_NotShown");
		}
	}
	
	public boolean validateIfUserIsLoggedIn() throws Exception{
		boolean b = false;
		try{
			if(mercuryPurchasePage.getDetailsPageHeader().isDisplayed()){
				b = true;
				ReportGeneratorUtility.PassCase("User is logged in to application", "HomePage");
			}
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UserNotLoggedIn");
			ReportGeneratorUtility.FailCase("User is not logged in to application", "HomePage_NotShown");
		}
		return b;
	}

}
