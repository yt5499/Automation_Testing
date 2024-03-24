package march24;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGEx2 {
	@Test
	public void c() {
		Assert.fail();
	}
	
	@Test
	public void a() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void b() {
		throw new SkipException("Testcase b skipped");
	}
}
