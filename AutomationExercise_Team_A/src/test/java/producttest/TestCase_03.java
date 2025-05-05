package producttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;

public class TestCase_03 extends BasicConfiguration{
	@Test
	public void login_with_invalid_credentials() {
		Reporter.log("login_with_invalid_credentials");
	}

}
