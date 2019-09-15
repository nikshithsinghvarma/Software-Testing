package Homework5;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class test;
	
	@Before
	public void setUp () {
		test = new Problem1Class();
	}
	
	@Test
	@FileParameters("src/Homework5/Problem1TestCaseTable.csv")	
	public void test(int testcasenum, boolean deepDish, double ordAmount, int numPizzas, boolean specialOrderStatus,double total, String comments ) {	
		test.specialOrder(deepDish, ordAmount, numPizzas);
		assertEquals(specialOrderStatus,test.isSpecialOrderStatus());
		assertEquals(total,test.getTotal(),0.01);
		
	}
}