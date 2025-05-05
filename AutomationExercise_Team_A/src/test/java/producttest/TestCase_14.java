package producttest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.CartPage;
import pagerepository_A.HomePage;
import pagerepository_A.PaymentPage;
import pagerepository_A.ProductPage;
import pagerepository_A.SignupPage;

public class TestCase_14 extends BasicConfiguration {
		@Test
		public void placrOrderRegisterwhileCheckout() throws InterruptedException {
		//3. Verify that home page is visible successfully
		HomePage hm=new HomePage(driver);
		WebElement verify = hm.getWebsiteforautomationpractice();
		if(verify.isDisplayed()) {
			ProductPage p=new ProductPage(driver);
			//4. Add products to cart
			p.getaddtocart().click();
			Thread.sleep(3000);
			p.getcontinueshopping().click();
			//5. Click 'Cart' button
		WebElement cart = hm.getCart();
		cart.click();
		CartPage cg=new CartPage(driver);
		//6. Verify that cart page is displayed
		if(cart.isDisplayed()) {
		//7. Click Proceed To Checkout
		cg.getProceedToCheckout().click();
		//8. Click 'Register / Login' button
		cg.getRegisterLogin().click();
		SignupPage r=new SignupPage(driver);
		// Signup details
		hm.getname().sendKeys("padmavathi");
		hm.getEmailAddress().sendKeys("swjyothi@gmail.com");
		hm.getSignup().click();

		// 9. Fill all details in Signup and create account
		String username=excelfilelibrary.readData("LoginDetails", 1, 0);
		r.getname().sendKeys(username);
		String Password=excelfilelibrary.readData("LoginDetails",1 , 3);
		r.getpassword().sendKeys("padma@123");
		WebElement day = r.getdays();
		Select sd=new Select(day);
		sd.selectByVisibleText("1");
		WebElement month = r.getmonths();
		Select sm=new Select(month);
		sm.selectByVisibleText("March");
		WebElement year = r.getyears();
		Select sy=new Select(year);
		sy.selectByVisibleText("2020");
		r.getfstn().sendKeys("meena");
		r.getlstn().sendKeys("kaluvala");
		r.getadd1().sendKeys("hyderabad");
		Select sc=new Select(r.getcountry());
		sc.selectByIndex(0);
		r.getcity().sendKeys("kphb");
		r.getstate().sendKeys("telangana");
		r.getzipcode().sendKeys("500845");
		r.getmobnum().sendKeys("8978590217");
		r.getCreateAccount().click();
		// 10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
		if(r.getAccountCreated().isDisplayed()) {
			  System.out.println("account is created");
		r.getContinue().click();
		Thread.sleep(2000);
		CartPage cp=new CartPage(driver);
		//11. Verify ' Logged in as username at top.
		WebElement login = hm.getSignup();
		if(login.isDisplayed()) {
			  System.out.println("homepage is displayed");
		//12.Click 'Cart' button
		 hm.getCart().click();
		 //13. Click 'Proceed To Checkout' button
		cg.getProceedToCheckout().click();
		// 14. Verify Address Details and Review Your Order
		 WebElement addres = cp.getYourbillingaddress();
		 Thread.sleep(2000);
		 if(addres.isDisplayed()) {
				 System.out.println("delivery address page is displayed");
		// 15. Enter description in comment text area and click 'Place Order'
		cg.getPlaceOrder().click();
		// 16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
		 PaymentPage pay=new PaymentPage(driver);
		 Thread.sleep(2000);
		 pay.getnameoncard().sendKeys("padma");
		  pay.getCardNumber().sendKeys("4552776");
		  pay.getMM().sendKeys("12345");
		  pay.getMM().sendKeys("06");
		 pay.getYYYY().sendKeys("2027");
		 //17. Click 'Pay and Confirm Order' button
		 pay.getPayandConfirmOrder().click();
		 Thread.sleep(2000);
		// 18. Verify success message 'Your order has been placed successfully!'
		 WebElement cong = pay.getDownloadInvoice();
		 Thread.sleep(2000);
		if(cong.isDisplayed()){
			System.out.println("successfully payment done");
			Thread.sleep(2000);
			pay.getContinue().click();
		//19. Click 'Delete Account' button
			hm.getDeleteAccount().click();
			//20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
			WebElement delete = hm.getDeleteAccount();
			if(delete.isDisplayed()) {
				System.out.println("accountdeleted");
			}
		}

		 }
		}
		}
		}
		}
		
		
					
	
		}
		}


