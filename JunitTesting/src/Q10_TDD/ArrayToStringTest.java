package Q10_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayToStringTest {

	@Test
	void test() {
		ArrayToString test=new ArrayToString();
		String stringArray[] = {"Apple ", "orange", " banana", " lemon"};
//		String stringArray[] = {"Hello  how are you welcome to Tutorialspoint" };
	   String[] output=test.arrayToString(stringArray);
	   assertEquals(stringArray,output);
	}

}
