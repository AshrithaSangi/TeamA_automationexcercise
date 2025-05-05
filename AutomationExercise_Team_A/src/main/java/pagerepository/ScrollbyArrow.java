package pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollbyArrow {
	@FindBy(xpath="//img[@alt='Website for automation practice']")
	private WebElement Autforprac;
	@FindBy(xpath="//h2[contains(text(),'Subscription')]")
	private WebElement subscribe;
	@FindBy(xpath="//h2[contains(text(),'Full-Fledged practice website for Automation Engineers')]")
	private WebElement websiteconfirm;
	
	

}
