package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AddToShoppingCartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.RegisterUserCheckOutProductPage;
import Pages.SearchPage;
import Pages.UserRegestrationPage;

public class RegisterUserCheckOutProductTest extends TestBase {

	HomePage  homeobject ;
	UserRegestrationPage regestrationobject ;
	LoginPage loginobject ;
	SearchPage searchobject;
	ProductDetailsPage detailsobject;
	AddToShoppingCartPage cartobject;
	RegisterUserCheckOutProductPage checkobject;

	@Test(priority = 1)
	public void UsercanregestrationCorrect() 
	{
		homeobject = new HomePage (driver);
		homeobject.openRegestrationPage();
		regestrationobject = new UserRegestrationPage (driver);
		regestrationobject.userRegestration("Abdelrahman","Atef","Abdelrahman.t15@gmail.com","123456");
		Assert.assertTrue(regestrationobject.succesmessage.getText().contains("Your registration completed"));	
	}
	
	@Test(priority = 2)
	public void userCanSearchusingAutocomplete()
	{
		searchobject=new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchobject.productsearchusingautosuggest("macb");
	}
	
	
	@Test(priority = 3)
	public void UserOpenScreenAddToCart() throws InterruptedException
	{
		detailsobject=new ProductDetailsPage(driver);
		detailsobject.clickbtnAddTocart();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.nopcommerce.com/cart");
	}
	
	@Test(priority = 4)
	public void userCheckout() throws InterruptedException
	{
		cartobject=new AddToShoppingCartPage(driver);
		cartobject.clickBTnCheckcondition();
		cartobject.clickBTnCheckBtn();
		Thread.sleep(3000);
	}
	
	@Test(priority = 5)
	public void userCheckoutSteps() throws InterruptedException
	{
		checkobject = new RegisterUserCheckOutProductPage(driver);
		//checkobject.elhagat("New Address");
		checkobject.entervalue1("Egypt");
		checkobject.entervalue2("cairo", "26cairo", "12345", "012000000");
		checkobject.clickBtnContinue();
		Thread.sleep(3000);
		checkobject.clickontheone();
		checkobject.clickbtnfterones();
		Thread.sleep(3000);
		checkobject.clickA();
		Thread.sleep(3000);
		checkobject.clickB();
		Thread.sleep(3000);
		checkobject.clickC();
		Thread.sleep(3000);
		Assert.assertTrue(checkobject.endMessageConfirm.getText().contains("has been successfully"));
		checkobject.clickD();
	}
}
