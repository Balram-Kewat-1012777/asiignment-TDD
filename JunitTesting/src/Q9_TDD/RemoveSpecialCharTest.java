package Q9_TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class RemoveSpecialCharTest {

	@Test
	void test() {
		RemoveSpecialChar test=new RemoveSpecialChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to remove space,number and special character");
		String s=sc.nextLine();
		String output=test.str(s);
	}

}
