package Q1_TDD;

 

public class Q1 {
	public int HCF(int num1,int num2) {
		int gcd = 0;
  
        int i;
        for(i = 1; i <= num1 && i <= num2; i++)
        {
            if((num1 % i == 0) && (num2 % i == 0))
                gcd = i;
        }
        System.out.println("\nGCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println();
		return gcd;
		
	}

}
