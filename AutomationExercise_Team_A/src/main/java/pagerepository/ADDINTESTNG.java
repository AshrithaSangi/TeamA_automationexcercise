package pagerepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ADDINTESTNG  {
  
    WebDriver driver;
    WebDriverWait wait;
    String name;
    String email;
    String URl;
    
    @Test(priority = 1)
    public void setUp() throws IOException {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        FileInputStream fis=new  FileInputStream("./src/test/resources/property.properties");
        Properties p=new Properties();
        p.load(fis);
        driver.get("URl");
    }
    public void testSignupAndCreateAccount() {
        AddinCheckout a=new AddinCheckout(driver);
        WebElement e = a.getSignup();
        e.click();
        wait.until(ExpectedConditions.visibilityOf(e));
        a.getname().sendKeys("padmavathi");
        a.getemail().sendKeys("shamakuripadmavathi35@gmail.com");
         a.getsignup1().click();
        wait.until(ExpectedConditions.visibilityOf(e));
         a.getpassword().sendKeys("padma@123");
           WebElement d = a.getdays();
           Select s=new Select(d);
           s.selectByIndex(0);
         a.getmonths().sendKeys("June");
         a.getyears().sendKeys("1990");
       a.getfstn().sendKeys("Test");
       a.getlstn().sendKeys("User");
       a.getadd1().sendKeys("123 Test Street");       
       a.getstate().sendKeys("Test State");
       a.getcity().sendKeys("Test City");
       a.getzipcode().sendKeys("12345");
       a.getmobnum().sendKeys("1234567890");
       a.getcreAC().click();
       a.getACtext(); 
        a.getContinue1().click();
        WebElement p = a.getProducts();
        p.click();
    }
    
    
    
   

    }



