package producttest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.SignupPage;

public class TestCase_26 extends BasicConfiguration{
	@Test
	public void VerifyScrollUpwithoutArrowbuttonandScrollDownfunctionality() throws InterruptedException {
		SignupPage sign=new SignupPage(driver);
		 WebElement text = sign.getSignup();
		 if(text.isDisplayed()) {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	            Thread.sleep(2000);
	            WebElement email = sign.getsusbscribe_email();
	            //verify that page is scrolled to bottom
	            if(email.isDisplayed()) {
	            	System.out.println("the page is scrolled to bottom");
	            }
	            else {
	            	System.out.println("the page is not scrolled bottom");
	            }
	            sign.getscrollUp().click();
	            WebElement text1 = sign.getSignup();
	            //verify that page is scrolled to up using arrow
	            if(text1.isDisplayed()) {
	            	System.out.println("the page scrolledup using arrow");
	            }
	            

	
	   

	}

}
}
