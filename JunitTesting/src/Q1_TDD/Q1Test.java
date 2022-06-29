package Q1_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q1Test {

	@Test
	void test( ) {
		Q1 test=new Q1(); //object create of class name Q1
		int output=test.HCF(20,25);   //the output is 5 so this condition is true and test case will be success
		assertEquals(5,output);
	}
 

}
