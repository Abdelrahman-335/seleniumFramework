package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegestrationPage;
import data.ExcellReader;

public class UserRegestrationUsingExcelSheet extends TestBase  {
	
	HomePage  homeobject ;
	UserRegestrationPage regestrationobject ;
	LoginPage loginobject ;
	
	
	@DataProvider(name ="ExcelData")
	public Object[][] userRegestrationData() throws IOException
	{
		ExcellReader ER =new ExcellReader();
		return ER.getExcelData();
	}
	
	@Test(priority = 1,dataProvider="ExcelData")
	public void UsercanregestrationCorrect(String firstname,String lastname ,String email,String password ) 
	{
		homeobject = new HomePage (driver);
		homeobject.openRegestrationPage();
		regestrationobject = new UserRegestrationPage (driver);
		regestrationobject.userRegestration(firstname,lastname,email,password);
		Assert.assertTrue(regestrationobject.succesmessage.getText().contains("Your registration completed"));
		regestrationobject.userLogOut();
		homeobject.OpenLoginPage();
		loginobject = new LoginPage(driver);
		loginobject.UserLogin(email,password);
		Assert.assertTrue(regestrationobject.lgoutlink.getText().contains("Log out"));
		regestrationobject.userLogOut();
	}
}
