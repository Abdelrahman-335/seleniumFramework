package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCompairePage extends PageBase{

	public AddToCompairePage(WebDriver driver) {
		super(driver);
		
	}
		@FindBy (xpath = "//tr[@class='product-name']//td[2]")
		public WebElement asusProduct;
		
		@FindBy(xpath = "//tr[@class='product-name']//a[contains(text(),'Apple MacBook Pro 13-inch')]")
		public WebElement macbProduct;
		
		@FindBy (xpath = "//a[@class='clear-list']")
		WebElement removeBtn;	
		
		@FindBy(xpath = "//div[@class='no-data']")
		public WebElement removeMessage;
		
		public void clickOnBtn()
		{
			clickbtn(removeBtn);
		}
		
		


}
