package Homework4;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	private Problem3Class test;
	
	@Before
	public void setUp () {
		test = new Problem3Class();
	}
	
	@Test
	@FileParameters("src/Homework4/Problem3TestCaseTable.csv")	
	public void test(int testcasenumber,double distance,int count,boolean greenLight,boolean yellowLight,boolean redLight,boolean buzzer,boolean brakes,int count1,String comments) {		
		test.setCount(count);
		test.setWarnings(distance);
		assertEquals(greenLight,test.isGreenLight());
		assertEquals(yellowLight,test.isYellowLight());
		assertEquals(redLight,test.isRedLight());
		assertEquals(buzzer,test.isBuzzer());
		assertEquals(brakes,test.isBrakes());
		assertEquals(count1,test.getCount());
	}
}