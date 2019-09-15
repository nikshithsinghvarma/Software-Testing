package Homework4;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	private Problem4Class test;
	
	@Before
	public void setUp () {
		test = new Problem4Class();
	}
	
	@Test
	@FileParameters("src/Homework4/Problem4TestCaseTable.csv")	
	public void test(int testcasenumber,double cart, boolean firstTimeBuyer, boolean goldStatus, int bonusPoints, double taxRate,double total,boolean memberBonus,
String comments) {	
		test.setTotal(0.0);
		test.determineMemberBonus(cart, firstTimeBuyer, goldStatus, bonusPoints, taxRate);
		assertEquals(memberBonus,test.isMemberBonus());
		assertEquals(total,test.getTotal(),0.01);
	}
}