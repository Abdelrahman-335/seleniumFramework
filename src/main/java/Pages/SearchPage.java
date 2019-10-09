package Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="small-searchterms")
	WebElement searchtxt;
	
	@FindBy(id= "ui-id-1")
	List<WebElement> autosuggestion;
	
	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	WebElement searchBtn;
	
	public void searchProduct(String productname)
	{
		settextwebelement(searchtxt, productname);
		clickbtn(searchBtn);
	}
	
	public void productsearchusingautosuggest(String searchtxtfiled) 
	{
		settextwebelement(searchtxt, searchtxtfiled);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		autosuggestion.get(0).click();
	}
}
