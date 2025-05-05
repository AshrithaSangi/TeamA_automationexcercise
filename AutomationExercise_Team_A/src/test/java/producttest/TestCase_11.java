package producttest;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.HomePage;

	public class TestCase_11 extends BasicConfiguration{
		@Test
		public void subscriptionincartpage() throws InterruptedException {
		HomePage hm=new HomePage(driver);
		//3. Verify that home page is visible successfully
		WebElement t = hm.getWebsiteforautomationpractice();
		if(t.isDisplayed()) {
			//4. Click 'Cart' button
			hm.getCart().click();
			//5. Scroll down to footer
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Thread.sleep(3000);
		//6. Verify text 'SUBSCRIPTION'
			WebElement subs = hm.getsusbscribe_email();
			js.executeScript("arguments[0].scrollIntoView(true)",subs);
			if(subs.isDisplayed()) {
			//7. Enter email address in input and click arrow button
			subs.sendKeys("jyothi@gmail.com");
			Thread.sleep(2000);
			hm.getsubscribe().click();
		//	8. Verify success message 'You have been successfully subscribed!' is visible
			WebElement success = hm.getYousuccessfullysubscribed();
			if(success.isDisplayed()) {
				System.out.println("successfully masg displayed");
			}
			}	
	}
		}

	}

