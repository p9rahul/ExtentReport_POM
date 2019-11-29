package methodLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.HomePage;
import genericLibrary.DriverConfiguration;
import genericLibrary.ReportGeneratorUtility;
import genericLibrary.ScreenshotUtility;

public class HomePageLib {

	ScreenshotUtility sutility = new ScreenshotUtility();
	
	HomePage homePage = PageFactory.initElements(DriverConfiguration.driver, HomePage.class);
	public void enterUserCredentials(String userName, String password) throws Exception{
		try{
			homePage.getUserNameInputBox().sendKeys(userName);
			homePage.getPasswordInputBox().sendKeys(password);
			homePage.getLoginButton().click();
			sutility.takeSnapShot(DriverConfiguration.driver, "userLoggedIn");
			ReportGeneratorUtility.PassCase("UserSignedIn", "UserSignedIn");
		}
		catch(Exception e){
			e.printStackTrace();
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "User_NotLoggedIn");
			ReportGeneratorUtility.FailCase("UserNotSignedIn", "UserNotSignedIn");
		}
	}
}
