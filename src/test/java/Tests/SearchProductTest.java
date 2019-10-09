package Tests;

import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class SearchProductTest extends TestBase {
	String productmodule = "Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	ProductDetailsPage detailsobject;
	
	@Test
	public void UsercanSearchForProduct()
	{
		searchobject = new SearchPage(driver);
		detailsobject =new  ProductDetailsPage(driver);
		searchobject.searchProduct(productmodule);
		detailsobject.openproductdetails();	
	}
	
	

}
