package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AddToShoppingCartPage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class AddToShoppinhCartTest extends TestBase {

	SearchPage searchobject;
	ProductDetailsPage detailsobject;
	AddToShoppingCartPage cartobject;
	
	@Test(priority = 1)
	public void userCanSearchusingAutocomplete()
	{
		searchobject=new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchobject.productsearchusingautosuggest("macb");
	}
	
	@Test(priority = 2)
	public void UserOpenScreenAddToCart() throws InterruptedException
	{
		detailsobject=new ProductDetailsPage(driver);
		detailsobject.clickbtnAddTocart();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.nopcommerce.com/cart");
	}
	
	@Test(priority = 3)
	public void userUpdateQty () throws InterruptedException
	{
		cartobject= new AddToShoppingCartPage(driver);
		Thread.sleep(3000);
		cartobject.cleravaluess();
		Thread.sleep(3000);
		cartobject.updatevlue("4");
		cartobject.clickBtnupdateShoppingCart();
		Assert.assertTrue(cartobject.newTotalValue.getText().contains("$7,200.00"));
	}
	
	@Test(priority = 4)
	public void removeitems()
	{
		cartobject= new AddToShoppingCartPage(driver);
		cartobject.clickCheckBox();
		cartobject.clickBtnupdateShoppingCart();
		Assert.assertTrue(cartobject.removemessage.getText().contains("Your Shopping Cart is empty!"));
	}
	
	
	
}
