package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
 
		JunitTesting test=new JunitTesting();
		int output=test.Square(6);
		assertEquals(37,output);
	}

}
