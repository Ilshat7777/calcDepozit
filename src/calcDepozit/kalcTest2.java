package calcDepozit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class kalcTest2 {

	@Test
	public void ValidTest() {
		int a = (int)Math.round(kalc.calcSumProc(32000, 24, (double)10.0/100));
		int b =(int) Math.round(38400);
		
		Assert.assertEquals(a,b);
	}

}
