package producttest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.HomePage;


public class Testcase_10 extends BasicConfiguration {

	@Test
	public void verifysubscriptioninhome() throws InterruptedException {
	HomePage hm=new HomePage(driver);
	//3. Verify that home page is visible successfully
	WebElement t = hm.getWebsiteforautomationpractice();
	if(t.isDisplayed()) {
		//4. Scroll down to footer
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		WebElement subs = hm.getsusbscribe_email();
		//5. Verify text 'SUBSCRIPTION'
		if(subs.isDisplayed()) {
		js.executeScript("arguments[0].scrollIntoView(true)",subs);
		Thread.sleep(1000);
		//6. Enter email address in input and click arrow button
		subs.sendKeys("jyothi@gmail.com");
		Thread.sleep(2000);
		//7. Verify success message 'You have been successfully subscribed!' is visible
		hm.getsubscribe().click();
		WebElement success = hm.getYousuccessfullysubscribed();
		if(success.isDisplayed()) {
			System.out.println("successfully masg displayed");
		}
	}
	}
	}
}

