package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

public class ProductMenueHoveTest extends TestBase{
	

	HomePage homeobject;
	
	@Test
	public void UserCanSelectHoverIcon()
	{
		homeobject =new HomePage(driver);
		
		homeobject.hovermenutrue();
		
		
	}
}
