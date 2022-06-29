package Q9_TDD;

public class RemoveSpecialChar {
	
	public String str(String s) {
		
		String resultStr="";  
		//loop execute till the length of the string   
		for (int i=0;i<s.length();i++)  
		{  
		//comparing alphabets with their corresponding ASCII value  
		if (s.charAt(i)>64 && s.charAt(i)<=122)   
		{  
		  
		resultStr=resultStr+s.charAt(i);  
		}  
		}  
		System.out.println(resultStr);  
	 
		return resultStr;
		
	}

}
