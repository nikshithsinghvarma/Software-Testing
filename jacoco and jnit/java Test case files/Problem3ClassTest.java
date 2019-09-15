package Homework5;
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
	@FileParameters("src/Homework5/Problem3TestCaseTable.csv")	
	public void test(int testCaseNumber,int boxInCarNum, int rrCarNum, int shipmentNum,int expectedBoxNumber, String Comments) {
	assertEquals(expectedBoxNumber ,test.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum));
	
		
		
	}
}