package Q4_TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void test() {
		Armstrong test= new Armstrong();
        Scanner sc = new Scanner(System.in);
		System.out.println("enter any number to check armstrong number");
        int  number=sc.nextInt();
		int output=test.ArmstrongNumber(number);
		assertEquals(number,output);
	}

}
