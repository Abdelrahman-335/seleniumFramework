package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegestrationPage;

public class UserRegestrationTestWithFakeData extends TestBase 
{
	HomePage  homeobject ;
	UserRegestrationPage regestrationobject ;
	LoginPage loginobject ;

	Faker fakedata = new Faker();
	String firstname =fakedata.name().firstName();
	String lastname =fakedata.name().lastName();
	String email=fakedata.internet().emailAddress();
	String password=fakedata.number().digits(8).toString();

	@Test(priority = 1)
	public void UsercanregestrationCorrect() 
	{
		homeobject = new HomePage (driver);
		homeobject.openRegestrationPage();
		regestrationobject = new UserRegestrationPage (driver);
		regestrationobject.userRegestration(firstname,lastname,email,password);
		System.out.println("user data : "+ firstname +" " +lastname +" " + email +" "+ password+"");
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
		loginobject.UserLogin(email,password);
		Assert.assertTrue(regestrationobject.lgoutlink.getText().contains("Log out"));
	}

}
