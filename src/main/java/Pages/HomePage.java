package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);	
		jae = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	@FindBy(linkText = "Register")
	WebElement registerlink ;

	@FindBy(linkText = "Log in")
	WebElement loginlink ;

	@FindBy(linkText = "Contact us")
	WebElement contactUsLink; 
	
	@FindBy(id="customerCurrency")
	WebElement changeCustomercurrncy ;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
	WebElement computerMenu;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Notebooks')]")
	WebElement noteMenu;
	
	
	public void openRegestrationPage ()
	{
		clickbtn(registerlink);
	}

	public void OpenLoginPage ()
	{
		clickbtn(loginlink);
	}

	public void openContactuspage()
	{
		scrollToBottom();
		clickbtn(contactUsLink);
	}
	
	public void customerCurencyChanged()
	{
		select=new Select(changeCustomercurrncy);
		select.selectByVisibleText("Euro");
	}
	
	public void hovermenutrue()
	{
		action.moveToElement(computerMenu)
		.moveToElement(noteMenu)
		.click().build().perform();
	}

	
	



}
