package Q7_TDD;

public class PalindromeNumber {
	
	public int palindromeNumber(int num) {
	  int r,sum=0,temp; 
	
 
	 
	  temp=num;    
	  while(num>0){    
	   r=num%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   num=num/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");
	return sum;    
	}

}

