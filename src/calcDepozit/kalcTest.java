package calcDepozit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class kalcTest {

	@Test
	public void ValidTest() {
		int a = (int)Math.round(kalc.calcSumProc(77777, 36, (double)10.0/100));
		int b =(int) Math.round(101110);
		
		Assert.assertEquals(a,b);
	}
	

}
