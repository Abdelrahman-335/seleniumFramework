package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddToShoppingCartPage extends PageBase {

	public AddToShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//td[@class='remove-from-cart']")
	WebElement checkBoxRemove;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	WebElement updateShoppingCartBtn;
	
	@FindBy (xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")
	WebElement qtyBox;

	@FindBy(xpath="//div[@class='no-data']")
	public WebElement removemessage;
	
	@FindBy(xpath="//span[@class='product-subtotal']")
	public WebElement newTotalValue;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	WebElement conditionCheckBox;
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkoutBtn;
	
	public void clickCheckBox()
	{
		clickbtn(checkBoxRemove);
	}
	public void clickBtnupdateShoppingCart()
	{
		clickbtn(updateShoppingCartBtn);
	}
	
	public void updatevlue (String Qty)
	
	{
		settextwebelement(qtyBox, Qty);
	}
	
	public void cleravaluess()
	{
		clearitem(qtyBox);
	}
	public void clickBTnCheckcondition()
	{
		clickbtn(conditionCheckBox);
	}
	public void clickBTnCheckBtn()
	{
		clickbtn(checkoutBtn);
	}
}
