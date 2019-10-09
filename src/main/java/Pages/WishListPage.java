package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase {

	public WishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//a[@class='product-name']")
	public WebElement productLink ; 
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	WebElement removeButton;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	WebElement updateWishListBtn;
	
	@FindBy(xpath = "//div[@class='no-data']")
	public WebElement messagedeleted;
		
	public void openRemoveButton()
	{
		clickbtn(removeButton);
	}
	
	public void openUpdateWishListBtn()
	{
		clickbtn(updateWishListBtn);
	}
	
	
	

}
