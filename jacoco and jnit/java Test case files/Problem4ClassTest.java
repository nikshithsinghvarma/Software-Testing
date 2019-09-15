package Homework5;
import static org.junit.Assert.*;

import org.easymock.EasyMock;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	private Problem4Class test;
	Problem4ServerData mockobj;
	
	@Before
	public void setUp () {
		test = new Problem4Class();
		mockobj = EasyMock.strictMock(Problem4ServerData.class);
	}
	
	@Test
	@FileParameters("src/Homework5/Problem2TestCaseTable.csv")	
	public void test(int testcasenum, boolean existingMember, boolean validDiscount, int memberPoints,double total,double expectedTotal) {	
		EasyMock.expect(mockobj.getMemberPoints()).andReturn(memberPoints);
		EasyMock.replay(mockobj);
		assertEquals(expectedTotal,test.calcTotal(total,existingMember,validDiscount,mockobj),0.01);
	}
}