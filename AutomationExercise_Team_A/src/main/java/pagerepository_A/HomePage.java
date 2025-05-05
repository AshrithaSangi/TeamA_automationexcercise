package pagerepository_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class HomePage {
		@FindBy(xpath="//a[text()=\" Signup / Login\"]")
		private WebElement login;
		@FindBy(xpath="//a[text()=' Cart']")
		private WebElement Cart;
		@FindBy(xpath="//a[text()=' Products']")
		private WebElement Products;
		@FindBy(xpath="//a[text()=\" Home\"]")
		private WebElement homepage;
		@FindBy(xpath="//a[@href=\"/test_cases\"]")
		private WebElement testcases;
		@FindBy(xpath="//input[@data-qa=\"login-email\"]")
		private WebElement logintextfeild;
		@FindBy(xpath="//input[@type=\"password\"]")
		private WebElement passwordtextfeild;
		@FindBy(xpath="//input[@data-qa='signup-name']")
		private WebElement name;
		@FindBy(xpath="//input[@data-qa=\"signup-email\"]")
		private WebElement EmailAddress;
		@FindBy(xpath="//input[@id='susbscribe_email']")
		private WebElement susbscribe_email;
		@FindBy(xpath="//img[@alt='Website for automation practice']")
		private WebElement Websiteforautomationpractice;
		@FindBy(xpath="(//button[@type=\"submit\"])[2]")
		private WebElement Signup;
		@FindBy(xpath="//a[text()=' Logout']")
		private WebElement Logout;
		@FindBy(xpath="//h2[text()='Payment']")
		private WebElement Payment;
		@FindBy(xpath="//a[text()=' Delete Account']")
		private WebElement  DeleteAccount;
		@FindBy(xpath="//a[text()='Continue']")
		private WebElement  Continue;
		@FindBy(xpath="//h2[text()='recommended items']")
		private WebElement recommendeditems;
		@FindBy(xpath="(//a[text()='Add to cart'])[1]")
		private WebElement Addtocart;
		@FindBy(xpath="//div[contains(text(), 'You have been successfully subscribed!')]")
		private WebElement Yousuccessfullysubscribed ;
		

		public HomePage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		public WebElement getlogin() {
			return login;
		}
		public WebElement getCart() {
			return Cart;
		}
		public WebElement homepage() {
			return homepage;
		}
		public WebElement getproducts() {
			return  Products;
		}
		public WebElement getlogintextfeild() {
			return logintextfeild;
		}
		public WebElement getpasswordtextfeild() {
			return passwordtextfeild;
		}
		public WebElement getname() {
			return  name;
		}
		public WebElement getEmailAddress() {
			return EmailAddress;
		}
		public WebElement getsusbscribe_email() {
			return susbscribe_email;
		}
		public WebElement getWebsiteforautomationpractice() {
			return Websiteforautomationpractice;
		}
		public WebElement getSignup() {
			return Signup;
		}
		public WebElement getLogout() {
			return Logout;
		}
		public WebElement getPayment() {
			return Payment;
		}
		public WebElement getDeleteAccount() {
			return DeleteAccount;
		}
		public WebElement getContinue() {
			return Continue;
		}
		public WebElement getrecommendeditems() {
			return recommendeditems;
		}
		public WebElement getAddtocart() {
			return Addtocart;
		}
		public WebElement getsubscribe() {
			// TODO Auto-generated method stub
			return null;
		}
		public WebElement getYousuccessfullysubscribed() {
			// TODO Auto-generated method stub
			return Yousuccessfullysubscribed;
		}
		
		
		
		
		
		}



