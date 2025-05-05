package pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollbyArrow2 {
@FindBy(xpath="//h2[contains(text(),'Subscription')]")
private WebElement subsc;
@FindBy(id="scrollUp")
private WebElement scrollup;
@FindBy(xpath="//h2[contains(text(),'Full-Fledged practice website for Automation Engineers')]")
private WebElement  Auforprac;



}
