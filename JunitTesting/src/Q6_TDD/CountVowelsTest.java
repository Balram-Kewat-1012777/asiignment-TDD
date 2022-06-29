package Q6_TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;



class CountVowelsTest {

	@Test
	void test() {
		CountVowels test=new CountVowels();
		System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String sentence = sc.nextLine();
	  
		int output=test.str(sentence);
		 assertEquals(3,output);
	}
	@Test
	void test1() {
		CountVowels test=new CountVowels();
		assertTrue(test.str("sentence"));
	 
	}
	private void assertTrue(int str) {
		// TODO Auto-generated method stub
		
	}
}
