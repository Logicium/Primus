package Source;

import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;

public class PrimeTest {
	
	PrimeChecker pc;
	@Before
	public void setUp() throws Exception{
		pc = new PrimeChecker();
	}
	
	@Test
	public void testIsPrime() {
		Assert.assertEquals(true,pc.isPrime(7));
	}
	
	@Test
	public void testForwardRangeOrder() {
		Assert.assertEquals(7,(Object)pc.generate(6,8).get(0));
	}
	
	@Test
	public void testBackwardRangeOrder() {
		Assert.assertEquals(7,(Object)pc.generate(8,6).get(0));
	}
	
	@Test
	public void testRange7900() {
		int[] ints = Arrays.stream(pc.generate(7900, 7920).toArray()).mapToInt(o -> (int)o).toArray();
		Assert.assertArrayEquals( new int[]{7901,7907,7919},ints);
	}
}
