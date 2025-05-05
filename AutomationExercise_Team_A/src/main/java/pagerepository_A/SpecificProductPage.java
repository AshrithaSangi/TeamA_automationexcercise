package pagerepository_A;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecificProductPage {
	@FindBy(xpath="//li[text()='Shopping Cart']")
	private WebElement shoppingincart;
	

}
