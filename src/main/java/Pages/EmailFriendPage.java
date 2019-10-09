package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends PageBase{

	public EmailFriendPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="FriendEmail")
	WebElement friendEmailTxt;
	
	@FindBy(id="YourEmailAddress")
	WebElement myEmailtxt ;
	
	@FindBy(id="PersonalMessage")
	WebElement personalMessageTxt;
	
	@FindBy(xpath = "//input[@name='send-email']")
	WebElement sendEmailBtn;
	
	@FindBy (css = "div.result")
	public WebElement messagenotification;
	
	
	public void emailFriend (String friendemail,String perdonalmessage)
	{
		settextwebelement(friendEmailTxt, friendemail);
		settextwebelement(personalMessageTxt, perdonalmessage);
		clickbtn(sendEmailBtn);
	}

}
