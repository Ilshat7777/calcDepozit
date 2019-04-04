package calcDepozit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class kalcTest4 {

	@Test
	public void ValidTest() {
		int a = (int)Math.round(kalc.calcSumProc(205000, 48, (double)15.0/100));
		int b =(int) Math.round(328000);
		
		Assert.assertEquals(a,b);
	
	}
}
