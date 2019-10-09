package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegestrationPage extends PageBase {

	public UserRegestrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="gender-male")
	WebElement genderRaBtn;

	@FindBy(id="FirstName")
	WebElement FnTxBox;

	@FindBy(id="LastName")
	WebElement LnTxBox;

	@FindBy(id="Email")
	WebElement EmTxBox;

	@FindBy(id="Password")
	WebElement passTxBox;

	@FindBy(id="ConfirmPassword")
	WebElement coPasTxBox;

	@FindBy(id="register-button")
	WebElement RegBtn;

	public @FindBy(css = "div.result" )
	WebElement succesmessage ;

	public @FindBy(linkText ="Log out")
	WebElement lgoutlink;

	@FindBy(linkText = "My account")
	WebElement myaccountlink ;

	public void userRegestration(String firstName,String lastName, String email,String password)
	{
		clickbtn(genderRaBtn);
		settextwebelement(FnTxBox, firstName);
		settextwebelement(LnTxBox, lastName);
		settextwebelement(EmTxBox, email);
		settextwebelement(passTxBox, password);
		settextwebelement(coPasTxBox, password);
		clickbtn(RegBtn);

	}

	public void userLogOut ()

	{
		clickbtn(lgoutlink);
	}

	public void openmyaccount()
	{
		clickbtn(myaccountlink);
	}
}
