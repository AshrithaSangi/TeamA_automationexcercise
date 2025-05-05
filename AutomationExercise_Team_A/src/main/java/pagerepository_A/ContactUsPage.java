package pagerepository_A;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {
	@FindBy(xpath="//h2[text()=\"Contact \"]")
	private WebElement contactus;
    @FindBy(xpath="//input[@name=\"name\"]")
    private WebElement name;
    @FindBy(xpath="//input[@name=\"name\"]")
    private WebElement email;
    @FindBy(xpath="//input[@name=\"upload_file\"]")
    private WebElement upload_file;
    @FindBy(xpath="//input[@type=\"submit\"]")
    private WebElement submit;
    
}
