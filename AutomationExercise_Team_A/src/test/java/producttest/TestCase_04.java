package producttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;

public class TestCase_04 extends BasicConfiguration {
	@Test
	public void logout() {
		Reporter.log("user  is logged out");
		
	}

}
