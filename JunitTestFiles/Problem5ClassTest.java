package Homework4;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	private Problem5Class test;
	
	@Before
	public void setUp () {
		test = new Problem5Class();
	}
	
	@Test
	@FileParameters("src/Homework4/Problem5TestCaseTable.csv")	
	public void test(int testcasenumber,double x,double y,String comments) {	
		test.calcY(x);
		assertEquals(y,test.getY(),0.001);
	}
}