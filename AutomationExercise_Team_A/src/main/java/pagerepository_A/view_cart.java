package pagerepository_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class view_cart   {
	
		@FindBy(xpath="//h2[text()=\"Blue Top\"]")
		private WebElement details;
		@FindBy(id="quantity")
		private WebElement qutyinc;
		@FindBy(xpath="//button[@type=\"button\"]")
		private WebElement addcrtbtn;
		@FindBy(xpath="//u[text()=\"View Cart\"]")
		private WebElement vewcrtbtn;
public view_cart(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		public WebElement getDetails() {
			return details;
		}
		public WebElement getQutyinc() {
			return qutyinc;
		}
		public WebElement getAddcrtbtn() {
			return addcrtbtn;
		}
		public WebElement getAVewcrtbtn() {
			return vewcrtbtn;
		}
		
	}


