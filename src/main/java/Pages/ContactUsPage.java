package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="FullName")
	WebElement fullNameTxt;

	@FindBy(id="Email")
	WebElement emailTxt ;

	@FindBy(id="Enquiry")
	WebElement enquiryTxt ;

	@FindBy(xpath = "//input[@name='send-email']")
	WebElement submiteBtn;

	public void contactus (String Name,String email,String enqury)
	{
		settextwebelement(fullNameTxt, Name);
		settextwebelement(emailTxt, email);
		settextwebelement(enquiryTxt, enqury);
		clickbtn(submiteBtn);
	}


}
