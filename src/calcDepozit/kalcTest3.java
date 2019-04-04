package calcDepozit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class kalcTest3 {

	@Test
	public void ValidTest() {
		int a = (int)Math.round(kalc.calcSumProc(85000, 24, (double)20.0/100));
		int b =(int) Math.round(119000);
		
		Assert.assertEquals(a,b);
	}

}
