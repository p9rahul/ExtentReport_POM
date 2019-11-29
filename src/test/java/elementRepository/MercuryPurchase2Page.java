package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MercuryPurchase2Page {
	
	@FindBy(xpath="//font[contains(text(),'itinerary has been booked!')]")
	@CacheLookup
	private WebElement flightConfirmation;
	
	public WebElement getFlightConfirmation() {
		return flightConfirmation;
	}

}
