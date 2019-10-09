package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}


	
	@FindBy(id = "Email")
	WebElement emailtxt ;

	@FindBy(id = "Password")
	WebElement passtxt ;
	

	@FindBy(css = "input.button-1.login-button")
	WebElement logBtn ;
	
	public void UserLogin (String email ,String password)
	
	{
		settextwebelement(emailtxt, email);
		settextwebelement(passtxt, password);
		clickbtn(logBtn);
	}
	
	
	

}
