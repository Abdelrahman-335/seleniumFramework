package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserCheckOutProductPage extends PageBase {

	public RegisterUserCheckOutProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	WebElement countryDropDown;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	WebElement cityTxt ;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
	WebElement addres1Txt;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	WebElement postalCodeTxt;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement phonenumberTxt;
	
	@FindBy(xpath ="//*[@id=\"billing-buttons-container\"]/input")
	WebElement btnContinue;
	
	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement btnafterone;
	
	@FindBy (xpath = "//select[@id='billing-address-select']")
	WebElement dropDownListElhagat;
	//3
	@FindBy (xpath ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/input[1]")
	WebElement theOneDay;
	//4
	@FindBy(xpath = "//input[@id='paymentmethod_0']")
	WebElement checkMonyOreder;
	
	@FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
	public WebElement endMessageConfirm;
	
	/////////////////////////////////////////////
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	
	WebElement a;
	
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement bfinal;
	
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement cfinal;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/input")
	WebElement d;
	
	public void clickD()
	{
		clickbtn(d);
	}
	
	public void clickC()
	{
		clickbtn(cfinal);
	}
	
	public void clickA()
	{
		clickbtn(a);
	}
	
	public void clickB()
	{
		clickbtn(bfinal);
	}
	
	
	
	public void clickbtnfterones()
	{
		clickbtn(btnafterone);
	}
	
	
	public void clickBtnContinue()
	{
		clickbtn(btnContinue);
	}
	public void entervalue1(String country)
	{
		select=new Select(countryDropDown);
		select.selectByVisibleText(country);
		
	}
	
	public void entervalue2(String city,String address,String postecode,String phone)
	{
		settextwebelement(cityTxt, city);
		settextwebelement(addres1Txt, address);
		settextwebelement(postalCodeTxt, postecode);
		settextwebelement(phonenumberTxt, phone);
	}
	
	public void elhagat(String addresss)
	{
		select=new Select(dropDownListElhagat);
		select.selectByVisibleText(addresss);
	}
	
	public void clickontheone()
	{
		clickbtn(theOneDay);
	}
	
	public void clickMoneyOrder()
	{
		clickbtn(checkMonyOreder);
	}
		

}
