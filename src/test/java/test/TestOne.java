package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import methodLibrary.HomePageLib;
import methodLibrary.MercuryReservationPageLib;

public class TestOne extends TestTwo {

	public TestOne() {

	}

	@Test
	public void bookTicket() throws Exception {
		homePage.enterUserCredentials("rahul8", "rahul8");
		mercuryReservationPage.clickFindFlightsButton();
		mercuryReservation2Page.clickReserveFlights();
		mercuryPurchasePageLib.enterPassengerDetails("abcd", "def");
		Assert.assertTrue(mercuryPurchase2PageLib.finalConfirmation(), "Flight booking is done");
	}

	@Test
	public void validateCredentialsOfUser() throws Exception {
		HomePageLib homePage = new HomePageLib();
		homePage.enterUserCredentials("rahul8", "rahul8");
		MercuryReservationPageLib mercuryReservationPageLib = new MercuryReservationPageLib();
		Assert.assertTrue(mercuryReservationPageLib.validateIfUserIsLoggedIn(),
				"User is not logged into the application");
	}

}
