package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MercuryPurchasePage {


	@FindBy(name="passFirst0")
	@CacheLookup
	private WebElement firstNameInputBox;
	
	@FindBy(name="passLast0")
	@CacheLookup
	private WebElement lastNameInputBox;
	
	@FindBy(name="buyFlights")
	@CacheLookup
	private WebElement secureFlightsButton;
	
	@FindBy(xpath="//font[contains(text(),'Details')]")
	@CacheLookup
	private WebElement detailsPageHeader;
	
	public WebElement getFirstNameInputBox() {
		return firstNameInputBox;
	}

	public WebElement getLastNameInputBox() {
		return lastNameInputBox;
	}

	public WebElement getSecureFlightsButton() {
		return secureFlightsButton;
	}
	
	public WebElement getDetailsPageHeader() {
		return detailsPageHeader;
	}
}
