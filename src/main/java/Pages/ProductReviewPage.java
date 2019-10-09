package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase {

	public ProductReviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="AddProductReview_Title")
	WebElement ReviewTitleTxt;
	
	@FindBy(id="AddProductReview_ReviewText")
	WebElement reviewTextTxt  ;
	
	@FindBy(xpath = "//input[@id='addproductrating_2']")
	WebElement radioBtn ;
	
	@FindBy(xpath = "//input[@name='add-review']")
	WebElement addReviewBtn;
	
	@FindBy(xpath = "//div[@class='result']")
	public WebElement ressultLbl;
	
	public void enterProductReview(String Rtitle, String Rtxt)
	{
		settextwebelement(ReviewTitleTxt, Rtitle);
		settextwebelement(reviewTextTxt, Rtxt);
		clickbtn(radioBtn);
		clickbtn(addReviewBtn);
	}
	
	

}
