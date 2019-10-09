package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class ChangeCurrencyTest extends TestBase{
	
	HomePage homeObject;
	SearchPage searchObject;
	ProductDetailsPage productObject;
	
	@Test
	public void userCanChangeCurrency()
	{
		homeObject= new HomePage(driver);
		searchObject =new SearchPage(driver);
		productObject=new ProductDetailsPage(driver);
		
		
		homeObject.customerCurencyChanged();
		searchObject.productsearchusingautosuggest("macb");
		Assert.assertTrue(productObject.currencylogo.getText().contains("Ђ"));
		System.out.println(productObject.currencylogo.getText());
		
	}

}
