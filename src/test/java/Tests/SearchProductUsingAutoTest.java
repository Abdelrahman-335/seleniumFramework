package Tests;

import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class SearchProductUsingAutoTest extends TestBase{
	
	SearchPage searchobject;
	ProductDetailsPage detailsobject;
	
	@Test
	public void userCanSearchusingAutocomplete()
	{
		searchobject=new SearchPage(driver);
		detailsobject=new ProductDetailsPage(driver);
		searchobject.productsearchusingautosuggest("macb");
	}

}
