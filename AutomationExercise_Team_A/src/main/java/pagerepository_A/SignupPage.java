package pagerepository_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
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
	@FindBy(xpath="//a[@href='products']")
	private WebElement products;
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
	private WebElement CreateAccount;
	@FindBy(linkText="Products")
	private WebElement Products;
	@FindBy(linkText="Continue Shopping")
	private WebElement ContinueShopping;
	@FindBy(xpath="//b[text()=\"Account Created!\"]")
	private WebElement AccountCreated;
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
	@FindBy(xpath="//input[@id='susbscribe_email']")
	private WebElement susbscribe_email;
	@FindBy(xpath="//a[@id='scrollUp']")
	private WebElement scrollUp;
	@FindBy(id="country")
	private WebElement country;
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	private WebElement Continue;
	@FindBy(id="password")
	private WebElement password;
	
	public SignupPage(WebDriver driver) {
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
	public WebElement getproducts() {
		return products;
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
	public WebElement getCreateAccount() {
		return CreateAccount;
	}
	public WebElement getsusbscribe_email() {
		return susbscribe_email;
	}
	public WebElement getscrollUp() {
		return scrollUp;
	}
	public WebElement getcountry() {
		return country;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public WebElement getAccountCreated() {
		return AccountCreated;
	}

	public WebElement getpassword() {
		
		return password;
	}

}
