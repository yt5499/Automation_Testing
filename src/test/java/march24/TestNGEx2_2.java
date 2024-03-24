package march24;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGEx2_2 {
	@Test(priority = 1)
	public void testcase2() {
		throw new SkipException("testcase2 is skipped");
	}

	@Test(priority = 2)
	public void testcase1() {
		Assert.fail();
	}

	@Test(priority = 0)
	public void testcase3() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3)
	public void testcase4() {
		Assert.fail();
	}
}
