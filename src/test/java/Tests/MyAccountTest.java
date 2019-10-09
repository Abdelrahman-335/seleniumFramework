package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.UserRegestrationPage;


public class MyAccountTest extends TestBase {

	HomePage  homeobject ;
	UserRegestrationPage regestrationobject ;
	MyAccountPage myAccountobject;
	LoginPage loginobject ;
	//String oldpassword ="123456";
	//String newpassword ="12345678";


	@Test(priority = 1)
	public void UsercanregestrationCorrect() 
	{
		homeobject = new HomePage (driver);
		homeobject.openRegestrationPage();
		regestrationobject = new UserRegestrationPage (driver);
		regestrationobject.userRegestration("Abdelrahman","Atef","Abdelrahman.atef158@gmail.com","123456");
		Assert.assertTrue(regestrationobject.succesmessage.getText().contains("Your registration completed"));	
	}

	@Test(priority = 2)
	public void UserCanChangePasswordCorrect()
	{
		myAccountobject = new MyAccountPage(driver);
		regestrationobject.openmyaccount();
		myAccountobject.OpenChangePasswordPage();
		myAccountobject.ChangePassword("123456", "12345678");
		Assert.assertTrue(myAccountobject.resultlbl.getText().contains("Password was change"));
	}
	@Test(priority = 3)
	public void UserLogout()

	{
		regestrationobject.userLogOut();
	}

	@Test(priority = 4)
	public void Usercanlogin()

	{
		homeobject.OpenLoginPage();
		loginobject = new LoginPage(driver);
		loginobject.UserLogin("Abdelrahman.atef158@gmail.com", "12345678");
		Assert.assertTrue(regestrationobject.lgoutlink.getText().contains("Log out"));
	}


}
