package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.ProductReviewPage;
import Pages.SearchPage;
import Pages.UserRegestrationPage;

public class ProductReviewTest extends TestBase
{
	ProductReviewPage ReviewObject;
	HomePage  homeobject ;
	UserRegestrationPage regestrationobject ;
	LoginPage loginobject ;
	SearchPage searchobject;
	ProductDetailsPage detailsobject;
	
	@Test(priority = 1)
	public void UsercanregestrationCorrect() 
	{
		homeobject = new HomePage (driver);
		homeobject.openRegestrationPage();
		regestrationobject = new UserRegestrationPage (driver);
		regestrationobject.userRegestration("Abdelrahman","Atef","Abdelrahman.5@gmail.com","123456");
		Assert.assertTrue(regestrationobject.succesmessage.getText().contains("Your registration completed"));	
	}
	
	@Test(priority = 2)
	public void userCanSearchusingAutocomplete()
	{
		searchobject=new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchobject.productsearchusingautosuggest("macb");
	}
	
	@Test (priority = 3)
	public void userCanAddreview()
	{
		detailsobject =new ProductDetailsPage(driver);
		detailsobject.openLinkReview();
		ReviewObject = new ProductReviewPage(driver);
		ReviewObject.enterProductReview("very good device", "You must try it");
		Assert.assertTrue(ReviewObject.ressultLbl.getText().contains("review is"));
	}

}
