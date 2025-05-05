package producttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;
import pagerepository_A.CartPage;
import pagerepository_A.HomePage;
import pagerepository_A.ProductPage;

public class TestCase_22 extends BasicConfiguration {
	@Test
	public void AddtocartfromRecommendeditems
() throws InterruptedException {
	
		            // Step 3: Scroll to bottom of the page
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		            // Wait for scroll effects and section to load
		            Thread.sleep(2000);
		            
		            // Step 4: Verify 'RECOMMENDED ITEMS' are visible
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            HomePage h=new HomePage(driver);
		            WebElement recommendedSection = h.getrecommendeditems();

		            if (recommendedSection.isDisplayed()) {
		                System.out.println("Recommended Items section is visible.");
		            } else {
		                System.out.println("Recommended Items section is NOT visible.");
		                return;
		            }

		            // Step 5: Click on 'Add to Cart' of a recommended product
		            WebElement addToCart =h.getAddtocart();
		            addToCart.click();

		            Thread.sleep(2000);

		            // Step 6: Click on 'View Cart' button
		           
		            WebElement viewCart =h.getCart();
		              
		            viewCart.click();

		            // Step 7: Verify product is in cart page
		            CartPage c=new CartPage(driver);
		            WebElement cartProduct =c.getCart();

		            if (cartProduct.isDisplayed()) {
		                System.out.println("Product successfully added to cart and displayed.");
		            } else {
		                System.out.println("Product not found in cart.");
		            }

		       
		            // Close the browser
		            driver.quit();
		        }
		    }



