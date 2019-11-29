package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(name="userName")
	//@CacheLookup
	private WebElement userNameInputBox;
	
	@FindBy(name="password")
	//@CacheLookup
	private WebElement passwordInputBox;
	
	@FindBy(name="login")
	//@CacheLookup
	private WebElement loginButton;
	
	public WebElement getUserNameInputBox() {
		return userNameInputBox;
	}

	public WebElement getPasswordInputBox() {
		return passwordInputBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
