package Q6_TDD;

 

public class CountVowels {
	
	public static int str(String sentence) {
		  int count = 0;
//		  String sentence = null;
		 for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         if((ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u') ||
	        		 (ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U')){
	            count ++;
	         }
	      }
		 System.out.println("Number of vowels is "+count);
		return count;
		
	}
	
	 
	}


