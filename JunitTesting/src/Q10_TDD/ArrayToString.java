package Q10_TDD;

public class ArrayToString {
	
	public String[] arrayToString( String stringArray[]) {

         StringBuffer sb = new StringBuffer();
         for(int i = 0; i < stringArray.length; i++) {
             sb.append(stringArray[i]);
         }
         String str = sb.toString();
//         if(sb.equals(str)) {
//        	 System.out.println("true");
//        	         }
//         else {
//        	 System.out.println("false");
//         }
         System.out.println(str);
        
		return stringArray;
	}
	

}
