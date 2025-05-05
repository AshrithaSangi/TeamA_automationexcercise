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

public class TestCase_24 extends BasicConfiguration {

	@Test
	public void DownloadInvoiceafterpurchaseorder
() throws InterruptedException {
		            // Verify home page is visible
		HomePage h=new HomePage(driver);
		 WebElement logo =h. getWebsiteforautomationpractice();
		 if(logo.isDisplayed()) {
			 System.out.println("homepage is displayed");
		            // Add product to cart
			 h.getproducts().click();
			 System.out.println("clicked on products");

		            // Verify cart page
			 ProductPage p=new ProductPage(driver);
		      WebElement img = p.getsearch_product();
		      if(img.isDisplayed()) {
		    	  System.out.println("product page is displayed");
		      }
		      else {
		    	  System.out.println("product page is displayed");
		      }
		      
//		      Thread.sleep(10);
//			     p.getaddtocart().click();
//			     Thread.sleep(10);
//			       p.getcontinueshopping().click();
//			     
//			      System.out.println("product is added to cart");
//			      p.getviewcart().click();
//		            // Proceed to Checkout
//			      WebElement cart = p.getProceedToCheckout();
//			      if(cart.isDisplayed()) {
//			    	  System.out.println("the cart is displayed with the product");
//			    	  cart.click();
//
//		            // Click Register / Login
//			    	  p.getRegister().click();
//                   Thread.sleep(2000);
//		            // Signup details
//			    	  h.getname().sendKeys("padmavathi");
//			    	  h.getEmailAddress().sendKeys("padmavathis454@gmail.com");
//			    	  h.getSignup().click();
//
//		            // Fill Signup form
//			    	  SignupPage sign=new SignupPage(driver);
//			    	  sign.getpassword().sendKeys("padma@123");
//			    	  Select sd=new Select(sign.getdays());
//			    	  sd.selectByIndex(0);
//			    	  Select sm=new Select(sign.getmonths());
//			    	  sm.selectByValue("March");
//			    	  Select sy=new Select(sign.getyears());
//			    	  sy.selectByIndex(2);
//			    	  sign.getfstn().sendKeys("meena");
//			    	  sign.getlstn().sendKeys("kaluvala");
//			    	  sign.getadd1().sendKeys("hyderabad");
//			    	  Select sc=new Select(sign.getcountry());
//			    	  sc.selectByIndex(0);
//			    	  sign.getcity().sendKeys("kphb");
//			    	  sign.getstate().sendKeys("telangana");
//			    	  sign.getzipcode().sendKeys("500845");
//			    	  sign.getmobnum().sendKeys("8978590217");
//			    	  sign.getCreateAccount().click();
//
//		            // Verify account creation
//			    	  if(sign.getAccountCreated().isDisplayed()) {
//			    		  System.out.println("account is created");
//			    	  }
//
//			    	  sign.getContinue();
//
//		            // Verify logged in
//			    	  WebElement login = h.getlogin();
//		    		  
//			    	  if(login.isDisplayed()) {
//			    		  System.out.println("homepage is displayed");
//			    	  }
//
//		            // Back to cart and checkout
//			    	  h.getLogout();
//			    		 h.getCart().click();
//			    		 CartPage c=new  CartPage(driver);
//			    		 c.getProceedToCheckout().click();
//		            // Verify address and review order
//			    		 if(c.getYourdeliveryaddress().isDisplayed()) {
//			    			 System.out.println("delivery address page is displayed");
//			    		 }
//
//		            // Add comment and place order
//			    		 c.getPlaceOrder().click();
//
//		            // Enter payment details
//			    		 PaymentPage pay=new PaymentPage(driver);
//			    		 pay.getnameoncard().sendKeys("padma");
//			    	     pay.getCardNumber().sendKeys("4552776");
//			    	     pay.getMM().sendKeys("06");
//			    	     pay.getYYYY().sendKeys("2027");
//		                 pay.getPayandConfirmOrder().click();
//
//		            // Confirm order success
//		             pay.getsuccessalert();
//		             pay.getPayandConfirmOrder().click();
//
//		            // Download Invoice
//		             
//		             pay.getDownloadInvoice().click();
//		          
//
//		            // Continue
//		            pay.getContinue();
//		            // Delete Account
//		            h.getDeleteAccount().click();
//		            System.out.println("Account is deleted");
//                    h.getContinue();
//                   WebElement text=h.getWebsiteforautomationpractice();
//                   if(text.isDisplayed()) {
//                	   System.out.println("home page is displayed");
//                   }

		 
	}
}
	}

