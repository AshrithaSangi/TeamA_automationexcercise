package producttest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.CartPage;
import pagerepository_A.HomePage;
import pagerepository_A.ProductPage;

public class TestCase_12 extends BasicConfiguration {

	@Test
	public void addProductInCart() throws InterruptedException {
		
	HomePage hm=new HomePage(driver);
	//3. Verify that home page is visible successfully
	WebElement t = hm.getWebsiteforautomationpractice();
	if(t.isDisplayed()) {
		//4. Click 'Products' button
		hm.getproducts().click();
		Thread.sleep(2000);
		ProductPage pg=new ProductPage(driver);
		//5. Hover over first product and click 'Add to cart'
		pg.getaddtocart().click();
		Thread.sleep(2000);
		//6. Click 'Continue Shopping' button
		pg.getcontinueshopping().click();
		Thread.sleep(3000);
		//7. Hover over second product and click 'Add to cart'
		pg.getaddtocart().click();
		Thread.sleep(2000);
		//8. Click 'View Cart' button
		pg.getviewcart().click();
		CartPage cg=new CartPage(driver);
		//9. Verify both products are added to Cart
	              WebElement cart = cg.getCart();
		if(cart.isDisplayed()) {
			System.out.println("cart iteams displayed");
		}
	}
	
	}

}

