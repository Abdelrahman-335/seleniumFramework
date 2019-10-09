package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver ;
	
	public JavascriptExecutor jae;
	public Select select ;
	public Actions action;

	
	// create constructor  
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	protected static void clickbtn(WebElement button) 
	{
		button.click();
	}
	
	protected static void settextwebelement(WebElement textelement,String value)
	{
	   textelement.sendKeys(value);
	   
	}
	
	public void scrollToBottom()
	{
		jae.executeScript("scrollBy(0,2500)");
	}
	
	public void clearitem(WebElement QTY)
	{
		QTY.clear();
	}

}
