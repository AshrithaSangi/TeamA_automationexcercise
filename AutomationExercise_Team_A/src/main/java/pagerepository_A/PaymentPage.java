package pagerepository_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	@FindBy(xpath="//input[@data-qa=\"name-on-card\"]")
	private WebElement nameoncard;
	@FindBy(xpath="//label[text()=\"Card Number\"]")
	private WebElement CardNumber;
	@FindBy(name="cvc")
	private WebElement cvc;
	@FindBy(xpath="//input[@placeholder=\"MM\"]")
	private WebElement MM; 
	@FindBy(xpath="//input[@placeholder=\"YYYY\"]")
	private WebElement YYYY ; 
	@FindBy(xpath="//button[text()=\"Pay and Confirm Order\"]")
	private WebElement PayandConfirmOrder;
	@FindBy(xpath="(//div[@class=\"alert-success alert\"])[1]")
	private WebElement successalert;
	@FindBy(xpath="//a[text()='Download Invoice']")
	private WebElement DownloadInvoice;
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement Continue ;
	
	public PaymentPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getnameoncard() {
		return nameoncard;
	}
	public WebElement getCardNumber() {
		return CardNumber;
	}
	public WebElement getMM() {
		return MM;
	}public WebElement getYYYY() {
		return YYYY;
	}
	public WebElement getPayandConfirmOrder() {
		return PayandConfirmOrder;
	}
	public WebElement getsuccessalert() {
		return successalert;
	}
	public WebElement getDownloadInvoice() {
		return DownloadInvoice;
	}
	public WebElement getContinue() {
		return Continue;
	}
	

}
