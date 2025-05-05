package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddinCheckout {
	@FindBy(linkText="Signup / Login")
	private WebElement signup;
	@FindBy(name="name")
	private WebElement name;
	@FindBy(xpath="//input[@data-qa=\"signup-email\"]")
	private WebElement email;
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	private WebElement signup1;
	@FindBy(id="id_gender1")
	private WebElement gender;
	@FindBy(xpath="//a[@href=\"/products\"]")
	private WebElement password;
	@FindBy(id="days")
	private WebElement days;
	@FindBy(id="months")
	private WebElement months;
	@FindBy(id="years")
	private WebElement years;
	@FindBy(id="first_name")
	private WebElement fstn;
	@FindBy(id="last_name")
	private WebElement lstn;
	@FindBy(id="address1")
	private WebElement add1;
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="zipcode")
	private WebElement zipcode;
	@FindBy(id="mobile_number")
	private WebElement mobnum;
	@FindBy(xpath="//button[contains(text(),'Create Account')]")
	private WebElement creAC;
	@FindBy(linkText="Continue")
	private WebElement Continue;
	@FindBy(linkText="Products")
	private WebElement Products;
	@FindBy(linkText="Continue Shopping")
	private WebElement ContinueShopping;
	@FindBy(xpath="//b[text()=\"Account Created!\"]")
	private WebElement ACtext;
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	private WebElement cart;
	@FindBy(xpath="//a[contains(text(),'Proceed To Checkout')]")
	private WebElement ProceedToCheckout;
	@FindBy(xpath="//ul[@id='address_delivery']//li[4]")
	private WebElement address_delivery;
	@FindBy(xpath="//ul[@id='address_invoice']//li[4]")
	private WebElement address_invoice;
	@FindBy(linkText="Delete Account")
	private WebElement DeleteAccount;
	@FindBy(linkText="Continue")
	private WebElement Continue1;
	
	public AddinCheckout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSignup() {
		return signup;
	}
	public WebElement getname() {
		return name;
	}
	public WebElement getemail() {
		return email;
	}
	public WebElement getsignup1() {
		return signup1;
	}
	public WebElement getgender() {
		return gender;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getdays() {
		return days;
	}
	public WebElement getmonths() {
		return months;
	}
	public WebElement getyears() {
		return years;
	}
	public WebElement getfstn() {
		return fstn;
	}
	public WebElement getlstn() {
		return lstn;
	}
	public WebElement getadd1() {
		return add1;
	}
	public WebElement getstate() {
		return state;
	}
	public WebElement getcity() {
		return city;
	}
	public WebElement getzipcode() {
		return zipcode;
	}
	public WebElement getmobnum() {
		return mobnum;
	}
	public WebElement getcreAC() {
		return creAC;
	}
	public WebElement getContinue() {
		return zipcode;
	}
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getContinueShopping() {
		return ContinueShopping;
	}
	public WebElement getcart() {
		return cart;
	}
	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}
	public WebElement getaddress_delivery() {
		return address_delivery;
	}
	public WebElement getaddress_invoice() {
		return address_invoice;
	}
	public WebElement getDeleteAccount() {
		return DeleteAccount;
	}
	public WebElement getContinue1() {
		return Continue1;
	}
	public WebElement getACtext() {
		return ACtext; 
	}
	
	
	
	

}
