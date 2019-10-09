package Tests;

import org.testng.annotations.Test;

import Pages.ContactUsPage;
import Pages.HomePage;

public class ContactUsTest extends TestBase{

	HomePage home ;
	ContactUsPage contactobject;

	@Test
	public void userCanUseContactUs()
	{
		home = new HomePage(driver);
		contactobject = new ContactUsPage(driver);
		home.openContactuspage();
		contactobject.contactus("Abdelrahman", "abdelrahman@gmail.com", "yes we can do it");
	}

}
