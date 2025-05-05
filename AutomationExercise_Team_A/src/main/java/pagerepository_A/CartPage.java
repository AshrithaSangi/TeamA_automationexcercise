package pagerepository_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(xpath="//a[text()=\"Proceed To Checkout\"]")
	private WebElement ProceedToCheckout;
	@FindBy(xpath="//h3[text()='Your delivery address']")
	private WebElement Yourdeliveryaddress;
	@FindBy(xpath="//a[text()='Place Order']")
	private WebElement PlaceOrder;
	@FindBy(xpath="//a[text()=' Cart']")
	private WebElement Cart;
	@FindBy(xpath="Your billing address")
	private WebElement Yourbillingaddress;
	@FindBy (xpath="//u[text()='Register / Login']")
	private WebElement RegisterLogin;
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}
	public WebElement getYourdeliveryaddress() {
		return Yourdeliveryaddress;
	}
	public WebElement getPlaceOrder() {
		return PlaceOrder;
	}
	public WebElement getCart() {
		return Cart;
	}
	public WebElement getYourbillingaddress() {
		return Yourbillingaddress;
	}
	public WebElement getRegisterLogin() {
		
		return RegisterLogin;
	}



}
