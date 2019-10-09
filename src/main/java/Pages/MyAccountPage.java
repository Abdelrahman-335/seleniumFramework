package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Change password')]")
	WebElement changePasswordLink;
	
	@FindBy(id = "OldPassword")
	WebElement OldPasswordtxt ;
	
	@FindBy(id="NewPassword")
	WebElement NewPasswordtxt;
	
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmPasswordtxt;

	@FindBy(xpath = "//input[@class='button-1 change-password-button']")
	WebElement BtnChangePassword;
	
	@FindBy(css ="div.result")
	public WebElement resultlbl;
	
	public void OpenChangePasswordPage()
	{
		clickbtn(changePasswordLink);
	}
	public void ChangePassword(String oldpassword,String newpassword)
	{
		settextwebelement(OldPasswordtxt, oldpassword);
		settextwebelement(NewPasswordtxt, newpassword);
	    settextwebelement(confirmPasswordtxt, newpassword);
	    clickbtn(BtnChangePassword);
	}

}
