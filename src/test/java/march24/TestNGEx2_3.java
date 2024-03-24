package march24;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGEx2_3 {
	@Test(priority = 0, alwaysRun = false)
	public void testcase2() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 1)
	public void testcase1() {
		throw new SkipException("Skips");
	}
}
