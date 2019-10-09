package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegestrationPage;

public class UserRegestrationTest extends TestBase 
{
	HomePage  homeobject ;
	UserRegestrationPage regestrationobject ;
	LoginPage loginobject ;
	

	@Test(priority = 1)
	public void UsercanregestrationCorrect() 
	{
		homeobject = new HomePage (driver);
		homeobject.openRegestrationPage();
		regestrationobject = new UserRegestrationPage (driver);
		regestrationobject.userRegestration("Abdelrahman","Atef","Abdelrahman.atef146@gmail.com","123456");
		Assert.assertTrue(regestrationobject.succesmessage.getText().contains("Your registration completed"));	
	}
	@Test(dependsOnMethods = ("UsercanregestrationCorrect"))
	public void UserLogout()
	
	{
		regestrationobject.userLogOut();
	}
	
	@Test(dependsOnMethods = ("UserLogout"))
	public void Usercanlogin()
	
	{
		homeobject.OpenLoginPage();
		loginobject = new LoginPage(driver);
		loginobject.UserLogin("Abdelrahman.atef145@gmail.com", "123456");
		Assert.assertTrue(regestrationobject.lgoutlink.getText().contains("Log out"));
	}
	
}
