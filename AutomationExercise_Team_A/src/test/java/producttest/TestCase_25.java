package producttest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.SignupPage;

public class TestCase_25 extends BasicConfiguration {

	@Test
	public void m1() throws InterruptedException {
		SignupPage sign=new SignupPage(driver);
		 WebElement text = sign.getSignup();
		 if(text.isDisplayed()) {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	            Thread.sleep(2000);
	            WebElement email = sign.getsusbscribe_email();
	            if(email.isDisplayed()) {
	            	System.out.println("the page is scrolled to bottom and subcribed email is displayed");
	            }
	            else {
	            	System.out.println("the page is not scrolled bottom and subcribed email is not displayed ");
	            }
	            js.executeScript("window.scrollTo(0, 0);");
	            Thread.sleep(2000);
	            WebElement text1 = sign.getSignup();
	            if(text1.isDisplayed()) {
	            	System.out.println("the page scrolledup without is using arrow");
	            }
	            driver.close();

	}

}
}