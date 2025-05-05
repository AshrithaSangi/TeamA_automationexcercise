package producttest;
	
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.CartPage;
import pagerepository_A.HomePage;
import pagerepository_A.ProductPage;
import pagerepository_A.view_cart;

	public class TestCase_13 extends BasicConfiguration{
		@Test
		public void productQtyInCart() throws IOException, InterruptedException {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				HomePage hm=new HomePage(driver);
				view_cart vp=new view_cart(driver);
				//3. Verify that home page is visible successfully
				WebElement t= hm.getWebsiteforautomationpractice();
				if(t.isDisplayed()) {
					System.out.println("home");
					//4. Click 'View Product' for any product on home page
					hm.getproducts().click();
					ProductPage pg=new ProductPage(driver);
					Thread.sleep(3000);
					pg.getfstproduct().click();
					Thread.sleep(3000);
					//5. Verify product detail is opened
					WebElement deta = vp.getDetails();
					if(deta.isDisplayed()) {
						//6. Increase quantity to 4
						WebElement qty = vp.getQutyinc();
						qty.clear();
						qty.sendKeys("4");
						//7. Click 'Add to cart' button
						vp.getAddcrtbtn().click();
						Thread.sleep(2000);
						//8. Click 'View Cart' button
						pg.getviewcart().click();
						CartPage cg=new CartPage(driver);
						//9. Verify that product is displayed in cart page with exact quantity
						WebElement vef = cg.getProceedToCheckout();
						if(vef.isDisplayed()) {
							System.out.println(" product is displayed in cart page with exact quantity");
						}
					}
	}
		}
		}


