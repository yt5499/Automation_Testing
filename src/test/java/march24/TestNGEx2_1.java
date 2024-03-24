package march24;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGEx2_1 {
	@Test
	public void testcase2() {
		throw new SkipException("testcase2 is skipped");
	}

	@Test
	public void testcase1() {
		Assert.fail("Fails");
	}

	@Test
	public void testcase3() {
		Assert.assertTrue(true);
	}
}
