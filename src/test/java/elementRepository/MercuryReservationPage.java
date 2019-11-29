package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MercuryReservationPage {

	@FindBy(name = "findFlights")
	@CacheLookup
	private WebElement continueButton;

	@FindBy(xpath = "//font[contains(text(),'Details')]")
	@CacheLookup
	private WebElement detailsPageHeader;

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getDetailsPageHeader() {
		return detailsPageHeader;
	}

}
