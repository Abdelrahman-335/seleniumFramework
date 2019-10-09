package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.AddToCompairePage;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;


public class AddToCompaireTest extends TestBase{

	SearchPage searchobject;
	ProductDetailsPage detailsobject;
	AddToCompairePage compaireobject;
	HomePage homeobject;
	
	@Test(priority = 1)
	public void userCanSearchusingAutocomplete()
	{
		searchobject=new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchobject.productsearchusingautosuggest("macb");
		detailsobject.cllicToBtn();
	}
	
	@Test(priority = 2)
	public void userSearchForSecondItem() throws InterruptedException 
	{
		searchobject=new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchobject.productsearchusingautosuggest("Asus");
		detailsobject.asusBTn();
		Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	public void openCompaireScreenForBothItem()
	{
		driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
	}
	
	@Test(priority = 4)
	public void compaireBetweenItem()
	{
		compaireobject = new AddToCompairePage(driver);
		Assert.assertTrue(compaireobject.asusProduct.getText().contains("Asus N551JK-XO076H Laptop"));
		Assert.assertTrue(compaireobject.macbProduct.getText().contains("Apple MacBook Pro 13-inch"));
		compaireobject.clickOnBtn();
		Assert.assertTrue(compaireobject.removeMessage.getText().contains("You have no"));
	}
}
