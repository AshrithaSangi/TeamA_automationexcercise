package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	@FindBy(xpath="//img[@alt='Website for automation practice']")
	private WebElement img;
	@FindBy(xpath="(//a[@data-product-id='1'])[1]\"")
	private WebElement product1;
	@FindBy(xpath="//button[contains(text(),'Continue Shopping')]")
	private WebElement continueshoppingbutton;
	@FindBy(xpath="(//a[@data-product-id='2'])[1]\")")
	private WebElement product2;
	@FindBy(xpath="//u[contains(text(),'View Cart')]")
	private WebElement viewcart;
	@FindBy(xpath="//a[contains(text(),'Proceed To Checkout')]")
	private WebElement Checkout;
	@FindBy(xpath="//u[contains(text(),'Register / Login')]")
	private WebElement register;
	@FindBy(xpath="//input[@data-qa='signup-email']\"")
	private WebElement Emailtxt;
	@FindBy(name="name")
	private WebElement name;
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	private WebElement signup;
	@FindBy(id="id_gender1")
	private WebElement gender;
	@FindBy(id="password")
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
	@FindBy(xpath="//button[contains(text(),'Create Account')]")
	private WebElement CreateAc;
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	private WebElement Continue;
	@FindBy(xpath="//a[contains(text(),'Logged in as')]")
	private WebElement loggedas;
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	private WebElement cart;
	@FindBy(xpath="//a[contains(text(),'Proceed To Checkout')]")
	private WebElement checkout;
	@FindBy(name="message")
	private WebElement name1;
	@FindBy(xpath="//a[contains(text(),'Place Order')]")
	private WebElement placeorder;
	@FindBy(name="name_on_card")
	private WebElement nameoncard;
	@FindBy(name=("card_number"))
	private WebElement cardnumber;
	@FindBy(name="cvc")
	private WebElement cvc;
	@FindBy(name="expiry_month")
	private WebElement expm;
	@FindBy(name="expiry_year")
	private WebElement expye;
	@FindBy(id="submit")
	private WebElement submit;
	@FindBy(xpath="//a[contains(text(),'Download Invoice')]")
	private WebElement invoice;
	@FindBy(xpath="//a[contains(text(),'Delete Account')]")
	private WebElement delAc;
	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getimg() {
		return img;
	}
	public WebElement  getproduct1() {
		return product1;
	}
	public WebElement  getcontinueshoppingbutton() {
		return continueshoppingbutton;
	}
	public WebElement  getproduct2() {
		return product2;
	}
	public WebElement  getviewcart() {
		return viewcart;
	}
	public WebElement  getCheckout() {
		return Checkout;
	}
	public WebElement  getregister() {
		return register;
	}
	public WebElement  getEmailtxt() {
		return Emailtxt;
	}
	public WebElement  getname() {
		return name;
	}
	public WebElement  getsignup() {
		return signup;
	}
	public WebElement  getgender() {
		return gender;
	}
	public WebElement  getpassword() {
		return password;
	}
	public WebElement  getdays() {
		return days;
	}
	public WebElement  getmonths() {
		return months;
	}
	public WebElement  getyears() {
		return years;
	}
	public WebElement  getfstn() {
		return fstn;
	}
	public WebElement  getadd1() {
		return add1;
	}
	public WebElement  getstate() {
		return state;
	}
	public WebElement  getcity() {
		return city;
	}
	public WebElement  getzipcode() {
		return zipcode;
	}
	public WebElement  getCreateAc() {
		return CreateAc;
	}
	public WebElement  getContinue() {
		return Continue;
	}
	public WebElement  getloggedas() {
		return loggedas;
	}
	public WebElement  getcart() {
		return cart;
	}
	public WebElement  getcheckout() {
		return checkout;
	}
	public WebElement  getname1() {
		return name1;
	}
	public WebElement  getplaceorder() {
		return placeorder;
	}
	public WebElement  getnameoncard() {
		return nameoncard;
	}
	public WebElement  getcardnumber() {
		return cardnumber;
	}
	public WebElement  getcvc() {
		return cvc;
	}
	public WebElement  getexpm() {
		return expm;
	}
	public WebElement  getexpye() {
		return expye;
	}
	public WebElement  getsubmit() {
		return submit;
	}
	public WebElement  getdelAc() {
		return invoice;
	}
	
	
	
	
	

}
