package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	
	}
	
	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Apple MacBook Pro 13-inch')]")
	WebElement ProductLink;
	
	@FindBy(xpath = "//input[@class='button-2 email-a-friend-button']")
	WebElement emailAfriendlink;
	
	@FindBy(xpath="//span[@class='price-value-2']")
	public WebElement currencylogo;
	
	@FindBy(linkText="Add your review")
	WebElement addLinkReview;
	
	@FindBy(xpath = "//a[@class='ico-wishlist']")
	WebElement wishlistLink;
	
	@FindBy(xpath = "//input[@id='add-to-wishlist-button-4']")
	WebElement addToWishList;
	
	@FindBy(xpath = "//a[contains(text(),'wishlist')]")
	WebElement closePopup;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[10]/div[2]/input[1]")
	WebElement addToCpmpareListBtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[8]/div[2]/input[1]")
	WebElement asusCompaoireBtn;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-4']")
	WebElement addToCartBtn;
	
	public void openproductdetails()
	{
		clickbtn(ProductLink);
	}
	
	public void openEmailFriend()
	{
		clickbtn(emailAfriendlink);
	}
	
	public void openLinkReview()
	{
		clickbtn(addLinkReview);
	}
	
	public void openlinkWishList()
	{
		clickbtn(wishlistLink);
	}
	
	public void openLinkAddToWishList()
	{
		clickbtn(addToWishList);
	}
	
	public void clickkOnPopup()
	{
		clickbtn(closePopup);
	}
	
	public void cllicToBtn()
	{
		clickbtn(addToCpmpareListBtn);
	}
	
	public void asusBTn()
	{
		clickbtn(asusCompaoireBtn);
	}
	
	public void clickbtnAddTocart()
	{
		clickbtn(addToCartBtn);
	}

}
