package pagerepository_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	@FindBy(id="sale_image")
	private WebElement sale_image;
	@FindBy(id="search_product")
	private WebElement search_product;
	@FindBy(xpath="submit_search")
	private WebElement submit_search;
	@FindBy(xpath="(//a[text()='Add to cart'])[1]")
	private WebElement fstproduct;
	@FindBy(xpath="//a[@data-product-id=\"1\"]")
	private WebElement addtocart;
	@FindBy(xpath="//button[text()=\"Continue Shopping\"]")
	private WebElement continueshopping;
	@FindBy(xpath="//u[text()='View Cart']")
	private WebElement ViewCart;
	@FindBy(xpath="//a[text()=\"Proceed To Checkout\"]")
	private WebElement ProceedToCheckout;
	@FindBy(xpath="//u[text()=\"Register / Login\"]")
	private WebElement Register;
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getsale_image() {
		return sale_image;
	}
	public WebElement getsearch_product() {
		return  search_product;
	}
	public WebElement getsubmit_search() {
		return submit_search;
	}
	public WebElement getfstproduct() {
		return fstproduct;
	}
	public WebElement getaddtocart() {
		return addtocart;
	}
	public WebElement getcontinueshopping() {
		return continueshopping;
	}
	public WebElement getviewcart() {
		return ViewCart;
	}
	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}
	public WebElement getRegister() {
		return Register;
	}
	

}
