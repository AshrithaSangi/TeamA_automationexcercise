package pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
@FindBy(xpath="//a[@href=\"/login\"]")
private WebElement login;
@FindBy(xpath="//a[@href=\"/view_cart\"]")
private WebElement viewcart;
@FindBy(xpath="//a[@href=\"/products\"]")
private WebElement products;
@FindBy(xpath="//a[text()=\" Home\"]")
private WebElement homepage;
@FindBy(xpath="//a[@href=\"/test_cases\"]")
private WebElement testcases;
@FindBy(xpath="//input[@data-qa=\"login-email\"]")
private WebElement logintextfeild;
@FindBy(xpath="//input[@type=\"password\"]")
private WebElement passwordtextfeild;
@FindBy(xpath="//input[@placeholder=\"Name\"]")
private WebElement nametextfld;
@FindBy(xpath="//input[@data-qa=\"signup-email\"]")
private WebElement signupemailtextfld;

}
