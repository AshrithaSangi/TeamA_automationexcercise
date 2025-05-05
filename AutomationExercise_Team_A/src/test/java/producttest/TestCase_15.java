package producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericrepository.BasicConfiguration;

public class TestCase_15 extends BasicConfiguration {
	@Test
	public void  RegisterbeforeCheckout() {
		Reporter.log("checkout");
	}

}
