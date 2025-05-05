package producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;

public class TestCase_16 extends BasicConfiguration {
	@Test
	public void  LoginbeforeCheckout() {
		Reporter.log("checkout");
	}

}
