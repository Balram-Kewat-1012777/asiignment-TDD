package Q7_TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

	@Test
	void test() {
		 PalindromeNumber test=new PalindromeNumber();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter any number to check armstrong number");
	     int  number=sc.nextInt();
		 int output=test.palindromeNumber(number);
		 assertEquals(number,output);
		 
	}

}
