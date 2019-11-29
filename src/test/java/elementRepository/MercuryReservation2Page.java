package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MercuryReservation2Page {

	@FindBy(name="reserveFlights")
	@CacheLookup
	private WebElement reserveFlightsButton;
	
	public WebElement getReserveFlightsButton() {
		return reserveFlightsButton;
	}
}
