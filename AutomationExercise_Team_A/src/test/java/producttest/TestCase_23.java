package producttest;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.CartPage;
import pagerepository_A.HomePage;
import pagerepository_A.ProductPage;
import pagerepository_A.SignupPage;

import java.time.Duration;

	public class TestCase_23 extends BasicConfiguration {

		@Test
		public void Verifyaddressdetailsincheckoutpage() {

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			Reporter.log("testcase 23");
		
	            // 3. Click 'Signup / Login' button
	             SignupPage sign=new SignupPage(driver);
	              sign.getSignup().click();
	              if(sign.getSignup().isDisplayed()) {
	            	  System.out.println("signup page is displayed");
	              }

	            // 4. Fill all details in Signup and create account
	              String username=excelfilelibrary.readData("LoginDetails", 1, 0);
	            sign.getname().sendKeys(username);
	            
	            String email=excelfilelibrary.readData("LoginDetails", 1, 1);
	            sign.getemail().sendKeys(email);
	            
	            sign.getsignup1().click();
	            

	            // Fill account details

          sign.getpassword().sendKeys("padma@123");	
    Select sd=new Select(sign.getdays());
		    	  sd.selectByIndex(0);
		    	  Select sm=new Select(sign.getmonths());
		    	  sm.selectByIndex(1);
		    	  Select sy=new Select(sign.getyears());		    
		    	  sy.selectByIndex(2);
		    	  sign.getfstn().sendKeys("meena");
		    	  sign.getlstn().sendKeys("kaluvala");
		    	  sign.getadd1().sendKeys("hyderabad");
		    	  Select sc=new Select(sign.getcountry());
	    	  sc.selectByIndex(0);
		    	  sign.getcity().sendKeys("kphb");
		    	  sign.getstate().sendKeys("telangana");
		    	  sign.getzipcode().sendKeys("500845");
	    	  sign.getmobnum().sendKeys("8978590217");
	    	  sign.getCreateAccount().click();
//	            // 5. Verify 'ACCOUNT CREATED!' and click 'Continue'
//	                HomePage h=new HomePage(driver);
//	                //WebElement con = h.getContinue();
//	                //h.getContinue().click();
//	               // if(con.isDisplayed()) {
//	                	System.out.println("account created");
//                        
//
//	            // 6. Verify 'Logged in as username'
//	                //	if (driver.getPageSource().contains("Logged in as " +sign.getname().getText())) {
//	              //  System.out.println("User logged in successfully.");
//            // 7. Add products to cart
//	            h.getproducts().click();
//	            ProductPage p=new ProductPage(driver);
//            p.getcontinueshopping();
//	            // 8. Click 'Cart' button
//	                     CartPage c1=new CartPage(driver);
//	                     c1.getCart().click();
//	            // 9. Verify that cart page is displayed
//	            if (driver.getPageSource().contains(c1.getCart().getText())) {
//	                System.out.println("Cart page displayed successfully.");
//	             
//
//	            // 10. Click Proceed To Checkout
//             c1.getProceedToCheckout();
//	            // 11. Verify delivery address
//	                WebElement deliveryAddress = c1.getYourdeliveryaddress();
//	            if (deliveryAddress.getText().contains("Yourdeliveryaddress")) {
//	                System.out.println("Delivery address verified.");
//	            } else {	                System.out.println("Delivery address incorrect.");
//	            }
//
//	            // 12. Verify billing address
//	            WebElement billingAddress = c1.getYourbillingaddress();
//            if (billingAddress.getText().contains("Yourbillingaddress")) {
//	                System.out.println("Billing address verified.");

            // 13. Click 'Delete Account' button
//	            h.getDeleteAccount().click();
//
//	            // 14. Verify 'ACCOUNT DELETED!' and click 'Continue'
//	                if (driver.getPageSource().contains("ACCOUNT DELETED!")) {
//	                System.out.println("Account deleted successfully.");
//	           
//	           h.getContinue().click();
//
//	            // 15. Close the browser
//	             
//	            driver.quit();
//	            }
	
	            
	                	}
	                }
		
	
	                
	            
	            
	       

	            
	    
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	           
	            
	            
	            
	            
	            
	            
	            
	            
	            
	   



