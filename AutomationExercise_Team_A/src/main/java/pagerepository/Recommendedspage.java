package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recommendedspage {
@FindBy(xpath="//h2[text()='recommended items']")
private WebElement recommendedtxt;

@FindBy(xpath="//div[@id='recommended-item-carousel']//a[@data-product-id=\"1\"]")
private WebElement addtocart;
@FindBy(xpath="//u[text()=\"View Cart\"]")
private WebElement viewcart;
@FindBy(xpath="//tr[contains(@id, 'product')]")
private WebElement productincart;
public Recommendedspage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getrecommendedtxt() {
	return recommendedtxt;
	
}
public WebElement getaddtocart() {
	return addtocart;
	
}
public WebElement getviewcart() {
	return viewcart;

}
public WebElement getproductincart() {
	return productincart;

}
}
