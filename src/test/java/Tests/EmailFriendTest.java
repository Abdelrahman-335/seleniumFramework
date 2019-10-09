package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EmailFriendPage;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.UserRegestrationPage;

public class EmailFriendTest extends TestBase {
	
	UserRegestrationPage regestrationObject;
	SearchPage searchObject;
	ProductDetailsPage productobject;
	EmailFriendPage emailobject ;
	HomePage homeObject;
	
	@Test
	public void useEmailfriend ()
	{
		regestrationObject = new UserRegestrationPage (driver);
		searchObject = new SearchPage(driver);
		productobject = new ProductDetailsPage(driver);
		emailobject =new EmailFriendPage(driver);
		homeObject = new HomePage(driver);
		
		homeObject.openRegestrationPage();
		regestrationObject.userRegestration("ahmed", "saber", "saber2@gmail.com", "123456");
		searchObject.productsearchusingautosuggest("macb");
		productobject.openEmailFriend();
		emailobject.emailFriend("karim@sms.com","Its greate product type");
		Assert.assertTrue(emailobject.messagenotification.getText().contains("message"));
	}
	
	

}
