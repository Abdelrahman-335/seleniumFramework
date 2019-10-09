package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.WishListPage;

public class WishListTest extends TestBase {

	
	SearchPage searchobject;
	ProductDetailsPage detailsobject;
	WishListPage wishobject;
	
	
	@Test(priority = 1)
	public void userCanSearchusingAutocomplete()
	{
		searchobject=new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchobject.productsearchusingautosuggest("macb");
	}
	
	@Test(priority = 2)
	public void  UserCanClickOnLinkAtToWishList()
	{
		detailsobject=new ProductDetailsPage(driver);
		detailsobject.openLinkAddToWishList();
	}
	
	@Test(priority = 3)
	public void UserOpenWishListScreen()
	{
		driver.navigate().to("https://demo.nopcommerce.com/wishlist");
		wishobject = new WishListPage(driver);
		Assert.assertTrue(wishobject.productLink.getText().contains("Pro 13"));
	}
	@Test(priority = 4)
	public void UserCanRemoveProduct ()
	{
		wishobject = new WishListPage(driver);
		wishobject.openRemoveButton();
		wishobject.openUpdateWishListBtn();
		Assert.assertTrue(wishobject.messagedeleted.getText().contains("empty!"));
	}
}
